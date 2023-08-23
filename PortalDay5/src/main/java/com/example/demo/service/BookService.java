package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookRepo;
import com.example.demo.model.Book;

@Service
public class BookService {
	@Autowired
	BookRepo br;
	//post
	public Book add(Book bb) {
		return br.save(bb);
	}
	//get
	public List<Book> print(Book bb){
		return br.findAll();
	}
	//update
	public Book update(Book bb) {
		return br.saveAndFlush(bb);
	}
	
	//delete
	public void delete(int id) {
		br.deleteById(id);
	}
}
