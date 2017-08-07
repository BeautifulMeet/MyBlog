package com.cwj.gecco.pipelines;

import javax.servlet.http.HttpServletRequest;

import com.cwj.gecco.pojo.ArticleList;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName(value="articleListPipelines")
public class ArticleListPipelines implements Pipeline<ArticleList>{

	private HttpServletRequest request ;
	
	public void process(ArticleList articles) {
		
		
		
		request.setAttribute("titles", articles.getTitles());
		request.setAttribute("dates", articles.getCreateDates());
		request.setAttribute("contents", articles.getContents());
		
	}

}
