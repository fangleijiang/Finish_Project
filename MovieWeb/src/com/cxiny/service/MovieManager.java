/**
 * 
 */
package com.cxiny.service;

import java.util.List;

import com.cxiny.dao.MovieDaoInf;
import com.cxiny.po.Movie;
import com.cxiny.po.User;
import com.cxiny.util.InterPretorModel;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public class MovieManager implements MovieManagerInf {
	
	private MovieDaoInf movieDao;
	
	/**
	 * @param movieDao the movieDao to set
	 */
	public void setMovieDao(MovieDaoInf movieDao) {
		this.movieDao = movieDao;
	}

	/* (non-Javadoc)
	 * @see com.cxiny.manager.MovieManagerInf#add(com.cxiny.po.Movie)
	 */
	@Override
	public Movie add(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.add(movie);
	}

/*	@Override
	public List<Movie> listAll(InterPretorModel interPretorModel) {
		// TODO Auto-generated method stub
		return movieDao.listAll(interPretorModel);
	}*/
	@Override
	public List<Movie> school() {
		return movieDao.school();
	}
	@Override
	public List<Movie> list(InterPretorModel interPretorModel,PageModel pageModel,String note) {
		// TODO Auto-generated method stub
		if(note.equals("listAll")){
			return movieDao.listAll(interPretorModel,pageModel);
		}else{
			return movieDao.list(interPretorModel,pageModel);
		}
		
	}
	@Override
	public List<Movie> search(InterPretorModel interPretorModel,PageModel pageModel) {
		// TODO Auto-generated method stub
		return movieDao.search(interPretorModel,pageModel);
	}
	@Override
	public List<Movie> timeRank() {
		return movieDao.timeRank();
	}
	@Override
	public List<Movie> clickRank() {
		return movieDao.clickRank();
	}
	@Override
	public List<Movie> classicRank(){
		return movieDao.classicRank();
	}
}
