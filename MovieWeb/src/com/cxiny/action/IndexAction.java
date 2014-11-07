/**
 * 
 */
package com.cxiny.action;

import java.util.List;

import org.omg.CORBA.Request;

import com.cxiny.po.Movie;
import com.cxiny.po.User;
import com.cxiny.service.MovieManagerInf;
import com.cxiny.util.InterPretorModel;
import com.cxiny.util.Interpretor;
import com.cxiny.util.PageModel;
import com.cxiny.util.Utf_8;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author cxiny
 *
 */
public class IndexAction  extends ActionSupport implements ModelDriven<Movie>{
	
	private static final String GROUP="group";
	private static final String MORE="more";
	private static final String PLAY="play";
	
	public MovieManagerInf movieMgr;
	
	public Movie movie = null;
	
	private List<Movie> list;
	private List<Movie> listTime;
	private List<Movie> listClick;
	private List<Movie> listClassic;
	private List<Movie> listSchool;
	
	public int page;
	
	public int pageSize;
	
	private PageModel pageModel;
	
	private long id;
	private String queryName = null;
	private String queryRole = null;
	private String queryTypeBanner = null;
	private String queryTypeType = null;
	private String queryTypeField = null;
	
	private InterPretorModel interPretorModel;

	
	private String flag = null;
	private String mark = null;
	private String note = null;
	
	private Interpretor interpretor;
	
	public IndexAction() {
		// TODO Auto-generated constructor stub
		this.page = 1;
		this.pageSize = 42;
		
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param movieMgr the movieMgr to set
	 */
	public void setMovieMgr(MovieManagerInf movieMgr) {
		this.movieMgr = movieMgr;
	}

	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @return the list
	 */
	public List<Movie> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Movie> list) {
		this.list = list;
	}

	/**
	 * @return the listTime
	 */
	public List<Movie> getListTime() {
		return listTime;
	}

	/**
	 * @param listTime the listTime to set
	 */
	public void setListTime(List<Movie> listTime) {
		this.listTime = listTime;
	}

	/**
	 * @return the listClick
	 */
	public List<Movie> getListClick() {
		return listClick;
	}

	/**
	 * @param listClick the listClick to set
	 */
	public void setListClick(List<Movie> listClick) {
		this.listClick = listClick;
	}

	/**
	 * @return the listClassic
	 */
	public List<Movie> getListClassic() {
		return listClassic;
	}

	/**
	 * @param listClassic the listClassic to set
	 */
	public void setListClassic(List<Movie> listClassic) {
		this.listClassic = listClassic;
	}

	/**
	 * @return the listSchool
	 */
	public List<Movie> getListSchool() {
		return listSchool;
	}

	/**
	 * @param listSchool the listSchool to set
	 */
	public void setListSchool(List<Movie> listSchool) {
		this.listSchool = listSchool;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
			this.page = page;
	}
	public void setPage(String page) {
		this.page =  Integer.parseInt(page);
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = Integer.parseInt(pageSize);
	}

	/**
	 * @return the pageModel
	 */
	public PageModel getPageModel() {
		return pageModel;
	}

	/**
	 * @param pageModel the pageModel to set
	 */
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the queryName
	 */
	public String getQueryName() {
		return queryName;
	}

	/**
	 * @param queryName the queryName to set
	 */
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	/**
	 * @param queryRole the queryRole to set
	 */
	public void setQueryRole(String queryRole) {
		this.queryRole = queryRole;
	}

	/**
	 * @param queryTypeBanner the queryTypeBanner to set
	 */
	public void setQueryTypeBanner(String queryTypeBanner) {
		this.queryTypeBanner = queryTypeBanner;
	}

	/**
	 * @param queryTypeType the queryTypeType to set
	 */
	public void setQueryTypeType(String queryTypeType) {
		this.queryTypeType = queryTypeType;
	}

	/**
	 * @param queryTypeField the queryTypeField to set
	 */
	public void setQueryTypeField(String queryTypeField) {
		this.queryTypeField = queryTypeField;
	}

