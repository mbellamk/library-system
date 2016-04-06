package com.bellinfo.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.library.model.Book;
import com.bellinfo.library.model.CheckOut;
import com.bellinfo.library.model.Student;
import com.bellinfo.library.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Book> listAllBooks(){
		return studentRepository.listAllBooks();
	}
	
	public void reserveBookById(int bookId, int availableCopies, int studentId, String bookName){
		studentRepository.reserveBookById(bookId,availableCopies, studentId,bookName );
	}
	public List<Book> getPopularBookList(){
		return studentRepository.getPopularBookList();
	}
	
	public int checkStudentDetails(Student student){
		Student studentData= studentRepository.checkStudentDetails(student);
		if(studentData.getStudentUsername().equals(student.getStudentUsername())&& studentData.getStudentPassword().equals(student.getStudentPassword())){
			return studentData.getStudentId();
		}
		return 0;
	}
	public List<CheckOut> getBorrowList(int studentId){
		return studentRepository.getBorrowList(studentId);
	}

}
