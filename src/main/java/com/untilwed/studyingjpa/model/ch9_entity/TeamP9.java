package com.untilwed.studyingjpa.model.ch9_entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamP9 {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    @Column(name = "TEAM_NAME")
    private String name;

    @OneToMany(mappedBy = "team")
    List<MemberP9> members = new ArrayList<MemberP9>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberP9> getMembers() {
        return members;
    }

    public void setMembers(List<MemberP9> members) {
        this.members = members;
    }
}
