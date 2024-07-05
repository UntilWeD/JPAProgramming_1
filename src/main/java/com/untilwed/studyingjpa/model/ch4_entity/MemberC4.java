package com.untilwed.studyingjpa.model.ch4_entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="MEMBER_C4", uniqueConstraints = @UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"}
))

public class MemberC4 {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", nullable = false, length = 10)
    private String username;

    private Integer age;

    //==추가==
    //자바의 enum을 사용하기 위해 Enumerated 어노테이션을 사용해서 매핑해야 한다.
    @Enumerated(EnumType.STRING) //이름 그대로 저장하는데 ORDINAL보다는 이걸로 저장하자
    private RoleType roleType;

    //자바의 날짜 타입은 @Temporal을 사용해서 매핑한다.
    @Temporal(TemporalType.TIMESTAMP) //날짜와 시간
    private Date createdDate;


    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    // CLOB, BLOB 타입을 매핑할 수 있다.
    @Lob
    private String description;



}
