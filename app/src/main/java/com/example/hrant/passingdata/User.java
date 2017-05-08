package com.example.hrant.passingdata;

import java.io.Serializable;

/**
 * Created by Hrant on 28.04.2017.
 */

public class User implements Serializable {
    private int id;
    private String name;
    private String lastName;
    private String username;
    private String gender;
    private int age;
    private String bio;
    private String pic;


    public User(int id, String name, String lastName, String username, String gender, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.pic = "N/A";
    }

    public User(int id, String name, String lastName, String username, String gender, int age, String pic) {
        this(id, name, lastName, username, gender, age);
        this.pic = pic;
    }

    public User(int id, String name, String lastName, String username, String gender, int age, String pic, String bio) {
        this(id, name, lastName, username, gender, age, pic);
        this.bio = bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getBio() {
        return bio;
    }

    public String getPic() {
        return pic;
    }
}
