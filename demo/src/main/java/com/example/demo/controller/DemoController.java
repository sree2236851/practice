package com.example.demo.controller;

import java.awt.print.Book;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dto.BooksCreationDto;
import com.example.demo.model.Person;



@RestController
public class DemoController {

	@GetMapping("/create")
	public ModelAndView showCreateForm(Model model) {
	    BooksCreationDto booksForm = new BooksCreationDto();

	    for (int i = 1; i <= 3; i++) {
	        booksForm.addBook(new Book());
	    }

	    model.addAttribute("form", booksForm);
	    return new ModelAndView("books");
	}
	/*@GetMapping("/save")
	public String saveBooks(@ModelAttribute BooksCreationDto form, Model model) {
	    bookService.saveAll(form.getBooks());

	    model.addAttribute("books", bookService.findAll());
	    return "redirect:/books/all";
	}
	*/
	@GetMapping("/show")
	public ModelAndView showPerson(Model model) {
		Person person =new Person(111,"sreenivas");
		model.addAttribute(person);
		return new  ModelAndView("index");
	}
	@GetMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return new ModelAndView("greeting");
	}

}
