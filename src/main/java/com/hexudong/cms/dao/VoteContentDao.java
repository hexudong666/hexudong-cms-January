package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.User;
import com.hexudong.cms.pojo.VoteContent;

public interface VoteContentDao extends BaseDao<VoteContent>{

	List<VoteContent> List(VoteContent vote_Content);
	
	User ListById(@Param("id")Integer id);
	
	int insert(VoteContent vote_Content);
	
	int Update(VoteContent vote_Content);
	
	int Deletes(@Param("ids")String ids);

}