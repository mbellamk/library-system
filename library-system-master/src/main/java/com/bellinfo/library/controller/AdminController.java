package com.bellinfo.library.controller;
import java.util.Collections;
import java.util.List;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.library.model.Admin;
import com.bellinfo.library.model.Book;
import com.bellinfo.library.service.AdminServiceImpl;

@RequestMapping(value="/admin")
@Controller
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getAdminDetails(Model model){
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "admin-login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String checkAdminDetails(
			@Valid @ModelAttribute("admin") Admin admin, 
			BindingResult result, Model model){
		System.out.println(admin.getAdminId());
		System.out.println(admin);
		if(result.hasErrors()){
			return "admin-login";
		}
		boolean verification = adminServiceImpl.checkAdminDetails(admin);
		if(verification==true){
			return "admin-login-sucess";
		}
		else{
			return "admin-login-failure";
		}
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String enterBookDetails(Model model){
		Book box = new Book();
		model.addAttribute("bookForm", box);
		return "book-form";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String saveBook(
			@Valid @ModelAttribute("bookForm") Book bookForm, 
			BindingResult result, Model model){
		if(result.hasErrors()){
			return "book-form";
		}
		int id = adminServiceImpl.saveBook(bookForm);
		model.addAttribute("bookId", id);
		return "form-success";		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listBookDetails(Model model){
		List<Book> bookList = adminServiceImpl.listBookDetails();
		Collections.sort(bookList);
		for(Book b:bookList){
			System.out.println(b);
		}
		model.addAttribute("booklist", bookList);
		return "book-list";		
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String updateBookData(Model model,@PathVariable int id){
		Book bookForm=null;
		if(id!=0){
			System.out.println("inside controller");
		bookForm=adminServiceImpl.getBookDataById(id);
		}
		model.addAttribute("bookForm",bookForm);
		return "edit-form";
	
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.POST)
	
	public String updateBookData(Model model,@Valid @ModelAttribute("bookForm") Book bookForm,BindingResult result,@PathVariable Integer id){
	if(result.hasErrors()){
		return "edit-form";
	}
	adminServiceImpl.updateBookDetails(bookForm);
	model.addAttribute("bookId",id);
	return "form-success";
	}
	
	@RequestMapping(value="/menu2",method=RequestMethod.GET)
	public String adminMenu(Model model){
		return "menu2";
	}
	@RequestMapping(value="/responsibility")
	public String getHome(){
		return "responsibility";	
	}
}