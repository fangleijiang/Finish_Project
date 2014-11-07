package com.mail.action;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mail.model.PageBean;
import com.mail.model.User;
import com.mail.service.PageService;
import com.mail.service.mailService;
import com.mail.service.userService;
import com.mail.util.RecieveMailUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@Component("user_action")
@Scope("prototype")
public class UserAction extends ActionSupport {
	private userService userservice;
	private User user;
	private mailService mailSev;
	private PageService pageService;
	private List<User> list_user;

	private PageBean pageBean;
	
	private int currentPage = 1;
	public userService getUserservice() {
		return userservice;
	}
	@Resource
	public void setUserservice(userService userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public PageService getPageService() {
		return pageService;
	}
	@Resource
	public void setPageService(PageService pageService) {
		this.pageService = pageService;
	}
	public List<User> getList_user() {
		return list_user;
	}
	public void setList_user(List<User> list_user) {
		this.list_user = list_user;
	}
	
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	
	public mailService getMailSev() {
		return mailSev;
	}
	@Resource
	public void setMailSev(mailService mailSev) {
		this.mailSev = mailSev;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String checkLogin() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("username", user.getUsername());
		session.put("password", user.getPassword());
		if (this.userservice.checkLogin(this.getUser()) == true) {
			Timer timer  = new Timer();
	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	            	RecieveMailUtil rvu = new RecieveMailUtil();
	              try {
	            	  rvu.RecieveMail(mailSev,user.getUsername(),user.getPassword());
				} catch (Exception e) {
					e.printStackTrace();
				}
	            }
	        }, 20000);
			return SUCCESS;
		}
		return INPUT;

	}
	
	public String List_User() throws Exception{
		this.pageBean = this.pageService.query_user_ForPage(8, currentPage);
		this.list_user = this.pageBean.getList_user();
		return SUCCESS;
	}

}
