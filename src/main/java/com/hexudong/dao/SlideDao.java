package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Slide;
import com.hexudong.pojo.User;

public interface SlideDao extends BaseDao<Slide>{

	List<Slide> List(Slide slide);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Slide slide);
	
	int Update(Slide slide);
	
	int Deletes(@Param("ids")String ids);

}
