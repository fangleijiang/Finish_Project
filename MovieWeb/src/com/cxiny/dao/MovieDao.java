/**
 * 
 */
package com.cxiny.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cxiny.po.Movie;
import com.cxiny.po.User;
import com.cxiny.util.InterPretorModel;
import com.cxiny.util.PageModel;

/**
 * @author cxiny
 *
 */
public class MovieDao implements MovieDaoInf {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Movie add(Movie movie) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(movie);
		return movie;
		
	}
	
	@Override
	public List<Movie> listAll(InterPretorModel interPretorModel,PageModel pageModel) {
		// TODO Auto-generated method stub
		StringBuffer sbConditions =new StringBuffer("where 1 = 1 and m.typeBanner like ?");
		Session session = sessionFactory.getCurrentSession();
		
		StringBuffer sb1 = new StringBuffer("select count(*) from Movie m ");
		
		long countAll = (Long) session.createQuery(sb1.append(sbConditions).toString())
				.setParameter(0,"%"+interPretorModel.getQueryTypeBanner()+"%")
				.list().get(0);
		pageModel.setCountAll(countAll);
		long page = pageModel.getPage();
		int pageCount = pageModel.getPageCount();
		int pageSize = pageModel.getPageSize();

		if (pageSize > countAll) {
			pageSize = (int) countAll;
			pageModel.setPageSize(pageSize);
		}

		if (page > pageCount) {
			page = pageCount;
		}
		int startIndex = (int) ((page - 1) * pageSize);
		
		StringBuffer sb2 = new StringBuffer("select m from Movie m ");
		
		List<Movie> movies = session.createQuery(sb2.append(sbConditions).toString())
				.setParameter(0,"%"+interPretorModel.getQueryTypeBanner()+"%")
				.setFirstResult(startIndex).setMaxResults(pageSize).list();
		return movies;
	}
	
	@Override
	public List<Movie> school() {
		// TODO Auto-generated method stub
		
		String sb1 = new String("select s from Movie as s where s.typeBanner = 'У԰' order by s.clickNum desc limit 15"); 

		Session session = sessionFactory.getCurrentSession();
		List<Movie> movies = session.createQuery(sb1).list();
		return movies;
	}

	@Override
	public List<Movie> list(InterPretorModel interPretorModel,PageModel pageModel) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("select count(*) from Movie m "); 
		StringBuffer sbConditions =new StringBuffer("where 1 = 1 and m.typeBanner = ? and m.typeType = ?");
		
		Session session = sessionFactory.getCurrentSession();
		long countAll = (Long) session.createQuery(sb1.append(sbConditions).toString())
				.setParameter(0,interPretorModel.getQueryTypeBanner())
				.setParameter(1,interPretorModel.getQueryTypeType())
				.list().get(0);
		pageModel.setCountAll(countAll);

		long page = pageModel.getPage();
		int pageCount = pageModel.getPageCount();
		int pageSize = pageModel.getPageSize();

		if (pageSize > countAll) {
			pageSize = (int) countAll;
			pageModel.setPageSize(pageSize);
		}

		if (page > pageCount) {
			page = pageCount;
		}

		int startIndex = (int) ((page - 1) * pageSize);
		
		StringBuffer sb2 = new StringBuffer("select m from Movie m ");
		
		List<Movie> movies = session.createQuery(sb2.append(sbConditions).toString())
				.setParameter(0,interPretorModel.getQueryTypeBanner())
				.setParameter(1,interPretorModel.getQueryTypeType())
				.setFirstResult(startIndex).setMaxResults(pageSize).list();
		return movies;
	}
	
	@Override
	public List<Movie> search(InterPretorModel interPretorModel,PageModel pageModel) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("select count(*) from Movie m "); 
		StringBuffer sbConditions =new StringBuffer("where m.name like ? or m.typeType like ? or m.typeField like ? or m.typeSuper like ?");
		
		Session session = sessionFactory.getCurrentSession();
		long countAll = (Long) session.createQuery(sb1.append(sbConditions).toString())
				.setParameter(0,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(1,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(2,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(3,"%"+interPretorModel.getQueryName()+"%")
				.list().get(0);
		pageModel.setCountAll(countAll);

		long page = pageModel.getPage();
		int pageCount = pageModel.getPageCount();
		int pageSize = pageModel.getPageSize();

		if (pageSize > countAll) {
			pageSize = (int) countAll;
			pageModel.setPageSize(pageSize);
		}

		if (page > pageCount) {
			page = pageCount;
		}

		int startIndex = (int) ((page - 1) * pageSize);
		
		StringBuffer sb2 = new StringBuffer("select m from Movie m ");
		
		List<Movie> movies = session.createQuery(sb2.append(sbConditions).toString())
				.setParameter(0,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(1,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(2,"%"+interPretorModel.getQueryName()+"%")
				.setParameter(3,"%"+interPretorModel.getQueryName()+"%")
				.setFirstResult(startIndex).setMaxResults(pageSize).list();
		return movies;
	}
	@Override
	public List<Movie> timeRank() {
		// TODO Auto-generated method stub
		
		String sb1 = new String("select t from Movie as t order by t.uploadTime desc limit 15"); 

		Session session = sessionFactory.getCurrentSession();
		List<Movie> movies = session.createQuery(sb1).list();
		return movies;
	}
	
	@Override
	public List<Movie> clickRank() {
		// TODO Auto-generated method stub
		
		String sb1 = new String("select t from Movie as t where t in " +
				"(select nt from Movie nt WHERE TO_DAYS(NOW()) - TO_DAYS(uploadTime) <= 365) order by t.clickNum desc limit 15"); 

		Session session = sessionFactory.getCurrentSession();
		List<Movie> movies = session.createQuery(sb1).list();
		return movies;
	}
	
	@Override
	public List<Movie> classicRank() {
		// TODO Auto-generated method stub
		
		String sb1 = new String("select t from Movie as t where t in " +
				"(select nt from Movie nt WHERE TO_DAYS(NOW()) - TO_DAYS(uploadTime) >= 365) order by t.clickNum desc limit 15"); 

		Session session = sessionFactory.getCurrentSession();
		List<Movie> movies = session.createQuery(sb1).list();
		return movies;
	}
}
