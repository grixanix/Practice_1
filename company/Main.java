package com.company;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Мяч: ");
        Ball ball = new Ball(21.3, " Оранжевый ", " Термополиуретан 100% ");
        System.out.println(ball.toString());
        System.out.println("Книга: ");
        Book book = new Book("И.А. Гончаров", " Обломов ", " Зеленый ");
        System.out.println(book.toString());
    }
}                                                      