/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.Enterprise.FinanceEnterprise;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.Organization;
import static Business.Organizations.Organization.Type.MoneyManagement;
import Business.Organizations.RevenueMap;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MoneyWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author devikamujgule
 */
public class MoneyAdviceAppointment extends javax.swing.JPanel {

    /**
     * Creates new form MoneyAdviceAppointment
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    MoneyManagementOrganization moneyOrg;
    JSplitPane servicesSplitPane;
    java.util.Date dateCurrent = new java.util.Date();

    MoneyAdviceAppointment(JPanel userProcessContainer, 
            EcoSystem system, 
            UserAccount userAccount, 
            JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.servicesSplitPane = servicesSplitPane;

//        for (int j = 0; j < system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").getOrganizationDirectory().getOrganizationList().size(); j++) {
//            System.out.println("orgo>>>" + system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").getOrganizationDirectory().getOrganizationList().get(j).getName());
//            if (system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").getOrganizationDirectory().getOrganizationList().get(j).getName() == orgName) {
//                moneyOrg = (MoneyManagementOrganization) system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").getOrganizationDirectory().getOrganizationList().get(j);
//                break;
//            }
//        }
        for (Organization organization : system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof MoneyManagementOrganization) {
                moneyOrg = ((MoneyManagementOrganization) organization);
                break;
            }
        }
        String name = (String) moneyOrg.getDateArray().keySet().toArray()[0];
        jTextField_costAdvice.setText(moneyOrg.getPrice().toString());
        System.out.println("name>>>>>>" + name);
        ArrayList<String> timeArray = moneyOrg.getTimeSlot(name);
        System.out.println("1st date" + timeArray);
        System.out.println(system.getNetwork().getEnterpriseDirectory().getEnterprise("Finance").toString() + " Finance...");
        for (int i = 0; i < timeArray.size(); i++) {
            jComboBox_timeSlot.addItem(timeArray.get(i));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_timeSlot = new javax.swing.JComboBox<>();
        jDateChooser_money = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton_book = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_costAdvice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(110, 89, 222));

        Title.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ForYou");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 977, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        jLabel1.setText("Date :");

        jComboBox_timeSlot.setFont(new java.awt.Font("Palatino", 0, 13)); // NOI18N

        jDateChooser_money.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_moneyMouseClicked(evt);
            }
        });
        jDateChooser_money.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_moneyPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        jLabel2.setText("Time :");

        jButton_book.setBackground(new java.awt.Color(0, 0, 0));
        jButton_book.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton_book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_book.setText("Book");
        jButton_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel3.setText("Book Appointment");

        jLabel4.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        jLabel4.setText("Cost :");

        jTextField_costAdvice.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_timeSlot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_money, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jTextField_costAdvice))))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_timeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_costAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton_book, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 217, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookActionPerformed
        // TODO add your handling code here:
        if (jDateChooser_money.getDate() != null && jComboBox_timeSlot.getSelectedItem() != null) {
            if (jDateChooser_money.getDate().before(new Date())) {
                JOptionPane.showMessageDialog(this, "START DATE SHOULD BE AFTER TODAYS DATE");
                return;
            }
            Date date = jDateChooser_money.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
            String date1 = format1.format(date);
            String timeSlot = (String) jComboBox_timeSlot.getSelectedItem();
            System.out.println("date++++++" + date1);
            ArrayList<String> timeSlot1 = moneyOrg.getTimeSlot(date1);
            HashMap<String, ArrayList<String>> dateArray = moneyOrg.getDateArray();

            timeSlot1.remove(timeSlot);
            System.out.println("deleted time" + timeSlot1);
            JOptionPane.showMessageDialog(null, "YOUR APPOINTMENT IS BOOKED");
            jComboBox_timeSlot.removeAllItems();
            for (int i = 0; i < timeSlot1.size(); i++) {
                System.out.println("deleted items....." + timeSlot1.get(i));

                jComboBox_timeSlot.addItem(timeSlot1.get(i));
            }
            MoneyWorkRequest request = new MoneyWorkRequest();
            request.setSender(userAccount);
            request.setMessage("Book appointment");
            request.setTimeSlot(timeSlot);
            request.setDate(date1);
            request.setStatus("Sent");
            request.setPrice(moneyOrg.getPrice());
            request.setId(moneyOrg.getWorkQueue().getWorkRequestList().size() + 1);
            request.setRequestDate(dateCurrent);
            request.setReqType(moneyOrg.getName());
            request.setTotal(request.getTotal() + moneyOrg.getPrice());
            if (moneyOrg != null) {
                System.out.println("before req count....." + userAccount.getWorkQueue().getWorkRequestList().size());

                userAccount.getWorkQueue().getWorkRequestList().add(request);
                System.out.println("before req count org....." + moneyOrg.getWorkQueue().getWorkRequestList().size());
                System.out.println("after req count....." + userAccount.getWorkQueue().getWorkRequestList().size());
                moneyOrg.getWorkQueue().getWorkRequestList().add(request);
                System.out.println("after req count org....." + moneyOrg.getWorkQueue().getWorkRequestList().size());
            }

            String d = request.getRequestDate().toString();
            String[] dArr = d.split(" ");
            List<String> fullDate = Arrays.asList(dArr[dArr.length - 1], dArr[1]);
            RevenueMap rm = new RevenueMap(Integer.parseInt(fullDate.get(0)), fullDate.get(1), request.getTotal(), 4);
            moneyOrg.getRevMap().add(rm);
        } else {
            JOptionPane.showMessageDialog(this, "ENTER ALL DETAILS CORRECTLY");
        }

    }//GEN-LAST:event_jButton_bookActionPerformed

    private void jDateChooser_moneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_moneyMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jDateChooser_moneyMouseClicked

    private void jDateChooser_moneyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_moneyPropertyChange
        // TODO add your handling code here:
        if (jDateChooser_money.getDate() != null) {
            System.out.println("in prop change money...");
            if (jDateChooser_money.getDate().before(new Date())) {
                JOptionPane.showMessageDialog(this, "START DATE SHOULD BE AFTER TODAYS DATE");
                System.out.println("in if money...");
                jDateChooser_money.setDate(null);
                return;
            }else{
                System.out.println("in else money...");
                Date date = jDateChooser_money.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
            String date1 = format1.format(date);
            ArrayList<String> timeSlot1 = moneyOrg.getTimeSlot(date1);
            jComboBox_timeSlot.removeAllItems();
            for (int i = 0; i < timeSlot1.size(); i++) {
                System.out.println("selected items....." + timeSlot1.get(i));
                jComboBox_timeSlot.addItem(timeSlot1.get(i));
            }
            }
            
        }
    }//GEN-LAST:event_jDateChooser_moneyPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton_book;
    private javax.swing.JComboBox<String> jComboBox_timeSlot;
    private com.toedter.calendar.JDateChooser jDateChooser_money;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextField_costAdvice;
    // End of variables declaration//GEN-END:variables

}
