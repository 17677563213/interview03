package com.wxy.entity;

import java.io.Serializable;

public class People implements Serializable {
    private String username;
    private String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public People(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
