package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.User;

public interface UserDao extends BaseDao<User>{

	List<User> List(User user);
	
	User ListById(@Param("id")Integer id);
	
	int insert(User user);
	
	int Update(User user);
	
	int Deletes(@Param("ids")String ids);

}
