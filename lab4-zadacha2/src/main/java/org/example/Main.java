package org.example;

public class Main {
    public static void main(String[] args) {
        Author Author1 = new Author("Андрей Абрамов Егорыч",49);
        Author Author2 = new Author("Егор Синицын Васильевич",69);

        Book book1 = new Book("Тополь", 455, "Художественная", Author1);
        System.out.println(book1.toString());
    }
}