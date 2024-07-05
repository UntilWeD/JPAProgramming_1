package com.untilwed.studyingjpa;

import com.untilwed.studyingjpa.model.ch2_entity.MemberC2;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudyingjpaApplicationTests {

	@Autowired
	EntityManagerFactory emf;

	@Test
	void contextLoads() {
		//[엔티티 매니저] - 생성
		EntityManager em = emf.createEntityManager();
		//[트랜잭션] - 획득
		EntityTransaction tx = em.getTransaction();

		try{

			//트랜잭션 시작
			tx.begin();
			logic(em);
			tx.commit();

		} catch (Exception e){
			tx.rollback(); // [트랜잭션] - 롤백
		} finally {
			em.close();    // [엔티티 매니저] - 종료
		}
		emf.close();       // [엔티티 매니저 팩토리] - 종료
	}

	//비즈니스 로직
	private static void logic(EntityManager em){

		String id = "id1";
		MemberC2 member = new MemberC2();
		member.setId(id);
		member.setUsername("지한");
		member.setAge(2);

		//등록
		//1차 캐시에서 저장됨
		//아직 insert sql을 보내지 않고 커밋하는 순간 데이터베이스에 insert sql을 보낸다.
		//그럼 이전까지는 쓰기 지연 SQL 저장소인 내부 쿼리 저장소에 모아둔다.
		em.persist(member);

		//수정
		member.setAge(20);

		//한건 조회
		//1차 캐시에서 우선적으로 @Id로 데이터베이스의 식별키값을 기반으로해서 찾는다.
		MemberC2 findMember = em.find(MemberC2.class, id);
		System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());

		//목록 조회 -- JPQL은 데이터베이스를 전혀 알지 못한다!
		// jpql을 통한 쿼리로 자동으로 플러싱 된다. (대부분 FlushModeType.COMMIT으로 커밋할때만 플러시를 한다.)
		List<MemberC2> members = em.createQuery("select m from MemberC2 m", MemberC2.class).getResultList();
		System.out.println("members.size=" + members.size());

		//삭제
		em.remove(member);

		//영속상태 -> 준영속상태(영속성컨텍스트로 부터 detach된 상태)
		//해당 엔티티를 관리하지 말라는 것으로 이 메소드를 호출하면 1차캐시부터 쓰기 지연 SQL저장소(쓰기지연저장소) 까지 해당 엔티티를 관리하기
		//위한 모든 정보가 제거된다.
		em.detach(member);

		//이렇게 준영속된 상태에서는 변경감지가 동작하지 않아 변경해도 반영되지 않는다.
		//!! 근데 개발자가 직접 준영속상태로 만드는 일은 드물다.

		//다시 준영속상태의 member를 병합시켜본다.
		em.merge(member);


	}


}
