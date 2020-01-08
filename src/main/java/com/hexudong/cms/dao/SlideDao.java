package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Slide;
import com.hexudong.cms.pojo.User;

public interface SlideDao extends BaseDao<Slide>{

	List<Slide> List(Slide slide);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Slide slide);
	
	int Update(Slide slide);
	
	int Deletes(@Param("ids")String ids);

}
