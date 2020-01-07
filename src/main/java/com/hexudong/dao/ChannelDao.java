package com.hexudong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hexudong.pojo.Channel;
import com.hexudong.pojo.User;

public interface ChannelDao extends BaseDao<Channel>{

	List<Channel> List(Channel channel);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Channel channel);
	
	int Update(Channel channel);
	
	int Deletes(@Param("ids")String ids);

}
