/**
 * 
 */
package com.cxiny.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cxiny.po.User;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 * 
 */
public class UserDao implements UserDaoInf {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cxiny.dao.UserDaoInf#save()
	 */
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserDao save()...");
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	public User load(int uid) {
		// TODO Auto-generated method stub
		System.out.println("UserDao load(int uid)...");
		return (User) this.sessionFactory.getCurrentSession().load(User.class,
				uid);
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("from User").list();
		return users;
	}

	@Override
	public List<User> list(PageModel pageModel) {
		// TODO Auto-generated method stub
		String hqlCountAll = "select count(*) from User";
		Session session = sessionFactory.getCurrentSession();
		long countAll = (Long) session.createQuery(hqlCountAll).list().get(0);
		pageModel.setCountAll(countAll);

		long page = pageModel.getPage();
		int pageCount = pageModel.getPageCount();
		int pageSize = pageModel.getPageSize();

		if (pageSize > countAll) {
			pageSize = (int) countAll;
			pageModel.setPageSize(pageSize);
		}

		if (page > pageCount) {
			page = pageCount;
		}

		int startIndex = (int) ((page - 1) * pageSize);

		List<User> users = session.createQuery("from User")
				.setFirstResult(startIndex).setMaxResults(pageSize).list();
		return users;
	}

	@Override
	public List<User> list(PageModel pageModel, String username,
			String groupname) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("select count(*) from User u "); 
		StringBuffer sbConditions =new StringBuffer("where 1 = 1 and u.name like ? and u.group.name like ?");
		
		Session session = sessionFactory.getCurrentSession();
		long countAll = (Long) session.createQuery(sb1.append(sbConditions).toString())
				.setParameter(0,"%"+username+"%")
				.setParameter(1,"%"+groupname+"%")
				.list().get(0);
		pageModel.setCountAll(countAll);

		long page = pageModel.getPage();
		int pageCount = pageModel.getPageCount();
		int pageSize = pageModel.getPageSize();

		if (pageSize > countAll) {
			pageSize = (int) countAll;
			pageModel.setPageSize(pageSize);
		}

		if (page > pageCount) {
			page = pageCount;
		}

		int startIndex = (int) ((page - 1) * pageSize);
		
		StringBuffer sb2 = new StringBuffer("select u from User u ");
		
		List<User> users = session.createQuery(sb2.append(sbConditions).toString())
				.setParameter(0,"%"+username+"%")
				.setParameter(1,"%"+groupname+"%")
				.setFirstResult(startIndex).setMaxResults(pageSize).list();
		return users;
	}
	
	@Override
	public int delete(int[] uids) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		int deleteCount = 0;
		for (int i = 0; i < uids.length; i++) {
			User user = new User();
			user.setId(uids[i]);
			session.delete(user);
			deleteCount++;
		}
		return deleteCount;
	}

	@Override
	public User modify(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		return user;
	}
}
