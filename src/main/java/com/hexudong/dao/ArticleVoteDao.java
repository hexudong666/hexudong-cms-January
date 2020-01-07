package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.ArticleVote;
import com.hexudong.pojo.User;

public interface ArticleVoteDao extends BaseDao<ArticleVote> {

	List<ArticleVote> List(ArticleVote vote);
	
	User ListById(@Param("id")Integer id);
	
	int insert(ArticleVote vote);
	
	int Update(ArticleVote vote);
	
	int Deletes(@Param("ids")String ids);

}
