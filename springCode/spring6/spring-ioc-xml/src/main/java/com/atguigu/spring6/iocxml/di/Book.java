package com.atguigu.spring6.iocxml.di;

public class Book {
    private  String bname;
    private  String author;

    public String getOthers() {
        return Others;
    }

    public void setOthers(String others) {
        Others = others;
    }

    private  String Others;

    public Book() {
    }

    public Book(String bname, String author) {
        System.out.println("构造器执行了");
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", Others='" + Others + '\'' +
                '}';
    }
}
