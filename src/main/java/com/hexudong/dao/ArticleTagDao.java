package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Tag;
import com.hexudong.pojo.User;
import com.hexudong.dao.BaseDao;

public interface ArticleTagDao extends BaseDao<Tag>{

	List<Tag> List(Tag tag);
	
	User ListById(@Param("aid")Integer aid);
	
	int insert(Tag tag);
	
	int Update(Tag tag);
	
	int Deletes(@Param("aids")String aids);

}
