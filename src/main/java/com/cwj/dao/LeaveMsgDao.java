package com.cwj.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cwj.pojo.LeaveMsg;

@Repository
public class  LeaveMsgDao {
	
	
	
	@Resource
	private NamedParameterJdbcTemplate namedjdbctemp;
	

	public List<LeaveMsg> queryLeaveInfo(){
		String sql = " select m.fromId fromId,m.createTime mcreateTime,m.content mcontent,r.replyId replyId,r.content rcontent,r.createTime rcreateTime,um.headImg mheadImg,ur.headImg rheadImg, um.name mname,um.name rname"+
					 " from messageboard m "+
					 " left join replymsg r on r.masterId = m.fromId "+
					 " left join userinfo um on um.id = m.fromId "+
					 " left join userinfo ur on ur.id = r.replyId ";

		Map<String, Object> map = new HashMap<String, Object>();
		
		return namedjdbctemp.query(sql,new BeanPropertyRowMapper<LeaveMsg>(LeaveMsg.class));
	}
	
}
