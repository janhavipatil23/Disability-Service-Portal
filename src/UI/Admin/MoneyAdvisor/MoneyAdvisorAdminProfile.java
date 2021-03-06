/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.MoneyAdvisor;

import Business.EcoSystem;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author devikamujgule
 */
public class MoneyAdvisorAdminProfile extends javax.swing.JPanel {

    /**
     * Creates new form MoneyAdvisorAdminProfile
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane adminSplitPane;
    public MoneyAdvisorAdminProfile(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, JSplitPane adminSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        custNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddressStreetTextField = new javax.swing.JTextField();
        AddressAptTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        ZipcodejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PhoneNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailAddressTextField1 = new javax.swing.JTextField();
        SubmitjButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emergencyNameTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        emergencyNumberTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ageTextField = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        ImageHeader1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 215, 229));
        setPreferredSize(new java.awt.Dimension(1254, 800));
        setSize(new java.awt.Dimension(1254, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1254, 800));
        jPanel1.setSize(new java.awt.Dimension(1254, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("Admin Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 112, 23));
        jPanel1.add(custIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 165, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 72, 23));
        jPanel1.add(custNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 165, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("Age:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 72, 23));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 241, 72, 23));
        jPanel1.add(AddressStreetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 240, 165, -1));
        jPanel1.add(AddressAptTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 272, 165, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 304, 165, -1));
        jPanel1.add(ZipcodejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 337, 165, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 370, 112, 23));

        PhoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneNumberTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(PhoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 369, 165, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 93, 23));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel8.setText("Email Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 414, 112, 23));
        jPanel1.add(emailAddressTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 413, 165, -1));

        SubmitjButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitjButton.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        SubmitjButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitjButton.setText("Submit");
        SubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 610, 200, 40));

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Personal Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1254, 110));

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Emergency Contact Details");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 457, 1254, 32));

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel13.setText("Name:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 492, 72, 23));
        jPanel1.add(emergencyNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 491, 165, -1));

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel14.setText("Phone Number:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 533, 123, -1));

        emergencyNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emergencyNumberTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(emergencyNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 529, 165, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 439, 1254, -1));

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 165, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 165, -1));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 200, 20));

        l2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                l2KeyReleased(evt);
            }
        });
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 140, 30));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 140, 30));

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));

        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("ForYou");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Title1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImageHeader1)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitjButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
 
    }//GEN-LAST:event_SubmitjButtonActionPerformed

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        // TODO add your handling code here:
        
        String regex = "^[0-9]{1,2}$";

        Pattern patt = Pattern.compile(regex);

        Matcher match = patt.matcher(ageTextField.getText());

        if(!match.matches()){

            l1.setText("ENTER AN APT AGE");

        }
        else{

            l1.setText(null);
        }
    }//GEN-LAST:event_ageTextFieldKeyReleased

    private void l2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l2KeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_l2KeyReleased

    private void PhoneNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberTextFieldKeyReleased
        // TODO add your handling code here:
        
         String regex = "^[0-9]{10}$";
//        
        Pattern patt = Pattern.compile(regex);
       

        Matcher match = patt.matcher(PhoneNumberTextField.getText());
        
        if(!match.matches()){
        
            l2.setText("ENTER A 10 DIGIT PHONE NUMBER");
        
        }
        else{
            
            l2.setText(null);
        }
    }//GEN-LAST:event_PhoneNumberTextFieldKeyReleased

    private void emergencyNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emergencyNumberTextFieldKeyReleased
        // TODO add your handling code here:
        
         String regex = "^[0-9]{10}$";
//        
        Pattern patt = Pattern.compile(regex);
       

        Matcher match = patt.matcher(emergencyNumberTextField.getText());
        
        if(!match.matches()){
        
            l3.setText("ENTER A 10 DIGIT PHONE NUMBER");
        
        }
        else{
            
            l3.setText(null);
        }
    }//GEN-LAST:event_emergencyNumberTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressAptTextField;
    private javax.swing.JTextField AddressStreetTextField;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JButton SubmitjButton;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField ZipcodejTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField custIdTextField;
    private javax.swing.JTextField custNameTextField;
    private javax.swing.JTextField emailAddressTextField1;
    private javax.swing.JTextField emergencyNameTextField1;
    private javax.swing.JTextField emergencyNumberTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables
}
