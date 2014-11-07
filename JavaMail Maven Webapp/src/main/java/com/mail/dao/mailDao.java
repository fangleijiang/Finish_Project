package com.mail.dao;

import java.util.List;

import com.mail.model.Mail;

public interface mailDao {
	public void save(Mail mail);
	public void delete(Mail mail);
	public Mail find_mail_By_id(int id);

	public void save_host_mail(Mail mail);
}
