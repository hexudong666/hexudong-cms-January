package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hexudong.cms.pojo.Article;


public interface ArticleDao extends BaseDao<Article>{
	@Select("SELECT id from cms_article")
	List<Integer> selectIdList();

	
	boolean articleSc(@Param("id")int id, @Param("user_id")Integer user_id);

}
