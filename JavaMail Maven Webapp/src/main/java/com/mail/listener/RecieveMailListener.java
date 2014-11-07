/**
 * 
 */
package com.mail.listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mail.action.MailAction;

/**
 * @author fangleijiang
 *
 */
public class RecieveMailListener implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		/* Timer timer  = new Timer();
	        timer.schedule(new TimerTask() {

	            @Override
	            public void run() {
	              MailAction mailAction = new MailAction();
	              try {
					mailAction.RecieveMail();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	            }
	        }, 20000);
*/
	}

}
