/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organizations.LabOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import UI.LoginJPanel;

/**
 *
 * @author devikamujgule
 */
public class CustomerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDashboard
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public CustomerDashboard(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dashboardJScrollPane = new javax.swing.JScrollPane();
        dashboardJPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();
        ProtectiveServicesPanel = new javax.swing.JPanel();
        ProtecticeCareImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg = new javax.swing.JLabel();
        LegalServicesButton = new javax.swing.JButton();
        ProtectiveServicesLabel = new javax.swing.JLabel();
        NursingServicesPanel = new javax.swing.JPanel();
        NursingImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg1 = new javax.swing.JLabel();
        NursingServicesButton = new javax.swing.JButton();
        NursingServicesLabel = new javax.swing.JLabel();
        GroceryServicesPanel = new javax.swing.JPanel();
        GroceryImgPanel = new javax.swing.JPanel();
        GroceryServicesButton = new javax.swing.JButton();
        GroceryServicesLabel = new javax.swing.JLabel();
        GroceryServicesPanelImg = new javax.swing.JLabel();
        CompanionServicesPanel = new javax.swing.JPanel();
        CompanionServicesImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg3 = new javax.swing.JLabel();
        CompanionServicesButton = new javax.swing.JButton();
        CompanionServicesLabel = new javax.swing.JLabel();
        NursingServicesPanel1 = new javax.swing.JPanel();
        NursingImgPanel1 = new javax.swing.JPanel();
        ProtectiveServicesPanelImg2 = new javax.swing.JLabel();
        NursingServicesButton1 = new javax.swing.JButton();
        NursingServicesLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/newWall.jpeg"))); // NOI18N

        setPreferredSize(new java.awt.Dimension(1480, 1000));

        dashboardJScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        dashboardJScrollPane.setPreferredSize(new java.awt.Dimension(1480, 1000));

        dashboardJPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardJPanel.setPreferredSize(new java.awt.Dimension(1480, 1000));

        HeaderPanel.setBackground(new java.awt.Color(110, 89, 222));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(1480, 116));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        HeaderPanel.add(ImageHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("ForYou");
        HeaderPanel.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Palatino", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        HeaderPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, 164, 45));

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProtectiveServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProtectiveServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ProtecticeCareImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        ProtectiveServicesPanelImg.setBackground(new java.awt.Color(255, 255, 255));
        ProtectiveServicesPanelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/law2.png"))); // NOI18N

        javax.swing.GroupLayout ProtecticeCareImgPanelLayout = new javax.swing.GroupLayout(ProtecticeCareImgPanel);
        ProtecticeCareImgPanel.setLayout(ProtecticeCareImgPanelLayout);
        ProtecticeCareImgPanelLayout.setHorizontalGroup(
            ProtecticeCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        ProtecticeCareImgPanelLayout.setVerticalGroup(
            ProtecticeCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProtecticeCareImgPanelLayout.createSequentialGroup()
                .addComponent(ProtectiveServicesPanelImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        LegalServicesButton.setBackground(new java.awt.Color(255, 255, 255));
        LegalServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        LegalServicesButton.setForeground(new java.awt.Color(102, 0, 204));
        LegalServicesButton.setText("LEGAL SERVICES");
        LegalServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegalServicesButtonActionPerformed(evt);
            }
        });

        ProtectiveServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        ProtectiveServicesLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        ProtectiveServicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProtectiveServicesLabel.setText("Legal Services");

        javax.swing.GroupLayout ProtectiveServicesPanelLayout = new javax.swing.GroupLayout(ProtectiveServicesPanel);
        ProtectiveServicesPanel.setLayout(ProtectiveServicesPanelLayout);
        ProtectiveServicesPanelLayout.setHorizontalGroup(
            ProtectiveServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtecticeCareImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LegalServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProtectiveServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProtectiveServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        ProtectiveServicesPanelLayout.setVerticalGroup(
            ProtectiveServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProtectiveServicesPanelLayout.createSequentialGroup()
                .addComponent(ProtecticeCareImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(ProtectiveServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LegalServicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        containerPanel.add(ProtectiveServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 250, 460));

        NursingServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        NursingImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        ProtectiveServicesPanelImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/allservices.png"))); // NOI18N

        javax.swing.GroupLayout NursingImgPanelLayout = new javax.swing.GroupLayout(NursingImgPanel);
        NursingImgPanel.setLayout(NursingImgPanelLayout);
        NursingImgPanelLayout.setHorizontalGroup(
            NursingImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NursingImgPanelLayout.setVerticalGroup(
            NursingImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingImgPanelLayout.createSequentialGroup()
                .addComponent(ProtectiveServicesPanelImg1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        NursingServicesButton.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        NursingServicesButton.setForeground(new java.awt.Color(102, 0, 204));
        NursingServicesButton.setText("NURSING SERVICES ");
        NursingServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursingServicesButtonActionPerformed(evt);
            }
        });

        NursingServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        NursingServicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NursingServicesLabel.setText("Home Health Services");

        javax.swing.GroupLayout NursingServicesPanelLayout = new javax.swing.GroupLayout(NursingServicesPanel);
        NursingServicesPanel.setLayout(NursingServicesPanelLayout);
        NursingServicesPanelLayout.setHorizontalGroup(
            NursingServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NursingImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NursingServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NursingServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NursingServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(NursingServicesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NursingServicesPanelLayout.setVerticalGroup(
            NursingServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingServicesPanelLayout.createSequentialGroup()
                .addComponent(NursingImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NursingServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NursingServicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        containerPanel.add(NursingServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 250, 460));

        GroceryServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        GroceryServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        GroceryImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout GroceryImgPanelLayout = new javax.swing.GroupLayout(GroceryImgPanel);
        GroceryImgPanel.setLayout(GroceryImgPanelLayout);
        GroceryImgPanelLayout.setHorizontalGroup(
            GroceryImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GroceryImgPanelLayout.setVerticalGroup(
            GroceryImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        GroceryServicesButton.setBackground(new java.awt.Color(255, 255, 255));
        GroceryServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        GroceryServicesButton.setForeground(new java.awt.Color(102, 0, 204));
        GroceryServicesButton.setText("GROCERY SERVICES");
        GroceryServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroceryServicesButtonActionPerformed(evt);
            }
        });

        GroceryServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        GroceryServicesLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        GroceryServicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GroceryServicesLabel.setText("Grocery Services");

        GroceryServicesPanelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/grocery.png"))); // NOI18N

        javax.swing.GroupLayout GroceryServicesPanelLayout = new javax.swing.GroupLayout(GroceryServicesPanel);
        GroceryServicesPanel.setLayout(GroceryServicesPanelLayout);
        GroceryServicesPanelLayout.setHorizontalGroup(
            GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                        .addComponent(GroceryServicesPanelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(GroceryImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                        .addGroup(GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GroceryServicesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GroceryServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        GroceryServicesPanelLayout.setVerticalGroup(
            GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                .addGroup(GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GroceryImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GroceryServicesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GroceryServicesPanelImg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(GroceryServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GroceryServicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        containerPanel.add(GroceryServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 260, 460));

        CompanionServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        CompanionServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        CompanionServicesImgPanel.setBackground(new java.awt.Color(255, 255, 255));

        ProtectiveServicesPanelImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/therapy.png"))); // NOI18N

        javax.swing.GroupLayout CompanionServicesImgPanelLayout = new javax.swing.GroupLayout(CompanionServicesImgPanel);
        CompanionServicesImgPanel.setLayout(CompanionServicesImgPanelLayout);
        CompanionServicesImgPanelLayout.setHorizontalGroup(
            CompanionServicesImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompanionServicesImgPanelLayout.createSequentialGroup()
                .addComponent(ProtectiveServicesPanelImg3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        CompanionServicesImgPanelLayout.setVerticalGroup(
            CompanionServicesImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CompanionServicesButton.setBackground(new java.awt.Color(255, 255, 255));
        CompanionServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        CompanionServicesButton.setForeground(new java.awt.Color(102, 0, 204));
        CompanionServicesButton.setText("THERAPY SERVICES");
        CompanionServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanionServicesButtonActionPerformed(evt);
            }
        });

        CompanionServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        CompanionServicesLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        CompanionServicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompanionServicesLabel.setText("Mental Health Services");

        javax.swing.GroupLayout CompanionServicesPanelLayout = new javax.swing.GroupLayout(CompanionServicesPanel);
        CompanionServicesPanel.setLayout(CompanionServicesPanelLayout);
        CompanionServicesPanelLayout.setHorizontalGroup(
            CompanionServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CompanionServicesImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CompanionServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CompanionServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        CompanionServicesPanelLayout.setVerticalGroup(
            CompanionServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompanionServicesPanelLayout.createSequentialGroup()
                .addComponent(CompanionServicesImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(CompanionServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanionServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        containerPanel.add(CompanionServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 250, 460));

        NursingServicesPanel1.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        NursingImgPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ProtectiveServicesPanelImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/allservices.jpeg"))); // NOI18N

        javax.swing.GroupLayout NursingImgPanel1Layout = new javax.swing.GroupLayout(NursingImgPanel1);
        NursingImgPanel1.setLayout(NursingImgPanel1Layout);
        NursingImgPanel1Layout.setHorizontalGroup(
            NursingImgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NursingImgPanel1Layout.setVerticalGroup(
            NursingImgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingImgPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProtectiveServicesPanelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NursingServicesButton1.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesButton1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        NursingServicesButton1.setForeground(new java.awt.Color(102, 0, 204));
        NursingServicesButton1.setText("ALL SERVICES");
        NursingServicesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursingServicesButton1ActionPerformed(evt);
            }
        });

        NursingServicesLabel1.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesLabel1.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        NursingServicesLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NursingServicesLabel1.setText("All of our services ");

        javax.swing.GroupLayout NursingServicesPanel1Layout = new javax.swing.GroupLayout(NursingServicesPanel1);
        NursingServicesPanel1.setLayout(NursingServicesPanel1Layout);
        NursingServicesPanel1Layout.setHorizontalGroup(
            NursingServicesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingServicesPanel1Layout.createSequentialGroup()
                .addGroup(NursingServicesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NursingImgPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NursingServicesLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(NursingServicesPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NursingServicesButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NursingServicesPanel1Layout.setVerticalGroup(
            NursingServicesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingServicesPanel1Layout.createSequentialGroup()
                .addComponent(NursingImgPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NursingServicesLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NursingServicesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        containerPanel.add(NursingServicesPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 460));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setPreferredSize(new java.awt.Dimension(1480, 884));
        containerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1510, 1010));

        javax.swing.GroupLayout dashboardJPanelLayout = new javax.swing.GroupLayout(dashboardJPanel);
        dashboardJPanel.setLayout(dashboardJPanelLayout);
        dashboardJPanelLayout.setHorizontalGroup(
            dashboardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardJPanelLayout.createSequentialGroup()
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dashboardJPanelLayout.setVerticalGroup(
            dashboardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardJPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        dashboardJScrollPane.setViewportView(dashboardJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashboardJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LegalServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegalServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices",new CustomerService("Legal", userProcessContainer, business, userAccount) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_LegalServicesButtonActionPerformed

    private void NursingServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursingServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices",new CustomerService("Nursing", userProcessContainer, business, userAccount) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_NursingServicesButtonActionPerformed

    private void GroceryServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroceryServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices",new CustomerService("Meals", userProcessContainer, business, userAccount) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_GroceryServicesButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        dB4OUtil.storeSystem(business);
        EcoSystem system1 = dB4OUtil.retrieveSystem();
        JPanel loginPage = new LoginJPanel(userProcessContainer, system1);
        userProcessContainer.add("loginPage",loginPage);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void NursingServicesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursingServicesButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices", new CustomerService("AllServices",userProcessContainer, business, userAccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_NursingServicesButton1ActionPerformed

    private void CompanionServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanionServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices", new CustomerService("Therapy", userProcessContainer, business, userAccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CompanionServicesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompanionServicesButton;
    private javax.swing.JPanel CompanionServicesImgPanel;
    private javax.swing.JLabel CompanionServicesLabel;
    private javax.swing.JPanel CompanionServicesPanel;
    private javax.swing.JPanel GroceryImgPanel;
    private javax.swing.JButton GroceryServicesButton;
    private javax.swing.JLabel GroceryServicesLabel;
    private javax.swing.JPanel GroceryServicesPanel;
    private javax.swing.JLabel GroceryServicesPanelImg;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JButton LegalServicesButton;
    private javax.swing.JPanel NursingImgPanel;
    private javax.swing.JPanel NursingImgPanel1;
    private javax.swing.JButton NursingServicesButton;
    private javax.swing.JButton NursingServicesButton1;
    private javax.swing.JLabel NursingServicesLabel;
    private javax.swing.JLabel NursingServicesLabel1;
    private javax.swing.JPanel NursingServicesPanel;
    private javax.swing.JPanel NursingServicesPanel1;
    private javax.swing.JPanel ProtecticeCareImgPanel;
    private javax.swing.JLabel ProtectiveServicesLabel;
    private javax.swing.JPanel ProtectiveServicesPanel;
    private javax.swing.JLabel ProtectiveServicesPanelImg;
    private javax.swing.JLabel ProtectiveServicesPanelImg1;
    private javax.swing.JLabel ProtectiveServicesPanelImg2;
    private javax.swing.JLabel ProtectiveServicesPanelImg3;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel dashboardJPanel;
    private javax.swing.JScrollPane dashboardJScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
