package com.ocean.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private Integer id;
    private Integer age;
    private String sex;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(String username, String password, Integer id, Integer age, String sex, String email) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
