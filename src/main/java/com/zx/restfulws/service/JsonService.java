package com.zx.restfulws.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.restfulws.entity.JsonData;

@Service
public class JsonService {
	
	private JsonData jsonData;
	
	JsonService() throws IOException{
		if(jsonData==null){
			Resource resource = new ClassPathResource("db.json");
	        InputStream is = resource.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(isr);
	        String data = null;
	        StringBuffer content = new StringBuffer();
	        while((data = br.readLine()) != null) {
	            //System.out.println(data);
	            content.append(data);
	        }
	        br.close();
	        isr.close();
	        is.close();
	        ObjectMapper objectMapper = new ObjectMapper();
			
	        jsonData = objectMapper.readValue(content.toString(),JsonData.class);
	        //System.out.println(jsonData);
		}
	}
	
	public JsonData getJsonData(){
		return jsonData;
	}
}
