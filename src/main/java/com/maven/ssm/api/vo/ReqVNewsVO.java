package com.maven.ssm.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Project: vnews
 * @Class: ReqVNewsVO.java
 * @Description: 
 * @Date: 2018年3月31日
 * @author liuwei5
 */
@ApiModel
public class ReqVNewsVO implements Serializable{
	
	
	private static final long serialVersionUID = -5365849948397335495L;

	@ApiModelProperty(hidden=true,required=true,value="flag",example="flag")
	private String project = "dm5ld3M=";
	
	@ApiModelProperty(required=true,value="vnewsType",example="热点")
	private String vnewsType;

	@ApiModelProperty(required=true,value="pageNum",example="1")
    private int pageNum = 1;

	@ApiModelProperty(required=true,value="size",example="15")
    private int size = 15;

	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
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
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "ReqVNewsVO [project=" + project + ", vnewsType=" + vnewsType
				+ ", pageNum=" + pageNum + ", size=" + size + "]";
	}
	
	
}
