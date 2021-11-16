/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Business;
import business.Restaurant.Restaurant;
import business.Restaurant.RestaurantDirectory;
import business.employee.Employee;
import business.role.RestaurantRole;
import business.role.Role;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author deepv
 */
public class ManageRestaurantManagersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantManagersPanel
     */
    Business business;
    JPanel workAreaPanel;
    RestaurantDirectory restaurantDirectory;

    public ManageRestaurantManagersPanel(Business business, JPanel workAreaPanel, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.business = business;
        this.workAreaPanel = workAreaPanel;
        this.restaurantDirectory = restaurantDirectory;

        JTableHeader tableHeader = tblRestaurantManagers.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        populateRestaurantRole();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestaurantManagers = new javax.swing.JTable();
        lblAddUser = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnCreateUser = new javax.swing.JButton();
        lblPanelHeading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 255, 255));

        btnBack.setBackground(new java.awt.Color(252, 227, 227));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRestaurantManagers.setBackground(new java.awt.Color(255, 255, 255));
        tblRestaurantManagers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblRestaurantManagers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "RESTAURANT MANAGERs"
            }
        ));
        tblRestaurantManagers.setSelectionBackground(new java.awt.Color(153, 209, 232));
        tblRestaurantManagers.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblRestaurantManagers);

        lblAddUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(0, 102, 102));
        lblAddUser.setText("ADD NEW USER");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Name : ");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName.setText("Username : ");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Password : ");

        btnCreateUser.setBackground(new java.awt.Color(175, 211, 211));
        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateUser.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateUser.setText("CREATE");
        btnCreateUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblPanelHeading.setBackground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPanelHeading.setForeground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelHeading.setText("Restaurant Managers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAddUser)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(txtUserName)
                                            .addComponent(pwdPassword)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCreateUser)
                                        .addGap(48, 48, 48)))))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddUser)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnCreateUser))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUserName.getText();
        String password = pwdPassword.getText();
        String name = txtName.getText();
        Employee employee = new Employee(name);
        RestaurantRole role = new RestaurantRole();
        business.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        JOptionPane.showMessageDialog(null, "User Account added successfully.");
        txtName.setText("");
        txtUserName.setText("");
        pwdPassword.setText("");
        populateRestaurantRole();
        
        Restaurant restaurant = restaurantDirectory.addRestaurant();
        restaurant.setManagerName(name);
        business.setRestaurantDirectory(restaurantDirectory);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workAreaPanel.remove(this);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.previous(workAreaPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPanelHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable tblRestaurantManagers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateRestaurantRole() {
        DefaultTableModel model = (DefaultTableModel) tblRestaurantManagers.getModel();
        model.setRowCount(0);

        for (UserAccount userAccount : business.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[1];
            RestaurantRole role = new RestaurantRole();
            if (userAccount.getRole() != null && userAccount.getRole().type != null && userAccount.getRole().type == Role.RoleType.RestaurantAdmin) {
                row[0] = userAccount.getEmployee().getName();
                model.addRow(row);
            }
        }
    }
}
