package com.mail.action;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Scope("prototype")
public class GetMailAction extends ActionSupport {
	
	public String getMail() throws Exception{
		Properties props = new Properties();
		//设置接收邮件服务器的地址，这里还是以网易163为例 
		props.setProperty("mail.smtp.host", "smtp.163.com") ;
		//存储接收邮件服务器使用的协议，这里以smtp为例  
		props.setProperty("mail.store.protocol", "smtp");
		//根据属性新建一个邮件会话.
		Session session = Session.getInstance(props);
		//从会话对象中获得smtp协议的Store对象
		Store store = session.getStore("smtp");
		//如果需要查看接收邮件的详细信息，需要设置Debug标志  
		session.setDebug(false);  
		
		//以某个邮箱帐户的身份连接上POP3 或IMAP4服务器。
		store.connect("smtp.163.com", "用户名", "密码");
		
		//调用Store的getFolder方法，获取代表该帐户的邮箱中的某个邮件夹的Folder对象。
		
		//获取邮件服务器的收件箱  
		Folder folder = store.getFolder("INBOX");  
		//以只读权限打开收件箱  
		folder.open(Folder.READ_ONLY);
		//获取收件箱中的邮件，也可以使用getMessage(int 邮件的编号)来获取具体某一封邮件  
		Message message[] = folder.getMessages();  
		
		for(int i = 0 ; i < message.length; i++){
			
			
		}
		//关闭连接  
		folder.close(false);  
		store.close();  
		
		return SUCCESS;
	}
}
