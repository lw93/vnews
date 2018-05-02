package com.maven.ssm.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * @Project: vnews
 * @Class: VNewsDTO.java
 * @Description: dto
 * @Date: 2018年4月1日
 * @author liuwei5
 */
public class VNewsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String type;
	private String title;
	private String shortContent;
	private String imgUrl;
	private String imgExtra;
	private String resouce;
	private String docId;
	private String relativeKey;
	//private String body;
	private String editor;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the shortContent
	 */
	public String getShortContent() {
		return shortContent;
	}
	/**
	 * @param shortContent the shortContent to set
	 */
	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}
	/**
	 * @return the imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}
	/**
	 * @param imgUrl the imgUrl to set
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**
	 * @return the imgExtra
	 */
	public String getImgExtra() {
		return imgExtra;
	}
	/**
	 * @param imgExtra the imgExtra to set
	 */
	public void setImgExtra(String imgExtra) {
		this.imgExtra = imgExtra;
	}
	/**
	 * @return the resouce
	 */
	public String getResouce() {
		return resouce;
	}
	/**
	 * @param resouce the resouce to set
	 */
	public void setResouce(String resouce) {
		this.resouce = resouce;
	}
	/**
	 * @return the docId
	 */
	public String getDocId() {
		return docId;
	}
	/**
	 * @param docId the docId to set
	 */
	public void setDocId(String docId) {
		this.docId = docId;
	}
	
	/**
	 * @return the relativeKey
	 */
	public String getRelativeKey() {
		return relativeKey;
	}
	/**
	 * @param relativeKey the relativeKey to set
	 */
	public void setRelativeKey(String relativeKey) {
		this.relativeKey = relativeKey;
	}
	
	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}
	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}



	@Override
	public String toString() {
		return "VNewsDTO [type=" + type + ", title=" + title
				+ ", shortContent=" + shortContent + ", imgUrl=" + imgUrl
				+ ", imgExtra=" + imgExtra + ", resouce=" + resouce
				+ ", docId=" + docId + ", relativeKey=" + relativeKey
				+ ", editor=" + editor + "]";
	}
	
}
