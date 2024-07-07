package com.untilwed.studyingjpa.model.ch9_entity;

public class UserDTO {

    private String username;
    private int age;

    public UserDTO(String username, String age) {
        this.username = username;
        this.age = Integer.parseInt(age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
