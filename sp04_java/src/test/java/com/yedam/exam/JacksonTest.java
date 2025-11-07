package com.yedam.exam;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {

	@Test
	public void toObject() throws JsonMappingException, JsonProcessingException {
		// {"name":"hong","age":10} 따옴표 안에 넣으면 \ 추가되서 들어감
		String json = "{\"name\":\"hong\",\"age\":10}";
		ObjectMapper objectMapper = new ObjectMapper();
		Sample sample = objectMapper.readValue(json, Sample.class);   // JSON.parse() = readValue
		System.out.println("name= " + sample.getName());
	}
	
	@Test
	public void toJson() throws JsonProcessingException {
		Sample sample = new Sample();
		sample.setName("김유미");
		sample.setAge(20);
		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(sample);
		System.out.println(str);
	}
}
