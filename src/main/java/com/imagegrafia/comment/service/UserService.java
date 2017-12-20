package com.imagegrafia.comment.service;

import java.util.List;
import com.imagegrafia.comment.dao.UserDAO;
import com.imagegrafia.comment.model.User;

public class UserService {

	private UserDAO userDao = new UserDAO();

	/**
	 * userInfo() detail
	 * 
	 * @return
	 */
	public List<User> userInfo() {

		return userDao.userInfo();
	}

}
