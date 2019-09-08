package com.xzy.networkTest;

import java.io.IOException;
import java.util.List;


import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.pojo.Areas;
import com.xzy.mybatis.pojo.City;
import com.xzy.mybatis.pojo.Comments;
import com.xzy.mybatis.pojo.User;
import com.xzy.network.HttpRequest;

//网络套件使用示例
public class workTest {
	//用于 对象与json数据格式的转换
	ObjectMapper mapper = new ObjectMapper();
	//获取城市
	@Test
	public void showCity() {
		//需要传递参数时，使用HttpRequest.sendPost()函数,参数为String，格式【参数名=值】/【json(参数名)=json数据串】
		String result = HttpRequest.sendPost("showCity.do", "cityname=西安&id=2");
		//获得返回的json数据结果
		System.out.println(result);
        List<City> cities = null;
		try {
			cities = mapper.readValue(result,new TypeReference<List<City>>() { });
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(cities.get(0).toString());
        
    }
	
	//获取城市列表
	@Test
	public void getCityList() {
		//不需要传递参数的情况，调用HttpRequest.sendGet()函数，参数同sendPost(),是请求的服务名。
		String result = HttpRequest.sendGet("getCityList.do");
        System.out.println(result);
        //通过mapper对象，将结果转换成对象列表，得到城市列表
        List<City> cities = null;
		try {
			cities = mapper.readValue(result,new TypeReference<List<City>>() { });
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(cities.toString());
        //获取第0个城市的景区列表
        result = HttpRequest.sendPost("getAreasList.do","cityname="+cities.get(0).getCityname());
        List<Areas> areas = null;
		try {
			areas = mapper.readValue(result,new TypeReference<List<Areas>>() { });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(areas.toString());
        System.out.println(areas.size());
        //获取第0个景区的第0个景区的评论
        result = HttpRequest.sendPost("getCommentsList.do","area="+areas.get(0).getArea());
        List<Comments> comments = null;
		try {
			comments = mapper.readValue(result,new TypeReference<List<Comments>>() { });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(comments.toString());
		System.out.println(comments.size());
	}
	
	//注册新用户
	@Test
	public void newUser() {
		User newUser = new User();
		newUser.setUsername("412907714");
		newUser.setPassword("heli123456");
		//将对象转换为json格式
        String json=null;
		try {
			json = mapper.writeValueAsString(newUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(json);
        String result = HttpRequest.sendPost("newUser.do", "jsonofUser="+json);
        System.out.println(result);
        //返回结果“-1”注册失败；
        //"1",注册成功
	}
}
