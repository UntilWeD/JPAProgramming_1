package com.untilwed.studyingjpa.model.ch5_model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamC5 {

    public TeamC5(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<MemberC5> members = new ArrayList<MemberC5>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberC5> getMembers() {
        return members;
    }

    public void setMembers(List<MemberC5> members) {
        this.members = members;
    }
}
