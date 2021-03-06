/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.HomeEssentials;

import UI.Admin.Food.*;
import UI.Admin.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organizations.FoodOrganization;
import Business.Organizations.GroceryAndEssentialsOrganization;
import Business.Organizations.LegalServicesOrganization;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import UI.LoginJPanel;

/**
 *
 * @author devikamujgule
 */
public class OrganizationAdminJpanel extends javax.swing.JPanel {
     /**
     * Creates new form OrganizationAdminJpanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
     GroceryAndEssentialsOrganization groceryOrg;
    String img;
    ImageIcon icon;
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
     public OrganizationAdminJpanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
         
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        this.organization = organization;
        getImageforOrganization(this.organization);
        icon = new ImageIcon(img);
        AdminHomeJPanel home = new AdminHomeJPanel(userProcessContainer,userAccount,system,organization,adminSplitPane,icon);
        adminSplitPane.setRightComponent(home);
        
          for (Organization org : system.getNetwork().getEnterpriseDirectory().getEnterprise("FoodAndEssentials").getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof GroceryAndEssentialsOrganization) {
                groceryOrg = ((GroceryAndEssentialsOrganization) org);
                System.out.println("or list " + groceryOrg.getWorkQueue().getWorkRequestList().size());
                break;
            }
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

        adminSplitPane = new javax.swing.JSplitPane();
        ServicesPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        EmployeeButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        OrdersButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        profileNameText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        profileButton = new javax.swing.JButton();
        RevenueButton = new javax.swing.JButton();
        jPanelAdmin = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1480, 800));
        setRequestFocusEnabled(false);

        adminSplitPane.setBorder(null);
        adminSplitPane.setDividerSize(0);
        adminSplitPane.setPreferredSize(new java.awt.Dimension(1480, 800));

        ServicesPanel.setBackground(new java.awt.Color(54, 33, 89));

        homeButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        EmployeeButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        EmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeButton.setText("Manage Employee");
        EmployeeButton.setBorderPainted(false);
        EmployeeButton.setContentAreaFilled(false);
        EmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("LogOut");
        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        OrdersButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        OrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        OrdersButton.setText("Manage Orders");
        OrdersButton.setBorderPainted(false);
        OrdersButton.setContentAreaFilled(false);
        OrdersButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        OrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersButtonActionPerformed(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/usericon.png"))); // NOI18N

        profileNameText.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        profileNameText.setForeground(new java.awt.Color(255, 255, 255));

        profileButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setBorderPainted(false);
        profileButton.setContentAreaFilled(false);
        profileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        RevenueButton.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        RevenueButton.setForeground(new java.awt.Color(255, 255, 255));
        RevenueButton.setText("Revenue");
        RevenueButton.setBorderPainted(false);
        RevenueButton.setContentAreaFilled(false);
        RevenueButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicesPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(profileIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(RevenueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ServicesPanelLayout.setVerticalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addGroup(ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicesPanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(profileNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServicesPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeButton)
                .addGap(12, 12, 12)
                .addComponent(profileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmployeeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrdersButton)
                .addGap(11, 11, 11)
                .addComponent(RevenueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        adminSplitPane.setLeftComponent(ServicesPanel);

        jPanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdmin.setPreferredSize(new java.awt.Dimension(1254, 800));

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1254, Short.MAX_VALUE)
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        adminSplitPane.setRightComponent(jPanelAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        
        AdminHomeJPanel home = new AdminHomeJPanel(userProcessContainer,userAccount,system,organization,adminSplitPane,icon);
        adminSplitPane.setRightComponent(home);

    }//GEN-LAST:event_homeButtonActionPerformed

    private void EmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeButtonActionPerformed
        // TODO add your handling code here:
         EmployeeOperations employee = new EmployeeOperations(userProcessContainer, userAccount, system,organization, adminSplitPane, groceryOrg);
        adminSplitPane.setRightComponent(employee);
  
    }//GEN-LAST:event_EmployeeButtonActionPerformed

    private void OrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersButtonActionPerformed
        // TODO add your handling code here:
           ManageAllOrders order = new ManageAllOrders(userProcessContainer, userAccount, system, organization, adminSplitPane, groceryOrg);
        adminSplitPane.setRightComponent(order);
        
    
    }//GEN-LAST:event_OrdersButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
         AdminProfileJPanel profile = new AdminProfileJPanel(userProcessContainer, userAccount, system, adminSplitPane);
        adminSplitPane.setRightComponent(profile);
    
    }//GEN-LAST:event_profileButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
          userProcessContainer.removeAll();
        dB4OUtil.storeSystem(system);
        EcoSystem system1 = dB4OUtil.retrieveSystem();
        JPanel loginPage = new LoginJPanel(userProcessContainer, system1);
        userProcessContainer.add("loginPage",loginPage);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void RevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenueButtonActionPerformed
        // TODO add your handling code here:
        RevenueGenerated revenue = new RevenueGenerated(userProcessContainer, userAccount, system, adminSplitPane, organization);
        adminSplitPane.setRightComponent(revenue);
    }//GEN-LAST:event_RevenueButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrdersButton;
    private javax.swing.JButton RevenueButton;
    private javax.swing.JPanel ServicesPanel;
    private javax.swing.JSplitPane adminSplitPane;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel profileNameText;
    // End of variables declaration//GEN-END:variables

     private void getImageforOrganization(Organization organization1) {
        if(organization1.getName().equals("Money Management Organization")){
            img = "moneyManage.jpeg";
        }else if(organization1.getName().equals("Legal Services Organization")){
            img = "legalservices.jpeg";
        }else if(organization1.getName().equals("GroceryAndEssentials Organization")){
            img = "grocery.jpg";
        }else if(organization1.getName().equals("Food Organization")){
            img = "food_delivery.jpg";
        }else if(organization1.getName().equals("CovidCare Organization")){
            img = "covidcareOrganization_630x375.jpeg";
        }else if(organization1.getName().equals("HealthAid Organization")){
            img = "";
        }else if(organization1.getName().equals("Therapy Organization")){
            img = "therapyOrganization_630x375.jpeg";
        }else if(organization1.getName().equals("Nurse Organization")){
            img = "nurseOrganization_630x375.jpeg";
        } else if(organization1.getName().equals("HouseHold Organization")){
            img = "houseHoldOrganization_630x375.jpeg";
        }
         
    }

    private void setAssignedOrganization(Organization organization) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
