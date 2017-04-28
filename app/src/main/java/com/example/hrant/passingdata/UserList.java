package com.example.hrant.passingdata;

import java.util.ArrayList;

/**
 * Created by Hrant on 28.04.2017.
 */

public class UserList {
    private static ArrayList<User> usersList = new ArrayList<>();
    static {
        usersList.add(new User(1, "John", "Smith", "JohnS", "M", 20, "captainjamessmith.jpg"));
        usersList.add(new User(2, "Sarah", "Jonson", "SarahJ", "F", 25, "sarahjonson.jpg"));
        usersList.add(new User(3, "Mark", "Twain", "MArkT", "M", 151, "marktwain.jpg"));
        usersList.add(new User(4, "Mark", "Zuckerberg", "MarkZ", "M", 33, "markzuckerberg.jpg"));
        usersList.add(new User(5, "Elonn", "Musk", "ElonM", "M", 35, "elonmusk.jpg"));
    }

    public static ArrayList<User> getUsersList(){
        return usersList;
    }
}
