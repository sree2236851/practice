package com.example.demo.Dto;

import java.util.List;

import com.example.demo.model.Book;

public class BooksCreationDto {
    private List<Book> books;

   
    public BooksCreationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BooksCreationDto(List<Book> books) {
		super();
		this.books = books;
	}

	public void addBook(Book book) {
        this.books.add(book);
    }
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void addBook(java.awt.print.Book book) {
		// TODO Auto-generated method stub
		
	}
	
    
}