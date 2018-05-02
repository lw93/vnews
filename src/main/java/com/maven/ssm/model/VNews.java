package com.maven.ssm.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * @Project: vnews
 * @Class: VNews.java
 * @Description: 新闻实体
 * @Date: 2018年3月31日
 * @author liuwei5
 */
@Entity
@Table(name="news")
public class VNews {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "idx_news_id")
	private String vnewsId;
	
	@Column(name = "idx_news_type")
	private String vnewsType;
	
	@Column(name = "idx_title")
	private String vnewsTitle;
	
	@Column(name = "idx_short_content")
	private String vnewsShortContent;
	
	@Column(name = "img_url")
	private String vnewsImgUrl;
	
//	@Column(name = "local_img")
//	private byte[] vnewsLocalImg;
	
	/**
	 * 相关新闻图片地址
	 */
	@Column(name = "img_extra")
	private String vnewsImgExtra;

	@Column(name = "news_resouce")
	private String vnewsResouce;
	
	/**
	 * 短文对应新闻内容的docid标识
	 */
	@Column(name = "uk_docid")
	private String vnewsDocId;
	
	/**
	 * 新闻产生时间
	 */
	@Column(name = "idx_product_time")
	private Timestamp vnewsProductTime;
	
	/**
	 * 相关新闻关键字
	 */
	@Column(name = "relative_key")
	private String vnewsRelativeKey;
	
	@Column(name = "idx_body")
	private String vnewsBody;
	
	@Column(name = "editor")
	private String vnewsEditor;
	
	/**
	 * 整条记录创建时间
	 */
	@Column(name = "gmt_create")
	private Timestamp vnewsCreate;
	
	/**
	 * 更新时间
	 */
	@Transient
	@Column(name = "gmt_modified")
	private Timestamp vnewsModified;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVnewsId() {
		return vnewsId;
	}

	public void setVnewsId(String vnewsId) {
		this.vnewsId = vnewsId;
	}

	public String getVnewsType() {
		return vnewsType;
	}

	public void setVnewsType(String vnewsType) {
		this.vnewsType = vnewsType;
	}

	public String getVnewsTitle() {
		return vnewsTitle;
	}

	public void setVnewsTitle(String vnewsTitle) {
		this.vnewsTitle = vnewsTitle;
	}

	public String getVnewsShortContent() {
		return vnewsShortContent;
	}

	public void setVnewsShortContent(String vnewsShortContent) {
		this.vnewsShortContent = vnewsShortContent;
	}

	public String getVnewsImgUrl() {
		return vnewsImgUrl;
	}

	public void setVnewsImgUrl(String vnewsImgUrl) {
		this.vnewsImgUrl = vnewsImgUrl;
	}

	public String getVnewsImgExtra() {
		return vnewsImgExtra;
	}

	public void setVnewsImgExtra(String vnewsImgExtra) {
		this.vnewsImgExtra = vnewsImgExtra;
	}

	public String getVnewsResouce() {
		return vnewsResouce;
	}

	public void setVnewsResouce(String vnewsResouce) {
		this.vnewsResouce = vnewsResouce;
	}

	public String getVnewsDocId() {
		return vnewsDocId;
	}

	public void setVnewsDocId(String vnewsDocId) {
		this.vnewsDocId = vnewsDocId;
	}

	public Timestamp getVnewsProductTime() {
		return vnewsProductTime;
	}

	public void setVnewsProductTime(Timestamp vnewsProductTime) {
		this.vnewsProductTime = vnewsProductTime;
	}

	public String getVnewsRelativeKey() {
		return vnewsRelativeKey;
	}

	public void setVnewsRelativeKey(String vnewsRelativeKey) {
		this.vnewsRelativeKey = vnewsRelativeKey;
	}

	public String getVnewsBody() {
		return vnewsBody;
	}

	public void setVnewsBody(String vnewsBody) {
		this.vnewsBody = vnewsBody;
	}

	public String getVnewsEditor() {
		return vnewsEditor;
	}

	public void setVnewsEditor(String vnewsEditor) {
		this.vnewsEditor = vnewsEditor;
	}

	public Timestamp getVnewsCreate() {
		return vnewsCreate;
	}

	public void setVnewsCreate(Timestamp vnewsCreate) {
		this.vnewsCreate = vnewsCreate;
	}

	public Timestamp getVnewsModified() {
		return vnewsModified;
	}

	public void setVnewsModified(Timestamp vnewsModified) {
		this.vnewsModified = vnewsModified;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VNews [id=" + id + ", vnewsId=" + vnewsId + ", vnewsType="
				+ vnewsType + ", vnewsTitle=" + vnewsTitle
				+ ", vnewsShortContent=" + vnewsShortContent + ", vnewsImgUrl="
				+ vnewsImgUrl + ", vnewsImgExtra=" + vnewsImgExtra
				+ ", vnewsResouce=" + vnewsResouce + ", vnewsDocId="
				+ vnewsDocId + ", vnewsProductTime=" + vnewsProductTime
				+ ", vnewsRelativeKey=" + vnewsRelativeKey + ", vnewsBody="
				+ vnewsBody + ", vnewsEditor=" + vnewsEditor + ", vnewsCreate="
				+ vnewsCreate + ", vnewsModified=" + vnewsModified + "]";
	}
	
	
}
