package com.mail.service;

import com.mail.model.PageBean;



public interface PageService {
	/*
	 * 分页查询
	 * pageSize 每页显示多少条记录
	 * currentPage 当前页
	 * return  封装了显示每页信息的bean 
	 */
	
	public PageBean query_user_ForPage(int pageSize,int currentPage);
	public PageBean query_mail_ForPage(int pageSize,int currentPage,String status);
	public PageBean query_contactor_ForPage(int pageSize,int currentPage);
}
