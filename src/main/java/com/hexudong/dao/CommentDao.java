package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Comment;
import com.hexudong.pojo.User;

public interface CommentDao extends BaseDao<Comment>{

	List<Comment> List(Comment comment);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Comment comment);
	
	int Update(Comment comment);
	
	int Deletes(@Param("ids")String ids);

}
