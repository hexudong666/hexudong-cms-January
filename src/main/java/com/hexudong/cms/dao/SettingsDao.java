package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Settings;
import com.hexudong.cms.pojo.User;

public interface SettingsDao extends BaseDao<Settings>{

	List<Settings> List(Settings settings);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Settings settings);
	
	int Update(Settings settings);
	
	int Deletes(@Param("ids")String ids);

}
