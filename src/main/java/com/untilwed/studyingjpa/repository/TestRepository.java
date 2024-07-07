package com.untilwed.studyingjpa.repository;

import com.untilwed.studyingjpa.model.ch9_entity.AddressP9;
import com.untilwed.studyingjpa.model.ch9_entity.MemberP9;
import com.untilwed.studyingjpa.model.ch9_entity.TeamP9;
import com.untilwed.studyingjpa.model.ch9_entity.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestRepository {


    private final EntityManager em;

    //조회대상이 명확이 Member엔티티일때 TypeQuery를 사용할 수 있다.
    public void usingTypeQuery(){
        TypedQuery<MemberP9> query = em.createQuery("SELECT m From MemberP9 m", MemberP9.class);

        List<MemberP9> resultList = query.getResultList();
        for(MemberP9 member : resultList){
            System.out.println("member = " + member);
        }
    }

    // 여러 엔티티나 컬럼을 선택할 때는 반환할 타입이 명확하지 않으므로 Query객체를 사용해야 한다.
    public void usingQuery(){
        Query query = em.createQuery("SELECT m.username, m.age from MemberP9 m", MemberP9.class);

        List resultList = query.getResultList();
        for(Object o : resultList){
            Object[] result = (Object[]) o; // 결과가 둘 이상이면 Object[] 반환
            System.out.println("username = " + result[0]);
            System.out.println("age = " +result[1]);
        }
    }

    //이름 기준 파라미터 사용하기
    public void usingNamedParameters(){
        String usernameParam = "User1";

        TypedQuery<MemberP9> query = em.createQuery("SELECT m FROM MemberP9 m " +
                "WHERE m.username = :username", MemberP9.class);

        query.setParameter("username", usernameParam);
        List<MemberP9> resultList = query.getResultList();
    }

    //위치기준 파라미터 보다는 이름 기준 파라미터 바인딩 방식을 사용하는 것이 더 명확하다!
    //만약 파라미터 바인딩식으로 하지 않고 임의의 문자열을 더하는 식으로 한다면 sql인젝션을 당할 수 있다.

    //임베디드 타입 프로젝션
    public void withEmbeddedType(){
        String query = "SELECT o.address FROM OrderP9 o";
        List<AddressP9> address = em.createQuery(query, AddressP9.class).getResultList();
    }

    //여러 프로젝션 Object[]로 조회
    public void withProjections(){
        List<Object[]> resultList = em.
                createQuery("SELECT m.username, m.age FROM MemberP9 m").getResultList();

        for(Object[] row : resultList){
            String username = (String) row[0];
            Integer age = (Integer) row[1];
        }
        // 만약 여러 엔티티를 list에 담는다면 Object[0]에 row[0], row[1] 이런식으로 query문순서대로
        // 담기니 확인하자.
    }

    //프로젝션과 오브젝트 생성
    public void entityToDTO(){
        //1번째 방법
        List<Object[]> resultList = em.createQuery("SELECT m.username, m.age FROM MemberP9 m")
                .getResultList();

        //객체변환작업
        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
        for(Object[] row : resultList){
            UserDTO userDTO = new UserDTO((String) row[0], (String) row[1]);
            userDTOs.add(userDTO);
        }


        //2번째 방법
        TypedQuery<UserDTO> query = em.createQuery("SELECT new com.untilwed.studyingjpa." +
                "model.ch9_entity.UserDTO(m.username, m.age) FROM MemberP9 m", UserDTO.class);

        List<UserDTO> resultList2 = query.getResultList();
    }

    //페이징
    public void usingPaging(){
        TypedQuery<MemberP9> query = em.createQuery("SELECT m From MemberP9 m " +
                "ORDER BY m.username DESC", MemberP9.class);

        query.setFirstResult(10);
        query.setMaxResults(20);
        query.getResultList();

        //페이징 쿼리를 최적화하고 싶다면 네이티브 SQL을 직접 사용해야 한다.
    }

    //Inner JOIN -> 복습필요
    public void usingInnerJoin(){
        String teamName = "팀A";
        String query = "SELECT m FROM MemberP9 m INNER JOIN m.team t "
                + "WHERE t.name = :teamName";

        List<MemberP9> members = em.createQuery(query, MemberP9.class)
                .setParameter("teamName", teamName)
                .getResultList();
    }

    //Fetch JOIN
    public void usingFetchJoin(){
        String jpql = "select m from MemberP9 m join fetch m.team";

        List<MemberP9> members = em.createQuery(jpql, MemberP9.class).getResultList();

        for(MemberP9 member : members){
            //패치 조인으로 회원가 팀을 함께 조회해서 지연 로딩 발생 안함
            System.out.println("username = " + member.getName() + " ,"
              + "teamname = " + member.getTeam().getName());
        }
    }

    //Collection Fetch Join
    public void usingCollectionFetchJoin(){
        String jpql = "SELECT t from TeamP9 t join fetch t.members where t.name = '팀A'";
        List<TeamP9> teams = em.createQuery(jpql, TeamP9.class).getResultList();

        for(TeamP9 team : teams){

            System.out.println("teamname = " + team.getName() + ", team = " +team);

            for(MemberP9 member : team.getMembers()){

                //페치조인으로 팀과 회원을 함께 조회해서 지연 로딩 발생 안 함
                System.out.println(
                        "->username = " + member.getName() + ", member = " + member);
            }
        }
    }

    //페치 조인은 실무에서 자주 사용되나 모든 것을 페치 조인으로 해결할 수는 없다.
    // 페치조인은 객체 그래프를 유지할 때 사용하면 효과적이다. 반면에 여러 테이블을 조인해서 엔티티가 가진 모양이 아닌
    // 전혀 다른 결과를 내야 한다면 억지로 페치 조인을 사용하기 보다는 여러 테이블에서 필요한 필드들만 조회해서 DTO로
    // 반환하는 것이 더 효과적일 수 있다.

    //엔티티 직접 사용 시 키값 사용
    public void usingEntity(){
        MemberP9 member = new MemberP9();

        String qlString = "select m from MemberP9 m where m = :member";
        List resultList = em.createQuery(qlString)
                .setParameter("member", member)
                .getResultList();
    }


    //NamedQuery 사용
    //말 그대로 쿼리에 이름을 부여해서 사용하는 방법이다.
    //NamedQueries로 더 많은 쿼리들을 만들 수 있다. 그렇지만 그냥 XML에서 사용하는 것이 현실적인 대안이다.
    //(만약 XML파일을 사용한다면 android.properties에 선언을 해야한다.
    public void usingNamedQuery(){
        List<MemberP9> resultList = em.createNamedQuery("MemberP9.findByUsername", MemberP9.class)
                .setParameter("username", "회원1")
                .getResultList();
    }


}
