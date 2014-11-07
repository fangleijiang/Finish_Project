package com.mail.action;

import java.util.Date;


import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mail.model.Contactors;
import com.mail.model.Mail;
import com.mail.model.PageBean;
import com.mail.service.ContactorService;
import com.mail.service.PageService;
import com.mail.service.mailService;
import com.mail.util.Email_Autherticator;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("mail_action")
@Scope("prototype")
public class MailAction extends ActionSupport {
	private Mail mail;
	private mailService mailSev;
	private ContactorService contacServ;
	private PageService pageService;
	private List<Mail> list_sent_mail;
	private List<Mail> list_draft_mail;
	private PageBean pageBean;
	private int currentPage = 1;
	private String idStr;
	private List<Mail> list_recieveMail;
	private Folder folder;
	public ContactorService getContacServ() {
		return contacServ;
	}
	@Resource
	public void setContacServ(ContactorService contacServ) {
		this.contacServ = contacServ;
	}
	

	public mailService getMailSev() {
		return mailSev;
	}

	@Resource
	public void setMailSev(mailService mailSev) {
		this.mailSev = mailSev;
	}

	public Mail getmail() {
		return mail;
	}

	public void setmail(Mail mail) {
		this.mail = mail;
	}

	
	public PageService getPageService() {
		return pageService;
	}
	@Resource
	public void setPageService(PageService pageService) {
		this.pageService = pageService;
	}
	
	
	public List<Mail> getList_draft_mail() {
		return list_draft_mail;
	}
	public void setList_draft_mail(List<Mail> list_draft_mail) {
		this.list_draft_mail = list_draft_mail;
	}
	public List<Mail> getList_sent_mail() {
		return list_sent_mail;
	}
	public void setList_sent_mail(List<Mail> list_sent_mail) {
		this.list_sent_mail = list_sent_mail;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	
	public Mail getMail() {
		return mail;
	}
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	
	public Folder getFolder() {
		return folder;
	}
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	
	public List<Mail> getList_recieveMail() {
		return list_recieveMail;
	}
	public void setList_recieveMail(List<Mail> list_recieveMail) {
		this.list_recieveMail = list_recieveMail;
	}

	public String sendMail() throws Exception {
		try {
			// 获取用户登录系统
			ActionContext actionContext = ActionContext.getContext();
			Map session1 = actionContext.getSession();
			String username = (String) session1.get("username");
			String password = (String) session1.get("password");

			Properties props = new Properties();// 获取系统环境
			Authenticator auth = new Email_Autherticator(username, password);// 用户验证
			props.put("mail.smtp.host", mail.getHost());
			props.put("mail.smtp.auth", "true");
			System.out.println(props);
			Session session = Session.getDefaultInstance(props, auth);
			// 设置session,和邮件服务器进行通讯
			MimeMessage message = new MimeMessage(session);
			message.setContent("Hello", "text/html");// 设置邮件格式
			message.setSubject(mail.getMail_subject());// 设置邮件主题
			message.setText(mail.getMail_body());// 文本内容，正文
			message.setHeader(mail.getMail_head_name(),
					mail.getMail_head_value());// 设置邮件标题
			message.setSentDate(new Date());// 邮件发送时间
			Address address = new InternetAddress(mail.getMail_from(),
					mail.getPersonalName());
			message.setFrom(address);// 设置邮件发送者的地ַ
			Address toaddress = new InternetAddress(mail.getMail_to());// 邮件接收者地址ַ
			message.addRecipient(Message.RecipientType.TO, toaddress);
			System.out.println(message);
			Transport.send(message);// 邮件发送
			
			//发邮件的同时，保留下发件人，存入联系人表中；
			Contactors contactor = new Contactors();
			contactor.setCon_name("未知");
			contactor.setEmail_address(mail.getMail_to());
			this.contacServ.save(contactor);
			
			
			//同时把邮件存进已发邮件表中
			mail.setStatus("已发邮件");
			this.mailSev.save(mail);
			
			
			System.out.println("Send Mail Ok!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public String saveTobox() throws Exception {
		mail.setStatus("未发邮件");
		this.mailSev.save(mail);
		return SUCCESS;
	}
	
	public String List_sent_Mail() throws Exception{
		this.pageBean = this.pageService.query_mail_ForPage(8, currentPage,"已发邮件");
		this.list_sent_mail = this.pageBean.getList_mail();
		return "list_sent_mail";
	}
	
	public String List_draft_Mail() throws Exception{
		this.pageBean = this.pageService.query_mail_ForPage(8, currentPage,"未发邮件");
		this.list_draft_mail = this.pageBean.getList_mail();
		return "list_draft_mail";
	}
	
	public String delete_sent_mail() throws Exception{
		Mail mail = new Mail();  
        String[] strs = idStr.split(",");  
        for (String s : strs) {  
        	mail.setId(Integer.parseInt(s));  
            try {  
               this.mailSev.delete(mail);
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
		return "delete_sent_mail";
	}
	
	public String delete_draft_mail() throws Exception{
		Mail mail = new Mail();  
        String[] strs = idStr.split(",");  
        for (String s : strs) {  
        	mail.setId(Integer.parseInt(s));  
            try {  
               this.mailSev.delete(mail);
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
		return "delete_draft_mail";
	}
	public String delete_recieve_mail() throws Exception{
		Mail mail = new Mail();  
        String[] strs = idStr.split(",");  
        for (String s : strs) {  
        	mail.setId(Integer.parseInt(s));  
            try {  
               this.mailSev.delete(mail);
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
		return "delete_recieve_mail";
	}
	public String find_mail_by_id() throws Exception{
		mail = this.mailSev.find_mail_By_id(mail.getId());
		return "find_mail";
	}
	public String find_recievemail_by_id() throws Exception{
		mail = this.mailSev.find_mail_By_id(mail.getId());
		return "find_recievemail";
	}
	
	
	

	public String List_recieveMail() throws Exception{
		this.pageBean = this.pageService.query_mail_ForPage(8, currentPage,"服务器邮件");
		this.list_recieveMail = this.pageBean.getList_mail();
		return "List_recieveMail";
	}
	

}
