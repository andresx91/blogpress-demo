package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.demo.util.BlogpressUtil;

public class Comment {
	private String id;
	
	private String blogId;
	private String parentId;
	private int childSequence;
	private String position;
	private String status;
	private int level;
	private String user;
	private String emailAddress;
	private String commentText;
	
	private String createdDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public int getChildSequence() {
		return childSequence;
	}
	
	public void setChildSequence(int childSequence) {
		this.childSequence = childSequence;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdAt) {
		this.createdDate = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getCreatedDateForDisplay() {
		String returnDateStr="";
		if (this.getCreatedDate() != null) {
			returnDateStr = createdDate;
		}
		return returnDateStr;
	}
	
	@Override
	public String toString() {
		 return "Comment {" +
	                "\"position\":" + position+ "\"" +
	                "\"user\":" + user+ "\"" +
	                "\"emailAddress\":" + emailAddress+ "\"" +
	                "\"commentText\":" + commentText+ "\"" +
	                "\"createdDate\":" + createdDate + "\"" +
	                "})";
	}
}
