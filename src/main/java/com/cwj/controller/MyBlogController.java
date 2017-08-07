package com.cwj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.geccocrawler.gecco.GeccoEngine;

@Controller
public class MyBlogController {
	
	private static Logger log=LoggerFactory.getLogger(MyBlogController.class);
	
	
	@RequestMapping(value="/home")
	public String test(HttpServletRequest request){
		return "home";
	}
	
	@RequestMapping(value="/about")
	public String about(HttpServletRequest request){
		return "about";
	}
	
	@RequestMapping(value="/resource")
	public String resource(HttpServletRequest request){
		return "resource";
	}
	
	@RequestMapping(value="/timeline")
	public String timeline(HttpServletRequest request){
		return "timeline";
	}
	
	@RequestMapping(value="/detail")
	public String detail(HttpServletRequest request){
		return "detail";
	}	
	
	@RequestMapping(value="/article")
	public String article(HttpServletRequest request){
		
		 GeccoEngine.create()
	        //工程的包路径
	        .classpath("com.cwj.gecco")
	        //开始抓取的页面地址
	        .start("http://www.cnblogs.com/boychen/")
	        //开启几个爬虫线程
	        .thread(10)
	        //单个爬虫每次抓取完一个请求后的间隔时间
	        .interval(1)
	        //使用pc端userAgent
	        .mobile(false)
	        //开始运行
	        .run();
		 
		 List<String> titles = (List<String>) request.getAttribute("titles");
		 request.setAttribute("titles", titles);
		
		return "article";
	}	
}
