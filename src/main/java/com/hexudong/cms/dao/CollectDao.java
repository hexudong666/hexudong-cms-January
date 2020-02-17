package com.hexudong.cms.dao;

import org.apache.ibatis.annotations.Param;

import com.hexudong.cms.pojo.Collect;

public interface CollectDao extends BaseDao<Collect>{

	boolean delSc(@Param("id")Integer id);

}
