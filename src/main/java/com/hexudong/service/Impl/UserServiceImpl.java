package com.hexudong.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexudong.dao.UserDao;
import com.hexudong.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
}
