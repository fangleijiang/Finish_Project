package com.mail.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mail.model.Contactors;
import com.mail.model.PageBean;
import com.mail.service.ContactorService;
import com.mail.service.PageService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("contactor_action")
@Scope("prototype")
public class ContactorAction extends ActionSupport {
	
	private Contactors contactor;
	
	private ContactorService contacServ;
	
	private PageBean pageBean;
	
	private PageService pageService;
	
	private int currentPage = 1;
	
	private List<Contactors> list_contactors;

	
	public Contactors getContactor() {
		return contactor;
	}
	public void setContactor(Contactors contactor) {
		this.contactor = contactor;
	}
	public ContactorService getContacServ() {
		return contacServ;
	}
	@Resource
	public void setContacServ(ContactorService contacServ) {
		this.contacServ = contacServ;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public PageService getPageService() {
		return pageService;
	}

	@Resource
	public void setPageService(PageService pageService) {
		this.pageService = pageService;
	}
	
	
	public List<Contactors> getList_contactors() {
		return list_contactors;
	}

	public void setList_contactors(List<Contactors> list_contactors) {
		this.list_contactors = list_contactors;
	}
	//列出所有的联系人
	public String List_Contactors() throws Exception{
		this.pageBean = this.pageService.query_user_ForPage(8, currentPage);
		this.list_contactors = this.pageBean.getList_contactor();
		return SUCCESS;
	}
	//手动添加联系人
	public String add_Contactors() throws Exception{
		this.contacServ.save(contactor);
		return SUCCESS;
	}

}
