package ru.mirea.task3.Book;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", name='" + name + '\'' + ", year=" + year + '}';
    }
}
