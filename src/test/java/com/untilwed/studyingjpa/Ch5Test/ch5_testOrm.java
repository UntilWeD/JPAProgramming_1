package com.untilwed.studyingjpa.Ch5Test;

import com.untilwed.studyingjpa.model.ch5_entity.MemberC5;
import com.untilwed.studyingjpa.model.ch5_entity.TeamC5;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ch5_testOrm {

    @Autowired
    private EntityManager em;


    @Test
    void test(){
        TeamC5 team1 = new TeamC5("team1", "팀1");
        em.persist(team1);

        MemberC5 member1 = new MemberC5("member1", "회원1");
        member1.setTeam(team1); //양방향 설정
        em.persist(member1);

        MemberC5 member2 = new MemberC5("member2", "회원2");
        member2.setTeam(team1);
        em.persist(member2);
    }



}
