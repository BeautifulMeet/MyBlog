package com.cwj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwj.dao.LeaveMsgDao;
import com.cwj.pojo.LeaveMsg;
import com.geccocrawler.gecco.GeccoEngine;

@Controller
public class MyBlogController {
	
	private static Logger log=LoggerFactory.getLogger(MyBlogController.class);
	
	@Resource
	private LeaveMsgDao leaveMsgDao;
	
	@RequestMapping(value="/home")
	public String test(HttpServletRequest request){
		return "home";
	}
	
	@RequestMapping(value="/about")
	public String about(HttpServletRequest request){
		List<LeaveMsg> leaveMsgs = new ArrayList<LeaveMsg>();
		leaveMsgs =	leaveMsgDao.queryLeaveInfo();
		log.info("留言信息："+leaveMsgs.toString());
		request.setAttribute("leaveMsgs", leaveMsgs);
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
	        //宸ョ▼鐨勫寘璺緞
	        .classpath("com.cwj.gecco")
	        //寮�濮嬫姄鍙栫殑椤甸潰鍦板潃
	        .start("http://www.cnblogs.com/boychen/")
	        //寮�鍚嚑涓埇铏嚎绋�
	        .thread(10)
	        //鍗曚釜鐖櫕姣忔鎶撳彇瀹屼竴涓姹傚悗鐨勯棿闅旀椂闂�
	        .interval(1)
	        //浣跨敤pc绔痷serAgent
	        .mobile(false)
	        //寮�濮嬭繍琛�
	        .run();
		 
		 List<String> titles = (List<String>) request.getAttribute("titles");
		 request.setAttribute("titles", titles);
		
		return "article";
	}	
}
