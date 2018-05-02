package com.maven.ssm.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.maven.ssm.api.vo.ReqItemBodyVO;
import com.maven.ssm.api.vo.ReqVNewsVO;
import com.maven.ssm.api.vo.ResItemBodyVO;
import com.maven.ssm.api.vo.ResVNewsVO;
import com.maven.ssm.dto.VNewsDTO;

/**
 * @Project: vnews
 * @Class: VNewsService.java
 * @Description: api
 * @Date: 2018年3月31日
 * @author liuwei5
 */
@RestController
@Api(description="VNEWS-API")
public interface IVNewsApiService {
	
	@ApiOperation("查询信息")
	@RequestMapping(value = "/queryAll", method = RequestMethod.POST)
	ResVNewsVO<PageInfo<VNewsDTO>> queryVNews(@RequestBody ReqVNewsVO  reqVNewsVO);
	
	@ApiOperation("查询信息体")
	@RequestMapping(value = "/queryBody", method = RequestMethod.POST)
	ResVNewsVO<ResItemBodyVO> getVNewsBody(@RequestBody ReqItemBodyVO reqItemBodyVO);
}
