package com.hexudong.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Channel;
import com.hexudong.cms.pojo.User;

public interface ChannelDao extends BaseDao<Channel>{

	List<Channel> List(Channel channel);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Channel channel);
	
	int Update(Channel channel);
	
	int Deletes(@Param("ids")String ids);

}
