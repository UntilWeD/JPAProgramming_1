package com.untilwed.studyingjpa.model.ch5_model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MemberC5 {

    @Id @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    //연관관계 매핑
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private TeamC5 team;

    public MemberC5(String id, String username) {
        this.id = id;
        this.username = username;
    }


    //연관관계설정

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TeamC5 getTeam() {
        return team;
    }

    //객체간의 양방향성을 위한 코드 리팩토링
    public void setTeam(TeamC5 team) {
        //기존 팀과 관계를 제거
        if(this.team != null){
            this.team.getMembers().remove(this);
        }

        this.team = team;
        team.getMembers().add(this);
    }
}
