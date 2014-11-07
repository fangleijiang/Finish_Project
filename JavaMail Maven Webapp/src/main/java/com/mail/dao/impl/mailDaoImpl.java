package com.mail.dao.impl;


import org.hibernate.HibernateException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mail.dao.SuperDao;
import com.mail.dao.mailDao;
import com.mail.model.Mail;

@Repository("maildao")
@Scope("singleton")
public class mailDaoImpl extends SuperDao implements mailDao {
	
	
	@Override
	public void save(Mail mail) {
		Session session = null;
		 try {
			session = super.getSessionFactory().openSession();
			 session.beginTransaction();
			 session.save(mail);
			 session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{
			 session.close();
		 }
		 
	}
	@Override
	public void delete(Mail mail) {
		Session session = null;
		try {
			session = super.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(mail);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		
	}
	@Override
	public Mail find_mail_By_id(int id) {
		Session session = null;
		Mail mail = null;
		try {
			String sql = "from Mail mail where mail.id = ?";
			session = super.getSessionFactory().openSession();
			Query q = session.createQuery(sql);
			q.setInteger(0, id);
			mail = (Mail)q.list().get(0);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return mail;
	}
	
	@Override
	public void save_host_mail(Mail mail) {
		Session session = null;
		try {
			String sql = "from Mail mail where mail.messageID = ?";
			session = super.getSessionFactory().openSession();
			Query q = session.createQuery(sql);
			q.setString(0, mail.getMessageID());
			if(q.list().size()==0){
				save(mail);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		
	}

}
