package com.example.demo.model;

public class Book {
String tittle;
String author;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String tittle, String author) {
	super();
	this.tittle = tittle;
	this.author = author;
}
public String getTittle() {
	return tittle;
}
public void setTittle(String tittle) {
	this.tittle = tittle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [tittle=" + tittle + ", author=" + author + "]";
}

}
