/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendEmail;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


/**
 *
 * @author devikamujgule
 */
public class SendMail {

    public SendMail(String mail, String type) {
        notifyUserForLogin(mail,type);
    }


    public void notifyUserForLogin(String to, String msgType ) {
          System.out.println("noftigy called " );
        final String username = "foryouapp5100@gmail.com";
        final String password = "rxwcpvonhitqqucw"; //google code, do not share
        String cart = "cart";
        String signup = "signup";
       
        
        String toAddress = "mujgule.devika07@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
       // props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
       
     //   props.put("mail.smtps.user", username);
     //   props.put("mail.smtps.password", password);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
       
      //  props.put("mail.smtp.socketFactory.port", "587");
     //   prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       props.put("mail.smtp.socketFactory.fallback", "true");
        Session session;
              System.out.println("email id: " + toAddress);
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse("mujgule.devika07@gmail.com"));
            message.setSubject("ForYou Confirmation!");
            if (msgType.equals(cart)) {
            message.setText("Thanks for booking services with us. Hope you enjoy our service!  \n\n If you face any issue, kindly connect us at connect@foryou.com");
            Transport.send(message);
            } else {
                  message.setText("Thanks for joining our portal. Please see our services for you! \n\n If you face any issue, kindly connect us at connect@foryou.com");
            Transport.send(message);
            }
//            message.setText("Thanks for booking services with us. If you face any issue, kindly connect us at connect@foryou.com");
//            Transport.send(message);

            System.out.println("Email - Done. email id: " + toAddress);

        } catch (MessagingException e) {
             e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}
