/**
 * 
 */
package com.cxiny.po;

import java.util.Date;

/**
 * @author cxiny
 *
 */
public class User {
	
	private int id;
	private String name;
	private Date birthday;
	private Date regday;
	private Group group;
	
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getRegday() {
		return regday;
	}

	public void setRegday(Date regday) {
		this.regday = regday;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
