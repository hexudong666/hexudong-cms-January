package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Link;
import com.hexudong.cms.pojo.User;

public interface LinkDao extends BaseDao<Link>{

	List<Link> List(Link link);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Link link);
	
	int Update(Link link);
	
	int Deletes(@Param("ids")String ids);

}
