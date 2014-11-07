/**
 * 
 */
package com.cxiny.service;

import java.util.List;

import com.cxiny.po.Group;
import com.cxiny.po.User;

/**
 * @author cxiny
 *
 */
public interface GroupManagerInf {
	
	public Group save(Group group);
	
	public List<Group> load();

}
