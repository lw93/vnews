package com.maven.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.maven.ssm.pojo.ReqItemBodyBO;
import com.maven.ssm.pojo.ReqVNewsBO;
import com.maven.ssm.pojo.ResItemBodyBO;
import com.maven.ssm.pojo.ResVNewsBO;

/**
 * @Project: vnews
 * @Class: IVnews.java
 * @Description: vnews dao层
 * @Date: 2018年4月1日
 * @author liuwei5
 */
@MapperScan
public interface IVnews {
	List<ResVNewsBO> queryVNews(@Param("reqVNewsBO")ReqVNewsBO reqVNewsBO);
	
	ResItemBodyBO queryItemBody(@Param("reqItemBodyBO")ReqItemBodyBO reqItemBodyBO);

}
