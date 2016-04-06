package com.bellinfo.library.controller;

import java.util.Collections;
import java.util.Date;
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

import com.bellinfo.library.model.Book;
import com.bellinfo.library.model.CheckOut;
import com.bellinfo.library.model.Student;
import com.bellinfo.library.service.StudentServiceImpl;

@RequestMapping(value="/student")
@Controller
public class StudentController {
static int studentId=0;
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@RequestMapping(value="/home")
	public String getHome(){
		return "home";
		
	}
	@RequestMapping(value="/stulogin",method=RequestMethod.GET)
	public String getStudentDetails(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}
	@RequestMapping(value="/stulogin",method=RequestMethod.POST)
	public String checkStudentDetails(
			@Valid @ModelAttribute("student") Student student, 
			BindingResult result, Model model){
		if(result.hasErrors()){
			return "student-login";
		}
	 studentId = studentServiceImpl.checkStudentDetails(student);
		if(studentId!=0){
			System.out.println(studentId);
			List<CheckOut> borrowList = studentServiceImpl.getBorrowList(studentId);
			// call select from check out
		/*CheckOut c= new CheckOut();
		c.setCheckoutDate("a");
		System.out.println(c.getCheckoutDate());*/
			Collections.sort(borrowList);
			model.addAttribute("borrowList", borrowList);
			System.out.println(borrowList);
			return "student-login-borrow";
		}
		else{
			return "student-login-failure";
		}
	}
		
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getBookList(Model model){
			List<Book> bookList = studentServiceImpl.listAllBooks();
			model.addAttribute("bookList", bookList);
			return "student-book-list";		
		}
	@RequestMapping(value="/reserve/{id}/{avcopies}/{bookname}", method=RequestMethod.GET)
	public String reserveBookById(Model model, @PathVariable Integer id,@PathVariable Integer avcopies, @PathVariable String bookname){
		System.out.println(id);
		System.out.println(avcopies);
		if(id!=0){
			studentServiceImpl.reserveBookById(id,avcopies,studentId, bookname);
		}
		return "reserve-success";
		}
	@RequestMapping(value="/popularlist", method=RequestMethod.GET)
	public String getPopularBookList(Model model){
			List<Book> popularBookList = studentServiceImpl.getPopularBookList();
			model.addAttribute("popularBookList", popularBookList);
			return "student-popularbook-list";		
		}
		
	}

	

