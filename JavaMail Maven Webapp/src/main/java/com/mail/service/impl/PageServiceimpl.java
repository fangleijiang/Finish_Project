package com.mail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mail.dao.PageDao;
import com.mail.model.Contactors;
import com.mail.model.Mail;
import com.mail.model.PageBean;
import com.mail.model.User;
import com.mail.service.PageService;
@Service
public class PageServiceimpl implements PageService{

	private PageDao pageDao;
	
	
	public PageDao getPageDao() {
		return pageDao;
	}
	@Resource
	public void setPageDao(PageDao pageDao) {
		this.pageDao = pageDao;
	}

	@Override
	public PageBean query_user_ForPage(int pageSize, int currentPage) {
		String hql = "from User user order by user.id desc";
		int allRow = this.pageDao.getAllRow(hql);//总记录条数
		int totalPage =PageBean.countTotalPage(pageSize, allRow);//总页数
		int offset = PageBean.currentOffset(pageSize, currentPage);//当前页开始记录
		int length = pageSize;//每页记录数
		int countCurrentPage = PageBean.countCurrentPage(currentPage);//当前页
		List<User> list_user = this.pageDao.query_usr_ForPage(hql, offset, length);
		//将得到的参数注入到pagebean中
		PageBean pageBean = new PageBean();
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setCurrentPage(countCurrentPage);
		pageBean.setPageSize(pageSize);
		pageBean.setList_user(list_user);
		pageBean.init();
		return pageBean;
	}

	@Override
	public PageBean query_mail_ForPage(int pageSize, int currentPage,String status) {
		String hql = "from Mail mail where mail.status like '%"+status+"%' order by mail.id desc";
		int allRow = this.pageDao.getAllRow(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		int offset = PageBean.currentOffset(pageSize, currentPage);
		int length = pageSize;//每页记录数
		int countCurrentPage = PageBean.countCurrentPage(currentPage);
		List<Mail> list_mail = this.pageDao.query_mail_ForPage(hql, offset, length);
	
		PageBean pageBean = new PageBean();
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setCurrentPage(countCurrentPage);
		pageBean.setPageSize(pageSize);
		pageBean.setList_mail(list_mail);
		pageBean.init();
		return pageBean;
	}
	@Override
	public PageBean query_contactor_ForPage(int pageSize, int currentPage) {
		String hql = "from Contactors contacs order by contacs.id desc";
		int allRow = this.pageDao.getAllRow(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		int offset = PageBean.currentOffset(pageSize, currentPage);
		int length = pageSize;//每页记录数
		int countCurrentPage = PageBean.countCurrentPage(currentPage);
		List<Contactors> list_contactor = this.pageDao.query_contactor_ForPage(hql, offset, length);
	
		PageBean pageBean = new PageBean();
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setCurrentPage(countCurrentPage);
		pageBean.setPageSize(pageSize);
		pageBean.setList_contactor(list_contactor);
		pageBean.init();
		return pageBean;
	}

}
