package com.hexudong.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//主页
@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	//文章详情
	@RequestMapping("/article/detail/{id}.html")
	public String articleDetail(@PathVariable Integer id) {
		
		return "article-detail";
	}
}
