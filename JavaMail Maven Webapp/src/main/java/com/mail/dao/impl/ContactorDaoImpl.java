package com.mail.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mail.dao.ContactorDao;
import com.mail.dao.SuperDao;
import com.mail.model.Contactors;

@Repository("contactor_dao")
@Scope("singleton")
public class ContactorDaoImpl extends SuperDao implements ContactorDao {
	Session session = null;
	@Override
	public void save(Contactors contcs) {
		try {
			session  = super.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(contcs);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		

	}

}
