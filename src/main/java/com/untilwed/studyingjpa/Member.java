package com.untilwed.studyingjpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 테이블 매핑 객체
@Table(name = "MEMBER") // 매핑할 테이블 정보
public class Member {

    @Id // 식별자 필드
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String username;

    //매핑정보가 없는 필드
    private Integer age;

    //Getter, Setter

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
