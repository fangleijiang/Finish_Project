/**
 * 
 */
package com.cxiny.service;

import java.util.List;

import com.cxiny.po.User;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public interface UserManagerInf {
	
	public User add(User user);
	
	public User load(int uid);
	
	public List<User> listAll();
	
	public List<User> list(PageModel pageModel);
	
	public int delete(int[] uids);
	
	public User modify(User user);
	
	public List<User> list(PageModel pageModel,String username,String groupname);
}
