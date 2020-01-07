package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Article;
import com.hexudong.pojo.User;

public interface AtricleDao extends BaseDao<Article>{

	List<Article> List(Article atricle);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Article atricle);
	
	int Update(Article atricle);
	
	int Deletes(@Param("ids")String ids);

}
