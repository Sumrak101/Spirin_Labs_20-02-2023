package org.example;

public class Main {
    public static void main(String[] args) {
        Book More = new Book("Как леопард", 6 , "Пацанская литература");

        User User1 = new User("gimo@mail.ru", "serega", "Sergo");
        User User2 = new User("serzhper@mail.ru", "andrey", "Babidzhon");
        User User3 = new User("fuchi@mail.ru", "shamshot", "Savemysoyl");
        User User4 = new User("kirsus@mail.ru", "ssss", "Kirsus");
        System.out.println("Всего онлайн:"+User.TotalOnline);
        int online = User.TotalOnline;
    }
}