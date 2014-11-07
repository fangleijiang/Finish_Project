package com.mail.util;



import java.util.Map;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;

import com.mail.model.Mail;
import com.mail.service.mailService;
import com.opensymphony.xwork2.ActionContext;
import com.sun.mail.imap.IMAPMessage;

public class RecieveMailUtil {
	
	private Folder folder;
	
	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	@SuppressWarnings("unused")
	public String RecieveMail(mailService mailSev,String username,String password) throws Exception{
		// 准备连接服务器的会话信息
				Properties props = new Properties();
				props.setProperty("mail.store.protocol", "imap");
				props.setProperty("mail.imap.host", "imap.163.com");
				props.setProperty("mail.imap.port", "143");
				
				// 创建Session实例对象
				Session session = Session.getInstance(props);
				
				// 创建IMAP协议的Store对象
				Store store = session.getStore("imap");
				// 获取用户登录系统
				// 连接邮件服务器
				store.connect(username, password);
				
				// 获得收件箱
				folder = store.getFolder("INBOX");
				// 以读写模式打开收件箱
				folder.open(Folder.READ_WRITE);
				
				// 获得收件箱的邮件列表
				Message[] messages = folder.getMessages();
				for (Message message : messages) {
					IMAPMessage msg = (IMAPMessage) message;
					Address[] froms = msg.getFrom();
					InternetAddress addr = (InternetAddress) froms[0];
					//String subject = MimeUtility.decodeText(msg.getSubject());
					Object o = msg.getContent();
					if (o instanceof Multipart) {
						Multipart multipart = (Multipart) o;
						
					} else if (o instanceof Part) {
						Part part = (Part) o;
						
					} else {
						//System.out.println("邮件地址="+addr.getAddress());
						Mail mail = new Mail();
						//System.out.println("id="+msg.getMessageID());
						mail.setMessageID(msg.getMessageID());
						mail.setMail_from((String)addr.getAddress());
						mail.setPersonalName((String)addr.getPersonal());
						mail.setMail_subject((String)msg.getSubject());
						mail.setDate(msg.getSentDate());
						mail.setMail_body((String)msg.getContent());
						mail.setStatus("服务器邮件");
						mailSev.save_host_mail(mail);
				
					}
					
				}
				
				// 关闭资源
				folder.close(false);
				store.close();
			
		return "RecieveMailSuccess";
	}
}
