package com.imagegrafia.comment.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.comment.model.User;
import com.imagegrafia.comment.service.UserService;

@RestController
public class CommentController {
	/**
	 * this supply comment controller
	 * 
	 */
	
	private UserService userService=new UserService();
	
	@RequestMapping("/comment")
	public List<User> userInfo(){
		
		return userService.userInfo();
	}
}
