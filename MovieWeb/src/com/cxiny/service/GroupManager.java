/**
 * 
 */
package com.cxiny.service;

import java.util.List;

import com.cxiny.dao.GroupDaoInf;
import com.cxiny.po.Group;
import com.cxiny.po.User;

/**
 * @author cxiny
 *
 */
public class GroupManager implements GroupManagerInf {
	
	private GroupDaoInf groupDao;
	

	public void setGroupDao(GroupDaoInf groupDao) {
		this.groupDao = groupDao;
	}


	/* (non-Javadoc)
	 * @see com.cxiny.manager.GroupManagerInf#save(com.cxiny.po.Group)
	 */
	@Override
	public Group save(Group group) {
		// TODO Auto-generated method stub
		return groupDao.save(group);
	}
	
	@Override
	public List<Group> load() {
		// TODO Auto-generated method stub
		return groupDao.load();
	}
}
