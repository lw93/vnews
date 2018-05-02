package com.maven.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maven.ssm.dao.IVnews;
import com.maven.ssm.dto.VNewsDTO;
import com.maven.ssm.pojo.ReqItemBodyBO;
import com.maven.ssm.pojo.ReqVNewsBO;
import com.maven.ssm.pojo.ResItemBodyBO;
import com.maven.ssm.pojo.ResVNewsBO;
import com.maven.ssm.service.IVnewsService;
import com.maven.ssm.util.BASE64Util;
import com.maven.ssm.util.DateUtil;
import com.maven.ssm.util.StringUtil;
@Service("vNewsService")  
@Transactional(rollbackFor = Exception.class)
public class VNewsServiceImpl implements IVnewsService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VNewsServiceImpl.class);
	@Autowired
	private IVnews vnewsDao;

	/*
	 * 获取Vnews信息
	 * @see com.maven.ssm.service.IVnewsService#queryVNews(com.maven.ssm.pojo.ReqVNewsBO)
	 */
	@Override
	public PageInfo<VNewsDTO> queryVNews(ReqVNewsBO reqVNewsBO) {
		String project = reqVNewsBO.getProject();
		if (StringUtil.isNullOrEmpty(project)
				&& !"vnews".equals(BASE64Util.decryptBASE64(project))) {
			LOGGER.info("项目类型为空");
			throw new RuntimeException();
		}
		String newsType = reqVNewsBO.getVnewsType();
		if (StringUtil.isNullOrEmpty(newsType)) {
			throw new RuntimeException("类型为空");
		}
		int pageNum = reqVNewsBO.getPageNum();
		int pageSize = reqVNewsBO.getSize();
		if (pageNum < 1 || pageSize < 0) {
			throw new RuntimeException("大小小于0");
		}
		PageHelper.startPage(pageNum, pageSize);
		List<ResVNewsBO> resultInfo = vnewsDao.queryVNews(reqVNewsBO);
		PageInfo<ResVNewsBO> pageInfo = new PageInfo<ResVNewsBO>(resultInfo);
		PageInfo<VNewsDTO> responseInfo = new PageInfo<VNewsDTO>();
		BeanUtils.copyProperties(pageInfo, responseInfo);
		int size = resultInfo.size();
		List<VNewsDTO> data = new ArrayList<VNewsDTO>(size);
		for (int i = 0; i < size; i++) {
			ResVNewsBO resVNewsBO = resultInfo.get(i);
			VNewsDTO vNewsDTO = new VNewsDTO();
			//vNewsDTO.setBody(resVNewsBO.getVnewsBody());
			vNewsDTO.setDocId(resVNewsBO.getVnewsDocId());
			vNewsDTO.setEditor(resVNewsBO.getVnewsEditor());
			//vNewsDTO.setId(resVNewsBO.getVnewsId());
			vNewsDTO.setImgExtra(resVNewsBO.getVnewsImgExtra());
			vNewsDTO.setImgUrl(resVNewsBO.getVnewsImgUrl());
			//vNewsDTO.setProduct(DateUtil.formatTimestamp(resVNewsBO.getVnewsProductTime()));
			vNewsDTO.setRelativeKey(resVNewsBO.getVnewsRelativeKey());
			vNewsDTO.setResouce(resVNewsBO.getVnewsResouce());
			vNewsDTO.setShortContent(resVNewsBO.getVnewsShortContent());
			vNewsDTO.setTitle(resVNewsBO.getVnewsTitle());
			vNewsDTO.setType(resVNewsBO.getVnewsType());
			data.add(vNewsDTO);
		}
		responseInfo.setList(data);
		return responseInfo;
	}

	/* 获取Vnews信息体
	 * @see com.maven.ssm.service.IVnewsService#queryItemBody(com.maven.ssm.pojo.ReqItemBodyBO)
	 */
	@Override
	public ResItemBodyBO queryItemBody(ReqItemBodyBO reqItemBodyBO) {
		if (StringUtil.isNullOrEmpty(reqItemBodyBO.getTitle())) {
			LOGGER.info("title类型为空");
			throw new RuntimeException("类型为空");
		}else if (StringUtil.isNullOrEmpty(reqItemBodyBO.getDocId())) {
			LOGGER.info("bodyId类型为空");
			throw new RuntimeException("类型为空");
		}
		return vnewsDao.queryItemBody(reqItemBodyBO);
	}


}
