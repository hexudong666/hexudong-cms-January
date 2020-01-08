package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Category;
import com.hexudong.cms.pojo.User;

public interface CategoryDao extends BaseDao<Category>{

	List<Category> List(Category category);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Category category);
	
	int Update(Category category);
	
	int Deletes(@Param("ids")String ids);

}
