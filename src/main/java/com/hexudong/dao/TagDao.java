package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Tag;
import com.hexudong.pojo.User;

public interface TagDao extends BaseDao<Tag>{

	List<Tag> List(Tag tag);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Tag tag);
	
	int Update(Tag tag);
	
	int Deletes(@Param("ids")String ids);

}
