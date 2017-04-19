package com.smalldong.core.service.impl;

import javax.annotation.Resource;

import com.smalldong.core.bean.UserInfo;
import com.smalldong.core.repository.UserInfoRepository;
import com.smalldong.core.service.UserInfoService;
import org.springframework.stereotype.Service;



@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}
	
}
