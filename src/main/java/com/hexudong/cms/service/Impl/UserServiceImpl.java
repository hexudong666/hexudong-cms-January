package com.hexudong.cms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexudong.cms.dao.UserDao;
import com.hexudong.cms.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
}
