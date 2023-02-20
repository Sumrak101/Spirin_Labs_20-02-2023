package org.example;

public class Book {
    String name;
    int amountPages;
    String genre;

    public Book(String name, int amountPages, String genre) {
        this.name = name;
        this.amountPages = amountPages;
        this.genre = genre;
        Pacan();
    }

    void Pacan(){
        System.out.println("Название: "+name+" Кол-во страниц:"+amountPages+" Жанр: "+genre);
    }
}


