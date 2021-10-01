package utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailReport 
{
	//sample created - not in use
	public static void sendSimpleMail() throws Exception
	{
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("/Users/my_appie_pie/Documents/Selenium/workspaceNew/automation.testng.project/Reports/NewReport.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Test report");
		  attachment.setName("NewReport.html"); 

		  // Create the email message
		 MultiPartEmail email = new MultiPartEmail();
		 email.setHostName("smtp.googlemail.com");
		 email.setSmtpPort(465);
		 email.setSSLOnConnect(true);
         email.setStartTLSEnabled(true);
         email.addTo("vamsilatha.b@gmail.com", "vamsi");
		 email.setFrom("noreply@gmail.com", "Me");
         email.setAuthentication("test@gmail.com", "test");

		  email.setSubject("Test automation report");
		  email.setMsg("Hi All, \nPlease find the Products test report \n\n\n"
			  		+ "******* This is an auto-generated mail. Please do not reply********");
		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
	}
	
}
