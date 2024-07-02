package com.untilwed.studyingjpa;

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
		Member member = new Member();
		member.setId(id);
		member.setUsername("지한");
		member.setAge(2);

		//등록
		em.persist(member);

		//수정
		member.setAge(20);

		//한건 조회
		Member findMember = em.find(Member.class, id);
		System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());

		//목록 조회
		List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
		System.out.println("members.size=" + members.size());

		//삭제
		em.remove(member);
	}


}
