package com.company;

public class Book {

    String Author;
    String Name;
    String Color;

    public String toString ()
    {
        return Author + Name + Color;
    }

    public Book(String Author, String Name, String Color)
    {
        this.Author = Author;
        this.Name = Name;
        this.Color = Color;
    }
}