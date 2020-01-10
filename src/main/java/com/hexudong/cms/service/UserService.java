package com.hexudong.cms.service;

import com.hexudong.cms.pojo.User;

public interface UserService {
	/**
	 * @Title: register   
	 * @Description: �û�ע��   
	 * @param: @param user
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean register(User user);
	
	/**
	 * @Title: getByUsername   
	 * @Description: ���ݵ�¼����ѯ�û�   
	 * @param: @param userName
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	public User getByUsername(String userName);
	/**
	 * @Title: locked   
	 * @Description: �Ƿ����   
	 * @param: @param userName
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean locked(String userName);
}
