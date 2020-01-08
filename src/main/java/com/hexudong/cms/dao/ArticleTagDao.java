package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.ArticleTag;
import com.hexudong.cms.pojo.User;

public interface ArticleTagDao extends BaseDao<ArticleTag>{

	List<ArticleTag> List(ArticleTag tag);
	
	User ListById(@Param("aid")Integer aid,@Param("tid")Integer tid);
	
	int insert(ArticleTag tag);
	
	int Update(ArticleTag tag);
	
	int Deletes(@Param("ids")String aids);

}
