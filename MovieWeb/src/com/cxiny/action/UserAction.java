/**
 * 
 */
package com.cxiny.action;

import java.util.List;

import sun.net.www.content.text.plain;

import com.cxiny.po.Group;
import com.cxiny.po.User;
import com.cxiny.service.GroupManagerInf;
import com.cxiny.service.UserManagerInf;
import com.cxiny.util.PageModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author cxiny
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private static final String LIST="list";
	private static final String LIST_LOAD="list_load";
	private static final String LOAD = "load";
	private static final String MODIFY = "modify";
	private static final String ADDUSER ="addUser";
	
	private User user;
	
	private UserManagerInf userMgr;
	private GroupManagerInf groupMgr;
	
	private List<User> list;
	
	/*用于获取页面传递的参数*/
	private int page;
	private int pageSize;
	
	private PageModel pageModel;
	
	public int[] uids;/*用于批量删除*/
	
	private String msg;
	
	private List<Group> groupList;
	
	private String queryUserName = null;
	
	private String queryGroupName = null;
	
	public UserAction() {
		// TODO Auto-generated constructor stub
		this.page = 1;
		this.pageSize = 10;
	
	}
	

	public User getUser() {
		return user;
	}

	public void setUserMgr(UserManagerInf userMgr) {
		this.userMgr = userMgr;
	}

	public List<User> getList() {
		return list;
	}
	

	public void setPage(int page) {
		this.page = page;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public PageModel getPageModel() {
		return pageModel;
	}
	
	public void setUids(int[] uids) {
		this.uids = uids;
	}
	
	public int getPage() {
		return page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public List<Group> getGroupList() {
		return groupList;
	}

	public void setGroupMgr(GroupManagerInf groupMgr) {
		this.groupMgr = groupMgr;
	}


	public String getQueryUserName() {
		return queryUserName;
	}


	public void setQueryUserName(String queryUserName) {
		this.queryUserName = queryUserName;
	}


	public String getQueryGroupName() {
		return queryGroupName;
	}


	public void setQueryGroupName(String queryGroupName) {
		this.queryGroupName = queryGroupName;
	}


	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		user = new User();
		return user;
	}
	
	public String add() throws Exception {
		System.out.println("UserAction add()...");
		userMgr.add(user);
		return SUCCESS;
	}
	
	public String load()throws Exception {
		groupList = groupMgr.load();
		System.out.println("UserAction load()..."+uids[0]);
		user = userMgr.load(uids[0]);
		if(uids!=null){
			
			
		}
		return LOAD;
	}
	
	public String list()throws Exception {
		pageModel = new PageModel();
		pageModel.setPage(page);
		pageModel.setPageSize(pageSize);
		/*list = userMgr.list(pageModel);*/
		list = userMgr.list(pageModel,queryUserName, queryGroupName);
		return LIST;
	}
	
	public String delete()throws Exception {

		int deleteCount = userMgr.delete(uids);
		return LIST_LOAD;
	}
	
	public String modify()throws Exception {
		user = userMgr.modify(user);
		return MODIFY;
	}
	
	public String addUser()throws Exception {
		String resultCode = ADDUSER;
		if(user.getName() != null){
			userMgr.add(user);
			resultCode = MODIFY;
		}else {
			groupList = groupMgr.load();
		}
		return resultCode;
		
	}
	
}
