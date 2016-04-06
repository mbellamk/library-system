package com.bellinfo.library.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Repository;

import com.bellinfo.library.model.Admin;
import com.bellinfo.library.model.Book;

@Repository
public class AdminRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public int saveBook(Book book){
		int bookId = ((Integer)getSession().save(book)).intValue();
		return bookId;
		
	}
	
	public List<Book> listBookDetails(){
		Criteria bookCriteria = getSession().createCriteria(Book.class);
		List<Book> bookList =bookCriteria.list();
		return bookList;
	}

	
	public void updateBookDetails(Book book){
		String hqlUpdate ="update Book set bookName=:bookName, bookAuthor=:bookAuthor,bookPublisher=:bookPublisher,bookCategory=:bookCategory,bookIsbn=:bookIsbn,totalCopies=:totalCopies,availableCopies=:availableCopies where id=:id";
		Query query = getSession().createQuery(hqlUpdate);
		query.setInteger("id", book.getBookId());
		query.setString("bookName", book.getBookName());
		query.setString("bookAuthor", book.getBookAuthor());
		query.setString("bookPublisher", book.getBookPublisher());
		query.setString("bookCategory", book.getBookCategory());
		query.setString("bookIsbn", book.getBookIsbn());
		query.setInteger("totalCopies", book.getTotalCopies());
		query.setInteger("availableCopies", book.getAvailableCopies());
		query.executeUpdate();
		
	}
	
	public Book getBookDataById(int id){
		 Book book =(Book)getSession().get(Book.class, id);
		 return book;
	}
	public Admin checkAdminDetails(Admin admin){
		Criteria adminCriteria = getSession().createCriteria(Admin.class);
		System.out.println(admin.getAdminId());
		Criterion adminCriterion = Restrictions.eq("adminUsername", admin.getAdminUsername());
		adminCriteria.add(adminCriterion);
		Admin  adminData=(Admin)adminCriteria.uniqueResult();
		System.out.println(adminData);
		
		return adminData;
	}
}
