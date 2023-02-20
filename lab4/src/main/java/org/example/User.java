package org.example;

public class User {
    String email;
    String name;
    String surname;
static int TotalOnline = 0;
    public User(String email, String name,  String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        TotalOnline+=1;
        UserString();
    }

    void UserString(){
        System.out.println("Почта: "+email+" Имя:"+name+" Никнейм: "+surname);

    }

}
