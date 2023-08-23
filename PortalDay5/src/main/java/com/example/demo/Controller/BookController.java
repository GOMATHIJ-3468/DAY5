package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bs;
	@PostMapping("addbook")
	public Book addbus(@RequestBody Book bb) {
		return bs.add(bb);
	}
	@GetMapping("dispbook")
	public List<Book> show(Book bb){
		return bs.print(bb);
	}
	@PutMapping("updatebook")
	public Book update(@RequestBody Book bb) {
		return bs.update(bb);
	}
	@DeleteMapping("delbook/{id}")
	public String del(@PathVariable int id) {
		bs.delete(id);
		return "Deleted";
	}
}
