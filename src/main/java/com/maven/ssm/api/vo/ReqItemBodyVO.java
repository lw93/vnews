package com.maven.ssm.api.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Project: vnews
 * @Class: ReqItemBodyVO.java
 * @Description: 
 * @Date: 2018年4月16日
 * @author liuwei5
 */
public class ReqItemBodyVO implements Serializable{

	private static final long serialVersionUID = -2730170745660083318L;
	
	@ApiModelProperty(required=true,value="vnewsType",example="科技")
	private String vnewsType;

	@ApiModelProperty(required=true,value="id",example="DFH6M8FK00097U7R")
    private String bodyId ;

	public String getVnewsType() {
		return vnewsType;
	}

	public void setVnewsType(String vnewsType) {
		this.vnewsType = vnewsType;
	}

	public String getBodyId() {
		return bodyId;
	}

	public void setBodyId(String bodyId) {
		this.bodyId = bodyId;
	}



	@Override
	public String toString() {
		return "ReqItemBodyVO [vnewsType=" + vnewsType + ", bodyId=" + bodyId
				+ "]";
	}
	
}
