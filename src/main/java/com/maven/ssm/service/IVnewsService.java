package com.maven.ssm.service;

import com.github.pagehelper.PageInfo;
import com.maven.ssm.dto.VNewsDTO;
import com.maven.ssm.pojo.ReqItemBodyBO;
import com.maven.ssm.pojo.ReqVNewsBO;
import com.maven.ssm.pojo.ResItemBodyBO;


public interface IVnewsService {
	
	PageInfo<VNewsDTO> queryVNews(ReqVNewsBO reqVNewsBO);
	
	ResItemBodyBO queryItemBody(ReqItemBodyBO reqItemBodyBO);

}
