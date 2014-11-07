/**
 * 
 */
package com.cxiny.util;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxiny.po.Group;
import com.cxiny.po.Movie;
import com.cxiny.po.User;
import com.cxiny.service.GroupManager;
import com.cxiny.service.GroupManagerInf;
import com.cxiny.service.MovieManagerInf;
import com.cxiny.service.UserManager;
import com.cxiny.service.UserManagerInf;

/**
 * @author cxiny
 *
 */
public class InitData {
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext*.xml");
		System.out.println(applicationContext);
		UserManagerInf userMgr = applicationContext.getBean("userMgr",UserManagerInf.class);
		GroupManagerInf groupMgr = applicationContext.getBean("groupMgr", GroupManagerInf.class);
		MovieManagerInf movieMgr =  applicationContext.getBean("movieMgr", MovieManagerInf.class);
		System.out.println(userMgr);
		System.out.println(groupMgr);
		System.out.println(movieMgr);
		
		
		Group g1 = new Group();
		g1.setName("管理员");
		groupMgr.save(g1);
		
		Group g2 = new Group();
		g2.setName("用户");
		groupMgr.save(g2);
		
		Calendar c = Calendar.getInstance();
		for(int i=0;i<100;i++){
			User user = new User();
			user.setName("cxiny_"+(i+1));
			c.set(1980, 1, 1);
			int monthRand = (int) (Math.random()*240);
			c.add(Calendar.MONTH, monthRand);
			user.setBirthday(c.getTime());
			c.add(Calendar.MONTH, 240);
			user.setRegday(c.getTime());
			if(monthRand%2==0){
				user.setGroup(g1);
			}else {
				user.setGroup(g2);
			}
			userMgr.add(user);
		}
		
		for(int i=0;i<50;i++){
			Movie movie = new Movie();
			movie.setName("木府风云");
			movie.setIntro("好看的电影");
			movie.setRole("周星驰");
			movie.setPhoto("/MovieWeb/images_film/r1_1.jpg");
			movie.setTypeBanner("电影");
			movie.setTypeType("动作");
			movie.setTypeField("大陆");
			movie.setTypeSuper("周星驰");
			movie.setUploadTime(new Date());
			movie.setClickNum(0);
			
			
			movieMgr.add(movie);

		}
	
	}

}
