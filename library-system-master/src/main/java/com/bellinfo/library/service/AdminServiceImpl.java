package com.bellinfo.library.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.library.model.Admin;
import com.bellinfo.library.model.Book;
import com.bellinfo.library.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl {
	
	@Autowired
	AdminRepository adminRepository;
	
	public int saveBook(Book book){
		return adminRepository.saveBook(book);
	}
	
	public List<Book> listBookDetails(){	
		return adminRepository.listBookDetails();
	}

	public void updateBookDetails(Book book){
		adminRepository.updateBookDetails(book);
	}
	
	public Book getBookDataById(int id){
		return adminRepository.getBookDataById(id);
	}
	public boolean checkAdminDetails(Admin admin){
		Admin adminData= adminRepository.checkAdminDetails(admin);
		if(adminData.getAdminUsername().equals(admin.getAdminUsername())&& adminData.getAdminPassword().equals(admin.getAdminPassword())){
			return true;
		}
		else{
		return false;
		}
	}
}

