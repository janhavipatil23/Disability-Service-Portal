/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.Organizations.CovidCareOganization;
import Business.Organizations.HouseHoldOrganization;
import Business.Organizations.LegalServicesOrganization;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.NursingOrganization;
import Business.Organizations.Organization;
import Business.Organizations.TherapyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CovidCareWorkRequest;
import Business.WorkQueue.HouseHoldWorkRequest;
import Business.WorkQueue.LawFirmWorkRequest;
import Business.WorkQueue.MoneyWorkRequest;
import Business.WorkQueue.NursingWorkRequest;
import Business.WorkQueue.TherapyWorkRequest;
import Business.WorkQueue.WorkRequest;
import SendEmail.SendMail;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class ServiceCart extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private JSplitPane servicesSplitPane;
    boolean flagConfirm = false;

    DefaultTableModel nurseModel;
    DefaultTableModel therapyModel;
    DefaultTableModel covidModel;
    DefaultTableModel moneyAdviceModel;
    DefaultTableModel lawfirmModel;
    DefaultTableModel houseHoldModel;
    
    NursingOrganization org;
    UserAccount userAccount;
    NursingWorkRequest nurseRequest;
    TherapyWorkRequest therapyRequest;
    CovidCareWorkRequest covidCareRequest;
    MoneyWorkRequest moneyRequest;
    LawFirmWorkRequest lawRequest;
    HouseHoldWorkRequest houseHoldRequest;
    private Double lawCost = 0.0;
    private Double moneyCost = 0.0;
    private Double nurseCost = 0.0;
    private Double therapyCost = 0.0;
    private Double householdCost = 0.0;
    
     public ServiceCart(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, JSplitPane servicesSplitPane) {
        initComponents();
        this.userAccount = userAccount;
        this.system = business;
        this.userProcessContainer = userProcessContainer;
        this.servicesSplitPane = servicesSplitPane;
        
         createModel();
         createTherapyModel();
         createCovidModel();
         createMoneyApponitmentModel();
         createLawfirmModel();
         createHouseHold();
         
        viewNursingData();
        viewTherapyData();
        viewCovidCareData();
        viewMoneyAppointmentDetails();
        viewLawfirmDetails();
        viewHouseHoldData();
         
       
    }
      public void createModel() {
        nurseModel = new DefaultTableModel();
        nursingTable.setModel(nurseModel);
        nurseModel.addColumn("Request Id");
        nurseModel.addColumn("Category");
        nurseModel.addColumn("Price");
      }
      
       public void createTherapyModel() {
        therapyModel = new DefaultTableModel();
        therapyTable.setModel(therapyModel);
        therapyModel.addColumn("Request Id");
        therapyModel.addColumn("Category");
        therapyModel.addColumn("Price");
    }
       
       
        public void createCovidModel() {
        covidModel = new DefaultTableModel();
        covidCareTable.setModel(covidModel);
        covidModel.addColumn("Request Id");
        covidModel.addColumn("Appointment Date");
    }
         
        
        public void createHouseHold() {
        houseHoldModel = new DefaultTableModel();
        houseHoldTable.setModel(houseHoldModel);
        houseHoldModel.addColumn("Request Id");
        houseHoldModel.addColumn("Service Type");
        houseHoldModel.addColumn("Price");

    }
           public void viewHouseHoldData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof HouseHoldWorkRequest) {
                houseHoldRequest = ((HouseHoldWorkRequest) workrequest);
                for (String i : houseHoldRequest.getServices().keySet()) {
                    householdCost += houseHoldRequest.getTotalPrice();
                    houseHoldModel.addRow(new Object[]{
                        houseHoldRequest.getId(), i, houseHoldRequest.getServices().get(i)
                    });
                }
            }
        }
    }
           
            public void removeWorkRequest(DefaultTableModel model, JTable table, int id) {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
//            covidCareRequest = ((CovidCareWorkRequest) workrequest);
            if (workrequest.getId() == id) {
                userAccount.getWorkQueue().getWorkRequestList().remove(workrequest);
                model.removeRow(table.getSelectedRow());
                break;
            }
        }
    }
           
           
           
         public void viewNursingData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof NursingWorkRequest) {
                nurseRequest = ((NursingWorkRequest) workrequest);
                if (!nurseRequest.getStatus().equalsIgnoreCase("Accepted")) {
                    nurseCost += nurseRequest.getPrice();
                    nurseModel.addRow(new Object[]{
                        nurseRequest.getId(), nurseRequest.getServiceCategory(), nurseRequest.getPrice()
                    });
                }
            }
        }
    }
          public void viewTherapyData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof TherapyWorkRequest) {
                therapyRequest = ((TherapyWorkRequest) workrequest);
                if (!therapyRequest.getStatus().equalsIgnoreCase("Accepted")) {
                    therapyCost += therapyRequest.getPrice();
                    therapyModel.addRow(new Object[]{
                        therapyRequest.getId(), therapyRequest.getServiceCategory(), therapyRequest.getPrice()
                    });
                }
            }
        }
    }
          public void viewCovidCareData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof CovidCareWorkRequest) {
                covidCareRequest = ((CovidCareWorkRequest) workrequest);
                if (!covidCareRequest.getStatus().equalsIgnoreCase("Accepted")) {
                    covidModel.addRow(new Object[]{
                        covidCareRequest.getId(), covidCareRequest.getAppointmentDate()
                    });
                }
            }
        }
    }
            public void removeHouseHoldWorkRequest(DefaultTableModel model, JTable table, int id, String value) {
        HouseHoldWorkRequest workrequestLocal;
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest.getId() == id && workrequest instanceof HouseHoldWorkRequest) {
                workrequestLocal = ((HouseHoldWorkRequest) workrequest);
                for (String key : workrequestLocal.getServices().keySet()) {
                    workrequestLocal.getServices().remove(key);
                    model.removeRow(table.getSelectedRow());
                    break;
                }

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

        headerPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NursingPanel = new javax.swing.JPanel();
        nursingTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nursingTable = new javax.swing.JTable();
        removeNurseReqBtn = new javax.swing.JButton();
        cartTitle = new javax.swing.JLabel();
        TherapyPanel = new javax.swing.JPanel();
        therapyTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        therapyTable = new javax.swing.JTable();
        removeTherapyReqBtn = new javax.swing.JButton();
        CovidCarePanel = new javax.swing.JPanel();
        covidCareTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        covidCareTable = new javax.swing.JTable();
        removeCovidCareReqBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        removeMoneyReqBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        moneyTable = new javax.swing.JTable();
        moneyTitle = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        legalTable = new javax.swing.JTable();
        moneyTitle1 = new javax.swing.JLabel();
        removeLegalReqBtn = new javax.swing.JButton();
        houseHoldPanel = new javax.swing.JPanel();
        jButton_pay = new javax.swing.JButton();
        jButton_gotoCard = new javax.swing.JButton();
        houseHoldTitle = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        houseHoldTable = new javax.swing.JTable();
        removeHouseHoldReqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(110, 89, 222));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title1.setBackground(new java.awt.Color(110, 89, 222));
        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setText("ForYou");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NursingPanel.setOpaque(false);

        nursingTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        nursingTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nursingTitle.setText("Nursing Services");

        nursingTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        nursingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        nursingTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(nursingTable);

        removeNurseReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeNurseReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeNurseReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeNurseReqBtn.setText("Remove Selected Request");
        removeNurseReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNurseReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NursingPanelLayout = new javax.swing.GroupLayout(NursingPanel);
        NursingPanel.setLayout(NursingPanelLayout);
        NursingPanelLayout.setHorizontalGroup(
            NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingPanelLayout.createSequentialGroup()
                .addGroup(NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NursingPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(removeNurseReqBtn)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nursingTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NursingPanelLayout.setVerticalGroup(
            NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nursingTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeNurseReqBtn)
                .addContainerGap())
        );

        cartTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        cartTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartTitle.setText("My Cart");

        TherapyPanel.setOpaque(false);

        therapyTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        therapyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        therapyTitle.setText("Therapy Services");

        therapyTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        therapyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        therapyTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        therapyTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(therapyTable);

        removeTherapyReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeTherapyReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeTherapyReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeTherapyReqBtn.setText("Remove Selected Request");
        removeTherapyReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTherapyReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TherapyPanelLayout = new javax.swing.GroupLayout(TherapyPanel);
        TherapyPanel.setLayout(TherapyPanelLayout);
        TherapyPanelLayout.setHorizontalGroup(
            TherapyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(therapyTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(removeTherapyReqBtn)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        TherapyPanelLayout.setVerticalGroup(
            TherapyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(therapyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeTherapyReqBtn)
                .addContainerGap())
        );

        CovidCarePanel.setOpaque(false);

        covidCareTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        covidCareTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        covidCareTitle.setText("Covid Care Services");

        covidCareTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        covidCareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        covidCareTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(covidCareTable);

        removeCovidCareReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeCovidCareReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeCovidCareReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeCovidCareReqBtn.setText("Remove Selected Request");
        removeCovidCareReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCovidCareReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CovidCarePanelLayout = new javax.swing.GroupLayout(CovidCarePanel);
        CovidCarePanel.setLayout(CovidCarePanelLayout);
        CovidCarePanelLayout.setHorizontalGroup(
            CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CovidCarePanelLayout.createSequentialGroup()
                .addGroup(CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CovidCarePanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(removeCovidCareReqBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(covidCareTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CovidCarePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CovidCarePanelLayout.setVerticalGroup(
            CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CovidCarePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(covidCareTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeCovidCareReqBtn)
                .addContainerGap())
        );

        confirmBtn.setBackground(new java.awt.Color(54, 33, 89));
        confirmBtn.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Confirm Order");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        removeMoneyReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeMoneyReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeMoneyReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeMoneyReqBtn.setText("Remove Selected Request");
        removeMoneyReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMoneyReqBtnActionPerformed(evt);
            }
        });

        moneyTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        moneyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        moneyTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane4.setViewportView(moneyTable);

        moneyTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        moneyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyTitle.setText("Money Services");

        legalTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        legalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        legalTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane5.setViewportView(legalTable);

        moneyTitle1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        moneyTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyTitle1.setText("Legal Services");

        removeLegalReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeLegalReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeLegalReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeLegalReqBtn.setText("Remove Selected Request");
        removeLegalReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLegalReqBtnActionPerformed(evt);
            }
        });

        houseHoldPanel.setOpaque(false);

        javax.swing.GroupLayout houseHoldPanelLayout = new javax.swing.GroupLayout(houseHoldPanel);
        houseHoldPanel.setLayout(houseHoldPanelLayout);
        houseHoldPanelLayout.setHorizontalGroup(
            houseHoldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        houseHoldPanelLayout.setVerticalGroup(
            houseHoldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        jButton_pay.setBackground(new java.awt.Color(54, 33, 89));
        jButton_pay.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton_pay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_pay.setText("Pay");
        jButton_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_payActionPerformed(evt);
            }
        });

        jButton_gotoCard.setBackground(new java.awt.Color(54, 33, 89));
        jButton_gotoCard.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton_gotoCard.setForeground(new java.awt.Color(255, 255, 255));
        jButton_gotoCard.setText("Add Card");
        jButton_gotoCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gotoCardActionPerformed(evt);
            }
        });

        houseHoldTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        houseHoldTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        houseHoldTitle.setText("House Hold Chore Services");

        houseHoldTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        houseHoldTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        houseHoldTable.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane6.setViewportView(houseHoldTable);

        removeHouseHoldReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeHouseHoldReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeHouseHoldReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeHouseHoldReqBtn.setText("Remove Selected Request");
        removeHouseHoldReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHouseHoldReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jButton_gotoCard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButton_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(houseHoldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(removeMoneyReqBtn)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(removeLegalReqBtn)
                                        .addGap(189, 189, 189)
                                        .addComponent(removeHouseHoldReqBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(moneyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(moneyTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(355, 355, 355)
                                        .addComponent(TherapyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CovidCarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(houseHoldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NursingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(cartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NursingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TherapyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CovidCarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseHoldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removeMoneyReqBtn)
                        .addComponent(removeLegalReqBtn))
                    .addComponent(removeHouseHoldReqBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(houseHoldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_gotoCard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(257, 257, 257))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeNurseReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNurseReqBtnActionPerformed
        // TODO add your handling code here:
          if (nursingTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(nursingTable.getValueAt(nursingTable.getSelectedRow(), 0)));
            removeWorkRequest(nurseModel, nursingTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }

        
   
    }//GEN-LAST:event_removeNurseReqBtnActionPerformed

    private void removeTherapyReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTherapyReqBtnActionPerformed
        // TODO add your handling code here:
            if (therapyTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(therapyTable.getValueAt(therapyTable.getSelectedRow(), 0)));
            removeWorkRequest(therapyModel, therapyTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
  
    }//GEN-LAST:event_removeTherapyReqBtnActionPerformed

    private void removeCovidCareReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCovidCareReqBtnActionPerformed
        // TODO add your handling code here:
         if (covidCareTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(covidCareTable.getValueAt(covidCareTable.getSelectedRow(), 0)));
            removeWorkRequest(covidModel, covidCareTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
  
    }//GEN-LAST:event_removeCovidCareReqBtnActionPerformed

      public void setWorkRequest(String enterprise, String organization) {
        Organization org = system.getNetwork().getEnterpriseDirectory().getOrganizationByType(enterprise, organization);
        if (org.getName().equals("Money Management Organization")) {
            MoneyManagementOrganization organization1 = (MoneyManagementOrganization) org;
            for (int j = 0; j < organization1.getWorkQueue().getWorkRequestList().size(); j++) {
                organization1.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
        }
         if (org.getName().equals("Legal Services Organization")) {
            LegalServicesOrganization organization6 = (LegalServicesOrganization) org;
            for (int j = 0; j < organization6.getWorkQueue().getWorkRequestList().size(); j++) {
                organization6.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
        }
           if (org.getName().equals("Therapy Organization")) {
            TherapyOrganization organization2 = (TherapyOrganization) org;
            for (int j = 0; j < organization2.getWorkQueue().getWorkRequestList().size(); j++) {
                organization2.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
        }
            if (org.getName().equals("Nurse Organization")) {
            NursingOrganization organization3 = (NursingOrganization) org;
            for (int j = 0; j < organization3.getWorkQueue().getWorkRequestList().size(); j++) {
                organization3.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
            System.out.println("cart " + organization3.getWorkQueue().getWorkRequestList().size());
        }
            if (org.getName().equals("CovidCare Organization")) {
            CovidCareOganization organization4 = (CovidCareOganization) org;
            for (int j = 0; j < organization4.getWorkQueue().getWorkRequestList().size(); j++) {
                organization4.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
        }
             if (org.getName().equals("HouseHold Organization")) {
            HouseHoldOrganization organization5 = (HouseHoldOrganization) org;
            for (int j = 0; j < organization5.getWorkQueue().getWorkRequestList().size(); j++) {
                organization5.getWorkQueue().getWorkRequestList().get(j).setStatus("Ordered");
            }
        }
      }
   
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String cart = "cart";
         if (userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
            setWorkRequest("Medical", "Therapy Organization");
            setWorkRequest("Medical", "Nurse Organization");
            setWorkRequest("Medical", "CovidCare Organization");
            setWorkRequest("Finance", "Money Management Organization");
            setWorkRequest("Finance", "Legal Services Organization");
            setWorkRequest("HouseHold", "HouseHold Organization");
            SendMail email = new SendMail(userAccount.getUserDetails().getEmailId(),cart );
            JOptionPane.showMessageDialog(this, "Order Confirmed! Check Email for Details!");
            emptyCart();
            flagConfirm = true;
        } else {
            JOptionPane.showMessageDialog(this, "No Order Placed");
        }

    }//GEN-LAST:event_confirmBtnActionPerformed

    private void removeMoneyReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMoneyReqBtnActionPerformed
        // TODO add your handling code here:
           if (moneyTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(moneyTable.getValueAt(moneyTable.getSelectedRow(), 0)));
            removeWorkRequest(moneyAdviceModel, moneyTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
   
    }//GEN-LAST:event_removeMoneyReqBtnActionPerformed

    private void removeLegalReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLegalReqBtnActionPerformed
        // TODO add your handling code here:
         if (legalTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(legalTable.getValueAt(legalTable.getSelectedRow(), 0)));
            removeWorkRequest(lawfirmModel, legalTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
 
    }//GEN-LAST:event_removeLegalReqBtnActionPerformed

    private void removeHouseHoldReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeHouseHoldReqBtnActionPerformed
        // TODO add your handling code here:
          if (houseHoldTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(houseHoldTable.getValueAt(houseHoldTable.getSelectedRow(), 0)));
            String value = String.valueOf(houseHoldTable.getValueAt(houseHoldTable.getSelectedRow(), 1));
            removeHouseHoldWorkRequest(houseHoldModel, houseHoldTable, id, value);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
   
    }//GEN-LAST:event_removeHouseHoldReqBtnActionPerformed

    private void jButton_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_payActionPerformed
        // TODO add your handling code here:
           if (flagConfirm) {
            if (userAccount.getCardDetails() != null) {
                Double total = lawCost + moneyCost + nurseCost + therapyCost + householdCost;
                PaymentJpanel pay = new PaymentJpanel(userAccount, total);

                servicesSplitPane.setRightComponent(pay);
            } else {
                JOptionPane.showMessageDialog(null, "Card details not added");
            }
        } else {
            JOptionPane.showMessageDialog(null, "First confirm the orders");
        }
   
    }//GEN-LAST:event_jButton_payActionPerformed

    private void jButton_gotoCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gotoCardActionPerformed
        // TODO add your handling code here:
           if (flagConfirm) {
            MoneyManagement mm = new MoneyManagement(userProcessContainer, system, userAccount, servicesSplitPane);
            servicesSplitPane.setRightComponent(mm);
        } else {
            JOptionPane.showMessageDialog(null, "First confirm the orders");
        }
  
    }//GEN-LAST:event_jButton_gotoCardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CovidCarePanel;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JPanel NursingPanel;
    private javax.swing.JPanel TherapyPanel;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel cartTitle;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTable covidCareTable;
    private javax.swing.JLabel covidCareTitle;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel houseHoldPanel;
    private javax.swing.JTable houseHoldTable;
    private javax.swing.JLabel houseHoldTitle;
    private javax.swing.JButton jButton_gotoCard;
    private javax.swing.JButton jButton_pay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable legalTable;
    private javax.swing.JTable moneyTable;
    private javax.swing.JLabel moneyTitle;
    private javax.swing.JLabel moneyTitle1;
    private javax.swing.JTable nursingTable;
    private javax.swing.JLabel nursingTitle;
    private javax.swing.JButton removeCovidCareReqBtn;
    private javax.swing.JButton removeHouseHoldReqBtn;
    private javax.swing.JButton removeLegalReqBtn;
    private javax.swing.JButton removeMoneyReqBtn;
    private javax.swing.JButton removeNurseReqBtn;
    private javax.swing.JButton removeTherapyReqBtn;
    private javax.swing.JTable therapyTable;
    private javax.swing.JLabel therapyTitle;
    // End of variables declaration//GEN-END:variables
 
    
    private void createMoneyApponitmentModel() {
        moneyAdviceModel = new DefaultTableModel();
        moneyTable.setModel(moneyAdviceModel);
        moneyAdviceModel.addColumn("Request Id");
        moneyAdviceModel.addColumn("Appointment Date");
        moneyAdviceModel.addColumn("Appointment Time");
        moneyAdviceModel.addColumn("Cost");
    }
  
    
    private void viewMoneyAppointmentDetails() {
        System.out.println("money req count....." + userAccount.getWorkQueue().getWorkRequestList().size());
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof MoneyWorkRequest) {
                System.out.println("money req count in if view....." + ((MoneyWorkRequest) workrequest).getId());
                moneyRequest = ((MoneyWorkRequest) workrequest);
                if (!moneyRequest.getStatus().equalsIgnoreCase("Accepted")) {
                    moneyCost += moneyRequest.getPrice();
                    moneyAdviceModel.addRow(new Object[]{
                        moneyRequest.getId(), moneyRequest.getDate(), moneyRequest.getTimeSlot(), moneyRequest.getPrice()
                    });
                }

            }
        }
    }
 
 
  private void createLawfirmModel() {
        lawfirmModel = new DefaultTableModel();
        legalTable.setModel(lawfirmModel);
        lawfirmModel.addColumn("Request Id");
        lawfirmModel.addColumn("Appointment Date");
        lawfirmModel.addColumn("Appointment Time");
        lawfirmModel.addColumn("Appointment Type");
    }
   private void viewLawfirmDetails() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof LawFirmWorkRequest) {
                lawRequest = ((LawFirmWorkRequest) workrequest);
                if (!lawRequest.getStatus().equalsIgnoreCase("Accepted")) {
                    lawCost += lawRequest.getConsultationFee();
                    lawfirmModel.addRow(new Object[]{
                        lawRequest.getId(), lawRequest.getDate(), lawRequest.getTimeSlot(), lawRequest.getConsultationType()
                    });
                }
            }
        }
    }
    private void emptyCart() {
        covidModel.getDataVector().removeAllElements();
        lawfirmModel.getDataVector().removeAllElements();
        moneyAdviceModel.getDataVector().removeAllElements();
        nurseModel.getDataVector().removeAllElements();
        therapyModel.getDataVector().removeAllElements();
        houseHoldModel.getDataVector().removeAllElements();

    }

}
 
