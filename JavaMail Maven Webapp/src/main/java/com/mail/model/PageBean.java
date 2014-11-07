package com.mail.model;

import java.util.List;

public class PageBean {
	
	private int allRow;//总记录数
	private int totalPage;//总页数
	private int currentPage;//当前页
	private int pageSize;//每页的记录数
	private boolean isFirstPage;//判断是否是第一页
	private boolean isLastPage;//判断是否是最后一页
	private boolean hasPreviousPage;//判断是否有前一页
	private boolean hasNextPage;//判断是否有下一页
	private List<User> list_user;
	private List<Mail> list_mail;
	private List<Contactors> list_contactor;
	public int getAllRow() {
		return allRow;
	}


	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public boolean isFirstPage() {
		return isFirstPage;
	}


	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}


	public boolean isLastPage() {
		return isLastPage;
	}


	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}


	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}


	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}


	public boolean isHasNextPage() {
		return hasNextPage;
	}


	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}


	public int pageAccont(int page) {
		return page < 1 ? 1 : page;
	}
	
	
	
	public List<User> getList_user() {
		return list_user;
	}


	public void setList_user(List<User> list_user) {
		this.list_user = list_user;
	}


	public List<Mail> getList_mail() {
		return list_mail;
	}


	public void setList_mail(List<Mail> list_mail) {
		this.list_mail = list_mail;
	}


	public List<Contactors> getList_contactor() {
		return list_contactor;
	}


	public void setList_contactor(List<Contactors> list_contactor) {
		this.list_contactor = list_contactor;
	}


	public void init(){
		this.allRow = allRow;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	
	}


	/*
	 * 计算总页数
	 * pageSize 每页的记录数
	 * allRow 总记录数
	 * @return 总页数 
	 * 
	 */
	public static int countTotalPage(final int pageSize,final int allRow){
		int total = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize + 1;
		return total;
	}

	/*
	 * 计算当前页开始记录
	 * pageSize 每页记录数
	 * currentPage 当前第几页
	 * @return 当前开始记录号
	 */
	public static int currentOffset(final int pageSize,final int currentPage){
		final int offset = pageSize * (currentPage - 1);
		return offset;
	}
	
	/*
	 * 计算当前页
	 * 如果为0，则用1代替
	 * 
	 */
	public static int countCurrentPage(int page){
		final int current = (page == 0 ? 1 : page);
		return current;
		
		
	}

}
