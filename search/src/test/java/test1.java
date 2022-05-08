import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class test1 {

    private static final String senderEmail = "test@logicbig.com";//change with your sender email
    private static final String senderPassword = "12345678";//change with your sender password

    private void sendEmail() throws AddressException, MessagingException
    {
        /**
         * Sender's credentials
         * */
        //String fromUser = "user-email@gmail.com";
        String fromUser = "yw_acton";
        String fromUserEmailPassword = "gb@ga1994";

        String emailHost = "smtp.gmail.com";
        // String emailHost = "localhost";
        Session session = createSession();
        Transport transport = session.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessage(session);
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }

    private MimeMessage draftEmailMessage(Session mailSession) throws AddressException, MessagingException
    {
        // String[] toEmails = { "computerbuzz@gmail.com" };
        String[] toEmails = { "yw_acton@yahoo.com" };
        String emailSubject = "Test email subject";
        String emailBody = "This is an email sent by http://www.computerbuzz.in.";
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }

    private static Session createSession() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "false");//Outgoing server requires authentication
        props.put("mail.smtp.starttls.enable", "true");//TLS must be activated
        props.put("mail.smtp.host", "localhost"); //Outgoing server (SMTP) - change it to your SMTP server
        props.put("mail.smtp.port", "587");//Outgoing port

        Session session = Session.getDefaultInstance(props, null);
        return session;
    }

    public static void main(String[] args) throws MessagingException {

        test1 emailClient = new test1();
        emailClient.sendEmail();
    }

}


