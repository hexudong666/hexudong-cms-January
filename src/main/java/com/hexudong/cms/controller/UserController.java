package com.hexudong.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hexudong.cms.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	
	
}