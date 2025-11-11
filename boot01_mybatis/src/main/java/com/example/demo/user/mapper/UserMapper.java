package com.example.demo.user.mapper;

import com.example.demo.user.service.UserVO;

public interface UserMapper {
	UserVO getUser(String loginId);
//	List<String> getRole(Long id);  없어도 되고 필요하면 만들어쓰면됨
}
