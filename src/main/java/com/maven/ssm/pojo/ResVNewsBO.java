package com.maven.ssm.pojo;

import java.sql.Timestamp;
import java.util.Arrays;

/**
 * @Project: vnews
 * @Class: ResVNewsBO.java
 * @Description: bo
 * @Date: 2018年4月1日
 * @author liuwei5
 */
public class ResVNewsBO {
	private String vnewsId;
	private String vnewsType;
	private String vnewsTitle;
	private String vnewsShortContent;
	private String vnewsImgUrl;
	//private byte[] vnewsLocalImg;
	private String vnewsImgExtra;
	private String vnewsResouce;
	private String vnewsDocId;
	private Timestamp vnewsProductTime;
	private String vnewsRelativeKey;
	private String vnewsBody;
	private String vnewsEditor;
	/**
	 * @return the vnewsId
	 */
	public String getVnewsId() {
		return vnewsId;
	}
	/**
	 * @param vnewsId the vnewsId to set
	 */
	public void setVnewsId(String vnewsId) {
		this.vnewsId = vnewsId;
	}
	/**
	 * @return the vnewsType
	 */
	public String getVnewsType() {
		return vnewsType;
	}
	/**
	 * @param vnewsType the vnewsType to set
	 */
	public void setVnewsType(String vnewsType) {
		this.vnewsType = vnewsType;
	}
	/**
	 * @return the vnewsTitle
	 */
	public String getVnewsTitle() {
		return vnewsTitle;
	}
	/**
	 * @param vnewsTitle the vnewsTitle to set
	 */
	public void setVnewsTitle(String vnewsTitle) {
		this.vnewsTitle = vnewsTitle;
	}
	/**
	 * @return the vnewsShortContent
	 */
	public String getVnewsShortContent() {
		return vnewsShortContent;
	}
	/**
	 * @param vnewsShortContent the vnewsShortContent to set
	 */
	public void setVnewsShortContent(String vnewsShortContent) {
		this.vnewsShortContent = vnewsShortContent;
	}
	/**
	 * @return the vnewsImgUrl
	 */
	public String getVnewsImgUrl() {
		return vnewsImgUrl;
	}
	/**
	 * @param vnewsImgUrl the vnewsImgUrl to set
	 */
	public void setVnewsImgUrl(String vnewsImgUrl) {
		this.vnewsImgUrl = vnewsImgUrl;
	}
	
	/**
	 * @return the vnewsImgExtra
	 */
	public String getVnewsImgExtra() {
		return vnewsImgExtra;
	}
	/**
	 * @param vnewsImgExtra the vnewsImgExtra to set
	 */
	public void setVnewsImgExtra(String vnewsImgExtra) {
		this.vnewsImgExtra = vnewsImgExtra;
	}
	/**
	 * @return the vnewsResouce
	 */
	public String getVnewsResouce() {
		return vnewsResouce;
	}
	/**
	 * @param vnewsResouce the vnewsResouce to set
	 */
	public void setVnewsResouce(String vnewsResouce) {
		this.vnewsResouce = vnewsResouce;
	}
	/**
	 * @return the vnewsDocId
	 */
	public String getVnewsDocId() {
		return vnewsDocId;
	}
	/**
	 * @param vnewsDocId the vnewsDocId to set
	 */
	public void setVnewsDocId(String vnewsDocId) {
		this.vnewsDocId = vnewsDocId;
	}
	/**
	 * @return the vnewsProductTime
	 */
	public Timestamp getVnewsProductTime() {
		return vnewsProductTime;
	}
	/**
	 * @param vnewsProductTime the vnewsProductTime to set
	 */
	public void setVnewsProductTime(Timestamp vnewsProductTime) {
		this.vnewsProductTime = vnewsProductTime;
	}
	/**
	 * @return the vnewsRelativeKey
	 */
	public String getVnewsRelativeKey() {
		return vnewsRelativeKey;
	}
	/**
	 * @param vnewsRelativeKey the vnewsRelativeKey to set
	 */
	public void setVnewsRelativeKey(String vnewsRelativeKey) {
		this.vnewsRelativeKey = vnewsRelativeKey;
	}
	/**
	 * @return the vnewsBody
	 */
	public String getVnewsBody() {
		return vnewsBody;
	}
	/**
	 * @param vnewsBody the vnewsBody to set
	 */
	public void setVnewsBody(String vnewsBody) {
		this.vnewsBody = vnewsBody;
	}
	/**
	 * @return the vnewsEditor
	 */
	public String getVnewsEditor() {
		return vnewsEditor;
	}
	/**
	 * @param vnewsEditor the vnewsEditor to set
	 */
	public void setVnewsEditor(String vnewsEditor) {
		this.vnewsEditor = vnewsEditor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResVNewsBO [vnewsId=" + vnewsId + ", vnewsType=" + vnewsType
				+ ", vnewsTitle=" + vnewsTitle + ", vnewsShortContent="
				+ vnewsShortContent + ", vnewsImgUrl=" + vnewsImgUrl
				+ ", vnewsImgExtra=" + vnewsImgExtra + ", vnewsResouce="
				+ vnewsResouce + ", vnewsDocId=" + vnewsDocId
				+ ", vnewsProductTime=" + vnewsProductTime
				+ ", vnewsRelativeKey=" + vnewsRelativeKey + ", vnewsBody="
				+ vnewsBody + ", vnewsEditor=" + vnewsEditor + "]";
	}

	
}
