///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package SendEmail;
//
//import com.db4o.cs.internal.messages.Message;
//import com.twilio.http.TwilioRestClient;
//import com.twilio.rest.api.v2010.Account;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import org.apache.http.NameValuePair;
//import org.apache.http.message.BasicNameValuePair;
//
///**
// *
// * @author devikamujgule
// */
//public class SendMsg {
//    /* Find your sid and token at twilio.com/user/account */
//    public static final String ACCOUNT_SID = "AC752cfe3dea76e9dc4c7cccb4ccb8a815";
//    public static final String AUTH_TOKEN = "ee284fe3d87ce67f7d5ec690fd7e19a5";
// 
//    public  void sendingSMS(String toNumber)  {
// 
//        try {
//            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
//            
//            Account account = client.getAccount();
//            
//            MessageFactory messageFactory = account.getMessageFactory();
//            List<NameValuePair> params = new ArrayList<NameValuePair>();
//            params.add(new BasicNameValuePair("To", "+1"+toNumber)); // Replace with a valid phone number for your account.
//            params.add(new BasicNameValuePair("From", "+18572731878")); // Replace with a valid phone number for your account.
//            params.add(new BasicNameValuePair("Body", "Your Prescription has been mailed!"));
//            Message sms = messageFactory.create(params);
//        } catch (TwilioRestException ex) {
//            Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "The number that has been given was not an authentic number!");
//        }
//    }
//}
