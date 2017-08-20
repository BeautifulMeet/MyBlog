package com.cwj.pojo;

import java.util.Date;

/**
 * 留言表信息
 */
public class LeaveMsg {

	private String fromId; 
	private Date mcreateTime; 
	private String mcontent; 
	private String mheadImg;
	private String replyId; 
	private String rcontent; 
	private Date rcreateTime;
	private String rheadImg;
	private String rname;
	private String mname;
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public Date getMcreateTime() {
		return mcreateTime;
	}
	public void setMcreateTime(Date mcreateTime) {
		this.mcreateTime = mcreateTime;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public String getMheadImg() {
		return mheadImg;
	}
	public void setMheadImg(String mheadImg) {
		this.mheadImg = mheadImg;
	}
	public String getReplyId() {
		return replyId;
	}
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public Date getRcreateTime() {
		return rcreateTime;
	}
	public void setRcreateTime(Date rcreateTime) {
		this.rcreateTime = rcreateTime;
	}
	public String getRheadImg() {
		return rheadImg;
	}
	public void setRheadImg(String rheadImg) {
		this.rheadImg = rheadImg;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}

	
}
