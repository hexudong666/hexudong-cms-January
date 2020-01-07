package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.User;

public 	interface BaseDao<T> {

	List<T> List(T t);
	
	User ListById(@Param("id")Integer id);
	
	int insert(T t);
	
	int Update(T t);
	
	int Deletes(@Param("ids")String ids);
}
