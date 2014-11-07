/**
 * 
 */
package com.cxiny.dao;

import java.util.List;

import com.cxiny.po.Group;

/**
 * @author cxiny
 *
 */
public interface GroupDaoInf {
	public Group save(Group group);
	
	public List<Group> load();
}
