package com.mail.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mail.dao.ContactorDao;
import com.mail.model.Contactors;
import com.mail.service.ContactorService;

@Service("contactor_service")
public class ContactorServiceImpl implements ContactorService {
	
	private ContactorDao contacDao;
	
	public ContactorDao getContacDao() {
		return contacDao;
	}
	@Resource
	public void setContacDao(ContactorDao contacDao) {
		this.contacDao = contacDao;
	}

	@Override
	public void save(Contactors contcs) {
		this.contacDao.save(contcs);

	}

}
