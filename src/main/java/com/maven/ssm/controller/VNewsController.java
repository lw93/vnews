package com.maven.ssm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.maven.ssm.api.IVNewsApiService;
import com.maven.ssm.api.vo.ReqItemBodyVO;
import com.maven.ssm.api.vo.ReqVNewsVO;
import com.maven.ssm.api.vo.ResItemBodyVO;
import com.maven.ssm.api.vo.ResVNewsVO;
import com.maven.ssm.dto.VNewsDTO;
import com.maven.ssm.pojo.ReqItemBodyBO;
import com.maven.ssm.pojo.ReqVNewsBO;
import com.maven.ssm.pojo.ResItemBodyBO;
import com.maven.ssm.service.IVnewsService;
import com.maven.ssm.util.Constant;
@RestController
public class VNewsController implements IVNewsApiService{
	
	@Resource(name=("vNewsService"))
	private IVnewsService vNewsService;
	
	/* 
	 * 获取Vnews信息
	 * @see com.maven.ssm.controller.VNewsService#queryVNews(com.maven.ssm.api.ReqVNewsVO)
	 */
	@Override
	public ResVNewsVO<PageInfo<VNewsDTO>> queryVNews(@RequestBody ReqVNewsVO reqVNewsVO) {
		ResVNewsVO<PageInfo<VNewsDTO>> response = new ResVNewsVO<PageInfo<VNewsDTO>>();
		try {
			ReqVNewsBO reqVNewsBO = new ReqVNewsBO();
			BeanUtils.copyProperties(reqVNewsVO, reqVNewsBO);
			PageInfo<VNewsDTO> data = vNewsService.queryVNews(reqVNewsBO);
			response.setData(data);
			response.setCode(Constant.SUCCESS_CODE);
			response.setMessage(Constant.SUCCESS_MESSAGE);
		} catch (Exception ex) {
			response.setCode(Constant.FAIL_CODE);
			response.setMessage(ex.getMessage());
		}
		return response;
	}

	/* 获取Vnews信息体
	 * @see com.maven.ssm.api.IVNewsService#getVNewsBody(java.lang.String, java.lang.String)
	 */
	@Override
	public ResVNewsVO<ResItemBodyVO> getVNewsBody(@RequestBody ReqItemBodyVO reqItemBodyVO) {
		ResVNewsVO<ResItemBodyVO> response = new ResVNewsVO<ResItemBodyVO>();
		try {
			ReqItemBodyBO reqItemBodyBO = new ReqItemBodyBO();
			reqItemBodyBO.setTitle(reqItemBodyVO.getVnewsType());
			reqItemBodyBO.setDocId(reqItemBodyVO.getBodyId());
			ResItemBodyBO resItemBodyBO = vNewsService.queryItemBody(reqItemBodyBO);
			ResItemBodyVO resItemBodyVO = new ResItemBodyVO();
			resItemBodyVO.setBody(resItemBodyBO.getVnewsBody());
			response.setData(resItemBodyVO);
			response.setCode(Constant.SUCCESS_CODE);
			response.setMessage(Constant.SUCCESS_MESSAGE);
		} catch (Exception ex) {
			response.setCode(Constant.FAIL_CODE);
			response.setMessage(ex.getMessage());
		}
		return response;
	}
}