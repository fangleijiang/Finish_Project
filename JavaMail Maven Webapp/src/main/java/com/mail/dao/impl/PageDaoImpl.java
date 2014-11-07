package com.mail.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.mail.dao.PageDao;
import com.mail.dao.SuperDao;
import com.mail.model.Contactors;
import com.mail.model.Mail;
import com.mail.model.User;

@Repository
public class PageDaoImpl extends SuperDao implements PageDao {

	@Override
	public int getAllRow(String hql) {
		Session session =null;
		List list =null;
		try {
			session = super.getSessionFactory().openSession();
			Query query = session.createQuery(hql);  
			list = query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return list.size();
	}

	@Override
	public List<User> query_usr_ForPage(String hql, int offset, int length) {
		/*
		 * 分页查询
		 * hql查询条件
		 * offset开始记录
		 * length一次性查询几条记录
		 */
		Session session = null;
		List<User> list_user = null;
		try {
			session = super.getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(offset);
			query.setMaxResults(length);
			list_user = query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return list_user;
	}

	@Override
	public List<Mail> query_mail_ForPage(String hql, int offset, int length) {
		/*
		 * 分页查询
		 * hql查询条件
		 * offset开始记录
		 * length一次性查询几条记录
		 */
		Session session = null;
		List<Mail> list_mail = null;
		try {
			session = super.getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(offset);
			query.setMaxResults(length);
			list_mail = query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return list_mail;
	}

	@Override
	public List<Contactors> query_contactor_ForPage(String hql, int offset,int length) {
			/*
			 * 分页查询
			 * hql查询条件
			 * offset开始记录
			 * length一次性查询几条记录
			 */
			Session session = null;
			List<Contactors> list_contactor = null;
			try {
				session = super.getSessionFactory().openSession();
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(length);
				list_contactor = query.list();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				session.close();
			}
			
			return list_contactor;
	}


}
