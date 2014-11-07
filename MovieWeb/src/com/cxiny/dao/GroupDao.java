/**
 * 
 */
package com.cxiny.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.cxiny.po.Group;

/**
 * @author cxiny
 *
 */
public class GroupDao implements GroupDaoInf {

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	/* (non-Javadoc)
	 * @see com.cxiny.dao.GroupDaoInf#add(com.cxiny.po.Group)
	 */
	@Override
	public Group save(Group group) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(group);
		return group;
	}

	@Override
	public List<Group> load() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Group").list();
	}
}
