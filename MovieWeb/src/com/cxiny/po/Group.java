/**
 * 
 */
package com.cxiny.po;

import java.util.Set;

/**
 * @author cxiny
 *
 */
public class Group {
	
	private int id;
	private String name;
	
	/*做双向关联*/
	private Set<User> users;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	
	
}
