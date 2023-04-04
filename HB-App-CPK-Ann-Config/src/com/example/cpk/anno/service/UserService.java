package com.example.cpk.anno.service;

import com.example.cpk.anno.bean.User;
import com.example.cpk.anno.bean.UserPK;
import com.example.cpk.anno.dao.UserDAO;

public class UserService {

	public static void main(String[] args) {

		UserPK userPK = new UserPK();

		/*
		 * userPK.setUser_id(4206); userPK.setUser_name("Shravan");
		 * 
		 * User user = new User();
		 * 
		 * user.setUserPK(userPK); user.setPassword("******"); user.setCity("Pune");
		 * user.setProfession("IT");
		 * 
		 * UserDAO userDAO = new UserDAO(); userDAO.insertStudentDetails(user);
		 */

		UserDAO userDAO = new UserDAO();
		userPK.setUser_id(4206);
		userPK.setUser_name("Shravan");
		userDAO.getUserDetails(userPK);

	}

}
