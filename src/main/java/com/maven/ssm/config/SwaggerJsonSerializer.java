package com.maven.ssm.config;

import java.io.IOException;
import java.lang.reflect.Type;

import springfox.documentation.spring.web.json.Json;  
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

/**
 * @Project: vnews
 * @Class: SwaggerJsonSerializer.java
 * @Description: 
 * @Date: 2018年4月5日
 * @author liuwei5
 */
public class SwaggerJsonSerializer implements ObjectSerializer, ObjectDeserializer {  
	  
    public final static SwaggerJsonSerializer instance = new SwaggerJsonSerializer();  
  
    @Override  
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {  
        SerializeWriter out = serializer.getWriter();  
        Json json = (Json) object;  
        out.write(json.value());  
    }  
  
    @Override  
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {  
        return null;  
    }  
  
    @Override  
    public int getFastMatchToken() {  
        return 0;  
    }
}  
