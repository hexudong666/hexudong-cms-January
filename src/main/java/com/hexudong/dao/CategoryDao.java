package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Category;
import com.hexudong.pojo.User;

public interface CategoryDao extends BaseDao<Category>{

	List<Category> List(Category category);
	
	User ListById(@Param("aid")Integer aid);
	
	int insert(Category category);
	
	int Update(Category category);
	
	int Deletes(@Param("aids")String aids);

}