	/**
	 * @return the interpretor
	 */
	public Interpretor getInterpretor() {
		return interpretor;
	}

	/**
	 * @param interpretor the interpretor to set
	 */
	public void setInterpretor(Interpretor interpretor) {
		this.interpretor = interpretor;
	}

	/**
	 * @return the interPretorModel
	 */
	public InterPretorModel getInterPretorModel() {
		return interPretorModel;
	}

	/**
	 * @param interPretorModel the interPretorModel to set
	 */
	public void setInterPretorModel(InterPretorModel interPretorModel) {
		this.interPretorModel = interPretorModel;
	}
/*	public void setInterPretorModel(String interPretorModel) {
		Object f = (Object)interPretorModel;
		this.interPretorModel = (InterPretorModel)f;
	}*/

	@Override
	public Movie getModel() {
		// TODO Auto-generated method stub
		movie = new Movie();
		return movie;
	}
	
	public String add() throws Exception{
		movieMgr.add(movie);
		return SUCCESS;
	}
	
/*	public String listAll()throws Exception {
		
		interPretorModel.setQueryName(queryName);
		interPretorModel.setQueryRole(queryRole);
		interPretorModel.setQueryTypeBanner(queryTypeBanner);
		interPretorModel.setQueryTypeField(queryTypeField);
		interPretorModel.setQueryTypeType(queryTypeType);
		
		interPretorModel = interpretor.getInterpretor(interPretorModel);
		
		list = movieMgr.listAll(interPretorModel);
		
		if(flag.equals("banner")){
			 listClick = movieMgr.clickRank();
			 listTime = movieMgr.timeRank();
			 listClassic = movieMgr.classicRank();
			 listSchool = movieMgr.school();
			return GROUP;
		}else{
			listClick = movieMgr.clickRank();
			return SUCCESS;
		}
	}*/
	
	public String list()throws Exception {
		
		interPretorModel.setQueryName(queryName);
		interPretorModel.setQueryRole(queryRole);
		interPretorModel.setQueryTypeBanner(queryTypeBanner);
		interPretorModel.setQueryTypeField(queryTypeField);
		interPretorModel.setQueryTypeType(queryTypeType);
	
		pageModel = new PageModel();
	
		pageModel.setPage(page);
		pageModel.setPageSize(pageSize);
		interPretorModel = interpretor.getInterpretor(interPretorModel);
		/*list = userMgr.list(pageModel);*/
		list = movieMgr.list(interPretorModel,pageModel,note);
		/*interPretorModel = interpretor.setInterpretor(interPretorModel);*/
		
		if(flag!=null){
			if(flag.equals("banner")){
				 listClick = movieMgr.clickRank();
				 listTime = movieMgr.timeRank();
				 listClassic = movieMgr.classicRank();
				 listSchool = movieMgr.school();
				return GROUP;
			}else if(flag.equals("index")){
				listClick = movieMgr.clickRank();
				return SUCCESS;
			}
		}
		return MORE;
	}
	
	public String search()throws Exception {
		this.setMark("2");
		interPretorModel.setQueryName(queryName);
		interPretorModel.setQueryRole(queryRole);
		interPretorModel.setQueryTypeBanner(queryTypeBanner);
		interPretorModel.setQueryTypeField(queryTypeField);
		interPretorModel.setQueryTypeType(queryTypeType);
		
		pageModel = new PageModel();
		
		interPretorModel = interpretor.getInterpretor(interPretorModel);

		pageModel.setPage(page);
		pageModel.setPageSize(pageSize);
		/*interPretorModel = interpretor.getInterpretor(interPretorModel);*/
		/*list = userMgr.list(pageModel);*/
		list = movieMgr.search(interPretorModel,pageModel);
		interPretorModel = interpretor.setInterpretor(interPretorModel);
		return MORE;
	}
	public String play(){
		/*System.out.println(this.id);*/
		return PLAY;
	}
}
