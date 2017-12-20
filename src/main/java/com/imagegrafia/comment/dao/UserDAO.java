package com.imagegrafia.comment.dao;

import java.util.ArrayList;
import java.util.List;

import com.imagegrafia.comment.model.User;

public class UserDAO {
	
	User user=new User();

	public List<User> userInfo(){
		user.setId(100);
		user.setEmail("Ashish@gmail.com");
		user.setName("Ashish");
		List<User> list=new ArrayList<>();
		list.add(user);
		return list;
	}
}
