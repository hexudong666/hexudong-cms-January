package com.hexudong.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hexudong.cms.pojo.Article;
import com.hexudong.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class ArticleDemo {
	
	
	/*@Autowired
	private ArticleDao articleDao;
	
	@Test
	public void DemoUser() {
		//文章列表
		List<User> article = articleDao.select();
//		System.out.println(article);
		
		//新对象
		Article art = new Article();
		
		//数据
		art.setTitle("新添加个文章");
		art.setTousuCnt(10);//不能为空
		//添加
//		articleDao.insert(art);
		
		//修改,需要加上id
		art.setId(88);
		art.setTitle("新修改的文章");
//		articleDao.update(art);

		//删除
//		articleDao.delete("88");
		
		//根据id查询
		Article ccc = articleDao.selectById(87);
		System.out.println(ccc);
		
		
		
	}*/
	
	

}
