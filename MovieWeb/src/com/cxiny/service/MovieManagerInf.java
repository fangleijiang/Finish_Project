/**
 * 
 */
package com.cxiny.service;

import java.util.List;

import com.cxiny.po.Movie;
import com.cxiny.po.User;
import com.cxiny.util.InterPretorModel;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public interface MovieManagerInf {
	public Movie add(Movie movie);
	/*public List<Movie> listAll(InterPretorModel interPretorModel);*/
	public List<Movie> search(InterPretorModel interPretorModel, PageModel pageModel);
	public List<Movie> timeRank();
	public List<Movie> clickRank();
	public List<Movie> classicRank();
	public List<Movie> school();
	public List<Movie> list(InterPretorModel interPretorModel, PageModel pageModel,String note);
}
