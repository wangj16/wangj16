import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail
{
    public static void main(String [] args){
        String to = "yw_acton@yahoo.com";//change accordingly
        String from = "yw_acton@yahoo.com";// accordingly
        // String host = "209.133.209.251";//or IP address
        String host = "127.0.0.1";//or IP address
        //Get the session object
        // Properties properties = System.getProperties();
        // properties.setProperty("mail.smtp.host", host);
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.trust", "smtp.mail-trap.io");
        String ps ="gb@ga1994";
        char[] psw = ps.toCharArray();
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("yw_acton", ps);
            }
        });
        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Ping");
            message.setText("Hello, this is example of sending email  ");

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}
    }
}
