package com.maven.ssm.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Project: vnews
 * @Class: ResVNewsVO.java
 * @Description: 
 * @Date: 2018年3月31日
 * @author liuwei5
 */
@ApiModel
public class ResItemBodyVO implements Serializable{

	private static final long serialVersionUID = 1359530832272881211L;

	@ApiModelProperty(value="body",example="0")
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	
	@Override
	public String toString() {
		return "ResItemBodyVO [body=" + body + "]";
	}
	
		
}
