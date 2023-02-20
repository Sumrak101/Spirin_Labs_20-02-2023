package org.example;

public class Book {
    String name;
    int amountPages;
    String genre;

    Author author;
    public Book(String name, int amountPages, String genre, Author author) {
        this.name = name;
        this.amountPages = amountPages;
        this.genre = genre;
        this.author = author;

    }

    public String toString(){
        return "Название книги: "+name+" \nКол-во страниц: "+amountPages+" \nЖанр: "+genre+"\nАвтор: "+author;
    }
}
