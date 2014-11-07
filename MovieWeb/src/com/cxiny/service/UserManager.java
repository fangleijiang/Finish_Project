/**
 * 
 */
package com.cxiny.service;

import java.util.Date;
import java.util.List;

import com.cxiny.dao.UserDaoInf;
import com.cxiny.po.User;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public class UserManager implements UserManagerInf {
	
	private UserDaoInf userDao;

	public void setUserDao(UserDaoInf userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.cxiny.manager.UserManagerInf#add()
	 */
	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserManager add()...");
		user.setRegday(new Date());
		userDao.save(user);
		return user;
	}

	@Override
	public User load(int uid) {
		// TODO Auto-generated method stub
		System.out.println("UserManager load(int uid)...");
		return this.userDao.load(uid);
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userDao.listAll();
	}
	
	@Override
	public List<User> list(PageModel pageModel) {
		// TODO Auto-generated method stub
		return userDao.list(pageModel);
	}
	
	@Override
	public List<User> list(PageModel pageModel, String username,
			String groupname) {
		// TODO Auto-generated method stub
		if(username == null){
			username= "";
		}
		if(groupname == null){
			groupname = "";
		}
		return userDao.list(pageModel, username, groupname);
	}
	
	@Override
	public int delete(int[] uids) {
		// TODO Auto-generated method stub
		return userDao.delete(uids);
	}
	
	@Override
	public User modify(User user) {
		// TODO Auto-generated method stub
		User oldUser = userDao.load(user.getId());
		oldUser.setName(user.getName());
		oldUser.setBirthday(user.getBirthday());
		oldUser.setGroup(user.getGroup());
		return userDao.modify(oldUser);
	}
	
	
}
