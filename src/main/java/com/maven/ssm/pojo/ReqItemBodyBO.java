package com.maven.ssm.pojo;

/**
 * @Project: vnews
 * @Class: ReqItemBodyBO.java
 * @Description: 
 * @Date: 2018年4月15日
 * @author liuwei5
 */
public class ReqItemBodyBO {
	private String title;
	private String docId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}


	@Override
	public String toString() {
		return "ReqItemBodyBO [title=" + title + ", docId=" + docId + "]";
	}
	
}
