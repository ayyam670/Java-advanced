package com.java;

import org.springframework.context.annotation.Bean;

import com.container.AppleSpeaker;
import com.container.Speaker;
import com.factory.SamsungTV;
import com.factory.TV;


public class ApplicationConfig {

	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	
	@Bean
	public TV tv() {
//		return new SamsungTV(speaker());
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker());
		return tv;
	}
}
