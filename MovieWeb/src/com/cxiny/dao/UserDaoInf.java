/**
 * 
 */
package com.cxiny.dao;

import java.util.List;

import com.cxiny.po.User;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public interface UserDaoInf {

		public User save(User user);
		
		public User load(int uid);
		
		public List<User> listAll();
		
		public List<User> list(PageModel pageModel);
		
		public List<User> list(PageModel pageModel,String username,String groupname);
		
		public int delete(int[] uids);
		
		public User modify(User user); 
}
