package com.maven.ssm.config;

import springfox.documentation.spring.web.json.Json;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


public class FastjsonConverterConfig extends FastJsonHttpMessageConverter {
	public FastjsonConverterConfig() {  
        super();  
        this.getFastJsonConfig().getSerializeConfig().put(Json.class, SwaggerJsonSerializer.instance);  
    }  
}
