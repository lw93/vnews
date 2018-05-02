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
public class ResVNewsVO<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="状态码",example="0")
	private int code; 

	@ApiModelProperty(value="状态码描述",example="失败")
	private String message; 
	
	@ApiModelProperty(value="数据",example="[]")
	private T data;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResVNewsVO [code=" + code + ", message=" + message + ", data="
				+ data + "]";
	}
	
	
}
