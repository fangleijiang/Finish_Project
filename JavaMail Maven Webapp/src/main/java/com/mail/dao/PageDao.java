package com.mail.dao;
import java.util.List;

import com.mail.model.Contactors;
import com.mail.model.Mail;
import com.mail.model.User;

public interface PageDao {
	
	public int getAllRow(String hql);
	
	public List<User> query_usr_ForPage(final String hql,final int offset,final int length);
	
	public List<Mail> query_mail_ForPage(final String hql,final int offset,final int length);
	
	public List<Contactors> query_contactor_ForPage(final String hql,final int offset,final int length);
}
