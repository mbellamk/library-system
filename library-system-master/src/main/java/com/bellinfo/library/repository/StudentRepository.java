package com.bellinfo.library.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bellinfo.library.model.Book;
import com.bellinfo.library.model.CheckOut;
import com.bellinfo.library.model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public Student checkStudentDetails(Student student){
		Criteria stuCriteria = getSession().createCriteria(Student.class);
		Criterion stuCriterion = Restrictions.eq("studentUsername", student.getStudentUsername());
		stuCriteria.add(stuCriterion);
		Student  studentData=(Student)stuCriteria.uniqueResult();
		System.out.println(studentData);
		
		return studentData;
	}
	public List<Book> listAllBooks(){
		Criteria ctr = getSession().createCriteria(Book.class);
		List<Book> bookList =ctr.list();
		return bookList;
	}
	public void reserveBookById(int bookId, int availableCopies, int studentId, String bookName){
		String hqlReserve ="update Book SET availableCopies=:availableCopies-1 where bookId=:bookid";
		Query query = getSession().createQuery(hqlReserve);
		query.setInteger("availableCopies", availableCopies);
		query.setInteger("bookid", bookId);
		query.executeUpdate();
		// to insert into checkout
		CheckOut c= new CheckOut();	
		c.setCheckoutDate("a");
		c.setReturnDate("a");
		CheckOut checkOut= new CheckOut();	
		checkOut.setBookId(bookId);
		checkOut.setStudentId(studentId);
		checkOut.setBookName(bookName);
		checkOut.setCheckoutDate(c.getCheckoutDate());
		System.out.println("inside repository");
		System.out.println(checkOut.getCheckoutDate());
		checkOut.setReturnDate(c.getReturnDate());
		getSession().persist(checkOut);
		
	}
	public List<Book> getPopularBookList(){
		String hqlPopularList ="from Book ORDER BY totalCopies-availableCopies DESC";
		Query query = getSession().createQuery(hqlPopularList);
		List<Book> popularBookList = query.list();
		return popularBookList;
	}
	public List<CheckOut>getBorrowList(int studentId){
		Criteria borrowCri = getSession().createCriteria(CheckOut.class);
		Criterion borrowCriterion = Restrictions.eq("studentId", studentId);
		borrowCri.add(borrowCriterion);
		List<CheckOut> borrowList = borrowCri.list();
		return borrowList;
	}

}
