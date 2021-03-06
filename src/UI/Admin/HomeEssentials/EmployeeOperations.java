/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.HomeEssentials;

import UI.Admin.Food.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organizations.FoodOrganization;
import Business.Organizations.GroceryAndEssentialsOrganization;
import Business.Organizations.Organization;
import Business.Role.FoodManagerRole;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class EmployeeOperations extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeOperations
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane adminSplitPane;
    Organization organization;
    //FoodOrganization foodOrg;
    GroceryAndEssentialsOrganization groceryOrg;
    DefaultTableModel model;
    int index;
    Employee selectedEmp;
    
  
  public EmployeeOperations(JPanel userProcessContainer, 
            UserAccount userAccount, 
            EcoSystem system, 
            Organization organization, 
            JSplitPane adminSplitPane, 
            GroceryAndEssentialsOrganization groceryOrg) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.adminSplitPane = adminSplitPane;
        this.groceryOrg = groceryOrg;
        System.out.println("orh name>>>"+organization.getName());
        System.out.println("kay problem aahe>>>"+organization.getEmployeeDirectory().getEmployeeList().size());
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Emp Id");
        model.addColumn("Name");
        
          generateTable();
   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Namecreate = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idUpdate = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nameUpdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1480, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(1254, 116));

        Title.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ForYou");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 1265, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 110));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Emp Id", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 351, 332));

        jLabel8.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel8.setText("Create Employee");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 168, 168, 23));
        add(Namecreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 203, 165, -1));

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 247, 140, 40));

        jLabel9.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel9.setText("Name:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 206, 112, 23));

        jLabel10.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel10.setText("Update Employee");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 306, -1, 23));
        add(idUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 347, 165, -1));

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 150, 40));

        jLabel11.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel11.setText("Id:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 112, 23));
        add(nameUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 391, 165, -1));

        jLabel12.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 394, 112, 23));

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        
          String empName = Namecreate.getText();
        Employee newEmployee = system.getEmployeeDirectory().createEmployee(Namecreate.getText());
        UserAccount newUser = system.getUserAccountDirectory().createUserAccount(empName, empName, newEmployee, new FoodManagerRole("employee"));
        groceryOrg.getUserAccountDirectory().getUserAccountList().add(newUser);
        groceryOrg.getDeliveryManList().add(newUser);
        JOptionPane.showMessageDialog(null, "EMPLOYEE CREATED SUCCESSFULLY");
        model.addRow(new Object[]{
            newEmployee.getId(),
            newEmployee.getName()
        });
    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         if(jTable1.getSelectedRow() >=0){
           
            List<UserAccount> employeeList = groceryOrg.getUserAccountDirectory().getUserAccountList();
            List<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() ==Integer.parseInt(idUpdate.getText())){
//                    System.out.println("in update...."+employeeList.get(i).);
                    employeeList.get(i).getEmployee().setName(nameUpdate.getText());
                   
//                    moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().setName(nameUpdate.getText());
                    JOptionPane.showMessageDialog(null, "DETAILS UPDATED SUCCESSFULLY");
                   
                    model.getDataVector().removeAllElements();
                    showEmployeeList();
                }
            }
              for(int i=0;i<groceryOrg.getDeliveryManList().size();i++){
                if(groceryOrg.getDeliveryManList().get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    groceryOrg.getDeliveryManList().get(i).getEmployee().setName(nameUpdate.getText());
                    System.out.println("in money org update...."+groceryOrg.getDeliveryManList().get(i).getEmployee().getName());
                }
            }
               for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().setName(nameUpdate.getText());
                    System.out.println("in system org update...."+userAccountList.get(i).getEmployee().getName());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "PLEASE SELECT FROM TABLE");
         }

    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
           List<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
        if(jTable1.getSelectedRow() >=0){
//            int text = Integer.parseInt(idUpdate.getText());
            List<UserAccount> employeeList = groceryOrg.getDeliveryManList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    employeeList.remove(i);
                    groceryOrg.getUserAccountDirectory().getUserAccountList().remove(i);
                    model.getDataVector().removeAllElements();
                    JOptionPane.showMessageDialog(null, "EMPLOYEE DELETED SUCCESSFULLY");
                   
                    showEmployeeList();
                }
            }
                for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    userAccountList.remove(i);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "PLEASE SELECT FROM TABLE");
           
          
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         String id = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 0));
        String name = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 1));
        idUpdate.setText(id);
        nameUpdate.setText(name);
        
        idUpdate.setText(model.getValueAt(index, 0).toString());
        nameUpdate.setText(name);

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JTextField Namecreate;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update;
    private javax.swing.JTextField idUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameUpdate;
    // End of variables declaration//GEN-END:variables

private void generateTable() {
//        for(int j = 0; j < organization.getEmployeeDirectory().getEmployeeList().size(); j++){
//            model.addRow(new Object[]{
//                organization.getEmployeeDirectory().getEmployeeList().get(j).getId(),
//                organization.getEmployeeDirectory().getEmployeeList().get(j).getName()
//            });
//        }
        for (int i = 0; i < groceryOrg.getDeliveryManList().size(); i++) {
            model.addRow(new Object[]{
                groceryOrg.getDeliveryManList().get(i).getEmployee().getId(),
                groceryOrg.getDeliveryManList().get(i).getEmployee().getName()
            });
        }
    }

    private void showEmployeeList() {
        for (int i = 0; i < groceryOrg.getDeliveryManList().size(); i++) {
            model.addRow(new Object[]{
                groceryOrg.getDeliveryManList().get(i).getEmployee().getId(),
                groceryOrg.getDeliveryManList().get(i).getEmployee().getName()
            });
        }
    }
    
}
