package com.mail.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mail.dao.userDao;
import com.mail.model.User;
import com.mail.service.userService;


@Service("userServie")
public class userServiceiml implements userService {
	
	private userDao userdao;
	
	
	public userDao getUserdao() {
		return userdao;
	}
	@Resource
	public void setUserdao(userDao userdao) {
		this.userdao = userdao;
	}


	@Override
	public boolean checkLogin(User user) {
		System.out.println("sss");
		User us = this.userdao.checkLogin(user);
		if(us==null){
			return false;
		}
		return true;
	}

}
