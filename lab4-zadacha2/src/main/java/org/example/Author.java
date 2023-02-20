package org.example;

public class Author {
    String FIO;
    int Age;


    public Author(String FIO, int Age) {
        this.FIO = FIO;
        this.Age = Age;

    }

    public String toString(){
        return FIO+" Возраст: "+Age;
    }
}
