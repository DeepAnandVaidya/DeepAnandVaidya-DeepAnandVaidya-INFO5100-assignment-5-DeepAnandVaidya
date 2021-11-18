/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Business;
import business.Customer.CustomerDirectory;
import business.FlagClass;
import business.employee.Employee;
import business.role.Customer;
import business.role.RestaurantRole;
import business.role.Role;
import business.useraccount.UserAccount;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author deepv
 */
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerPanel
     */
    Business business;
    CustomerDirectory customerDirectory;
    FlagClass flags;
    
    public ManageCustomerPanel(Business business, CustomerDirectory customerDirectory) {
        initComponents();
        this.business = business;
        this.customerDirectory = customerDirectory;
        this.flags = new FlagClass();
        
        JTableHeader tableHeader = tblCustomers.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        populateCustomerRole();
        pnlUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPanelHeading = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lblAddUser = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        btnCreateUser = new javax.swing.JButton();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        pnlUpdate = new javax.swing.JPanel();
        lblAddUser2 = new javax.swing.JLabel();
        btnUpdateSave = new javax.swing.JButton();
        lblFirstName1 = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        lblLastName1 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtUserName1 = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 255, 255));

        lblPanelHeading.setBackground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPanelHeading.setForeground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelHeading.setText("Customers");

        jButton1.setBackground(new java.awt.Color(252, 227, 227));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblCustomers.setBackground(new java.awt.Color(255, 255, 255));
        tblCustomers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "USER NAME", "PASSWORD", "FULL NAME"
            }
        ));
        tblCustomers.setSelectionBackground(new java.awt.Color(153, 209, 232));
        tblCustomers.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblCustomers);

        lblAddUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(0, 102, 102));
        lblAddUser.setText("ADD NEW USER");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName.setText("First Name : ");

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

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName.setText("Last Name :");

        pnlUpdate.setBackground(new java.awt.Color(240, 255, 255));

        lblAddUser2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddUser2.setForeground(new java.awt.Color(0, 102, 102));
        lblAddUser2.setText("UPDATE USER");

        btnUpdateSave.setBackground(new java.awt.Color(175, 211, 211));
        btnUpdateSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateSave.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdateSave.setText("UPDATE");
        btnUpdateSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSaveActionPerformed(evt);
            }
        });

        lblFirstName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName1.setText("First Name : ");

        lblLastName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName1.setText("Last Name :");

        lblUserName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName1.setText("Username : ");

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword1.setText("Password : ");

        javax.swing.GroupLayout pnlUpdateLayout = new javax.swing.GroupLayout(pnlUpdate);
        pnlUpdate.setLayout(pnlUpdateLayout);
        pnlUpdateLayout.setHorizontalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlUpdateLayout.createSequentialGroup()
                                .addComponent(lblLastName1)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateLayout.createSequentialGroup()
                                .addComponent(lblFirstName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateLayout.createSequentialGroup()
                                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword1)
                                    .addComponent(lblUserName1))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName1)
                                    .addComponent(txtPassword)))))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblAddUser2))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnUpdateSave)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlUpdateLayout.setVerticalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblAddUser2)
                .addGap(18, 18, 18)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName1)
                    .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName1)
                    .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName1)
                    .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateSave)
                .addGap(25, 25, 25))
        );

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("DELETE USER");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 0));
        btnUpdate.setText("UPDATE USER");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate)
                                        .addGap(78, 78, 78))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAddUser)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCreateUser)
                                        .addGap(47, 47, 47)))))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserName)
                                .addComponent(lblPassword)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFirstName, txtLastName, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblAddUser)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnCreateUser))
                    .addComponent(pnlUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUserName.getText();
        String password = pwdPassword.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        Employee employee = new Employee(txtFirstName.getText() + " " + txtLastName.getText());
        Customer role = new Customer();
        business.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        
        JOptionPane.showMessageDialog(null, "User Account added successfully.");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtUserName.setText("");
        pwdPassword.setText("");
        populateCustomerRole();
        
        business.Customer.Customer customer = customerDirectory.addCustomer();
        customer.setUserName(userName);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        business.setCustomerDirectory(customerDirectory);

    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        UserAccount updatedAccount = business.getUserAccountDirectory().fetchUserAccountUsingUserName(flags.getUserName());
        updatedAccount.setUsername(txtUserName1.getText());
        updatedAccount.setPassword(txtPassword.getText());
        Employee employee = new Employee();
        employee.setName(txtFirstName1.getText() + " " + txtLastName1.getText());
        updatedAccount.setEmployee(employee);
        
        for (int i = 0; i <= business.getUserAccountDirectory().getUserAccountList().size() - 1; i++) {
            if (business.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(flags.getUserName())) {
                business.getUserAccountDirectory().getUserAccountList().set(i, updatedAccount);
            }
        }
        
        business.Customer.Customer updatedCustomer = business.getCustomerDirectory().findCustomer(flags.getUserName());
        updatedCustomer.setUserName(txtUserName1.getText());
        updatedCustomer.setFirstName(txtFirstName1.getText());
        updatedCustomer.setLastName(txtLastName1.getText());
        
        for (int i = 0; i <= business.getCustomerDirectory().getCustomers().size() - 1; i++) {
            if (business.getCustomerDirectory().getCustomers().get(i).getUserName().equals(flags.getUserName())) {
                business.getCustomerDirectory().getCustomers().set(i, updatedCustomer);
            }
        }
        
        business.getOrderDirectory().updateSelectedCustomerOrders(flags.getCustomerName(), txtFirstName1.getText() + " " + txtLastName1.getText());
        
        JOptionPane.showMessageDialog(null, "User Account updated successfully.");
        pnlUpdate.setVisible(false);
        populateCustomerRole();

    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblCustomers.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a User");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
            UserAccount selectedUserAccount = (UserAccount) model.getValueAt(selectedRowIndex, 0);
            UserAccount accountToBeRemoved = business.getUserAccountDirectory().fetchUserAccountUsingUserName(selectedUserAccount.getUsername());
            business.getUserAccountDirectory().removeAccount(accountToBeRemoved);
            JOptionPane.showMessageDialog(null, "User Account deleted successfully.");
            populateCustomerRole();
            
            business.Customer.Customer customer = business.getCustomerDirectory().findCustomer(selectedUserAccount.getUsername());
            business.getCustomerDirectory().removeCustomer(customer);
            business.getOrderDirectory().removeSelectedCustomerOrders(selectedUserAccount.getEmployee().getName());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int selectedRowIndex = tblCustomers.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a User");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
            UserAccount selectedUserAccount = (UserAccount) model.getValueAt(selectedRowIndex, 0);
            pnlUpdate.setVisible(true);
            txtFirstName1.setText(selectedUserAccount.getEmployee().getName().substring(0, selectedUserAccount.getEmployee().getName().indexOf(" ")));
            txtLastName1.setText(selectedUserAccount.getEmployee().getName().substring(selectedUserAccount.getEmployee().getName().indexOf(" ") + 1, selectedUserAccount.getEmployee().getName().length()));
            txtUserName1.setText(selectedUserAccount.getUsername());
            txtPassword.setText(selectedUserAccount.getPassword());
            flags.setUserName(selectedUserAccount.getUsername());
            flags.setCustomerName(selectedUserAccount.getEmployee().getName());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblAddUser2;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblPanelHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserName1;
    // End of variables declaration//GEN-END:variables

    private void populateCustomerRole() {
        DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
        model.setRowCount(0);
        
        for (UserAccount userAccount : business.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[3];
            RestaurantRole role = new RestaurantRole();
            if (userAccount.getRole() != null && userAccount.getRole().type != null && userAccount.getRole().type == Role.RoleType.Customer) {
                row[0] = userAccount;
                row[1] = userAccount.getPassword();
                row[2] = userAccount.getEmployee().getName();
                model.addRow(row);
            }
        }
    }
}
