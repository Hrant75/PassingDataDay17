package com.example.hrant.passingdata;

import java.util.ArrayList;

/**
 * Created by Hrant on 28.04.2017.
 */

public class UserList {
    private static ArrayList<User> usersList = new ArrayList<>();
    static {
        usersList.add(new User("John", "Smith", "JohnS", "M", 20, "captainjamessmith.jpg"));
        usersList.add(new User("Sarah", "Jonson", "SarahJ", "F", 25, "sarahjonson.jpg"));
        usersList.add(new User("Mark", "Twain", "MArkT", "M", 151, "marktwain.jpg"));
        usersList.add(new User("Mark", "Zuckerberg", "MarkZ", "M", 33, "markzuckerberg.jpg"));
        usersList.add(new User("Elon", "Musk", "ElonM", "M", 35));
    }

    public static ArrayList<User> getUsersList(){
        return usersList;
    }
}
