package com.mail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mail.dao.mailDao;
import com.mail.model.Mail;
import com.mail.service.mailService;

@Service("mailservice")
public class mailServiceImpl implements mailService {

	private mailDao maildao;
	
	public mailDao getMaildao() {
		return maildao;
	}
	@Resource
	public void setMaildao(mailDao maildao) {
		this.maildao = maildao;
	}

	@Override
	public void save(Mail mail) {
		
		this.maildao.save(mail);

	}
	@Override
	public void delete(Mail mail) {
		this.maildao.delete(mail);
		
	}
	@Override
	public Mail find_mail_By_id(int id) {
		return this.maildao.find_mail_By_id(id);
	}

	@Override
	public void save_host_mail(Mail mail) {
		System.out.println("service");
		this.maildao.save_host_mail(mail);
		
	}

}
