package com.mail.dao.impl;

import java.util.List;


import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;



import com.mail.dao.SuperDao;
import com.mail.dao.userDao;
import com.mail.model.User;

@Repository("userdao")
@Scope("singleton")
public class userDaoImpl extends SuperDao implements userDao {

	
	@SuppressWarnings("rawtypes")
	@Override
	public User checkLogin(User user) {
		Session session = null;
		try {
			
			session = super.getSessionFactory().openSession();
			Query query=session.createQuery("from User user where user.username=? and user.password=?");
			query.setString(0,user.getUsername());
			query.setString(1,user.getPassword());
			List list = query.list();
			if(list.size()>0&&list.size()==1){
				return (User) list.get(0);
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return null;
	}

}
