/**
 * 
 */
package com.cxiny.util;

/**
 * @author cxiny
 *
 */
public class PageModel {
	private int page = 1;
	
	private int pageSize = 10;
	
	private long countAll;
	
	private int pageCount;
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(page>0){
			this.page = page;
		}
	}
	public void setPage(String page) {
		if(Integer.parseInt(page)>0){
			this.page = Integer.parseInt(page);
		}
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		if(Integer.parseInt(pageSize)>0){
			this.pageSize = Integer.parseInt(pageSize);
		}
		
	}
	
	public void setPageSize(int pageSize) {
		if(pageSize>0){
			this.pageSize = pageSize;
		}
	}
	
	public long getCountAll() {
		return countAll;
	}
	
	public void setCountAll(long countAll) {
		this.countAll = countAll;
	}
	
	public int getPageCount() {
		return pageCount = (int) ((countAll%pageSize == 0)?(countAll/pageSize):(countAll/pageSize+1));
	}
	
}
