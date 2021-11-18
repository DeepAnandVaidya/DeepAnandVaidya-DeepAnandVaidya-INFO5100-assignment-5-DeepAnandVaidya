/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Business;
import business.DeliveryStaff.DeliveryStaff;
import business.DeliveryStaff.DeliveryStaffDirectory;
import business.FlagClass;
import business.employee.Employee;
import business.role.DeliveryManRole;
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
public class ManageDeliveryStaffPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryStaffPanel
     */
    Business business;
    DeliveryStaffDirectory deliveryStaffDirectory;
    FlagClass flags;

    public ManageDeliveryStaffPanel(Business business, DeliveryStaffDirectory deliveryStaffDirectory) {
        initComponents();
        this.business = business;
        this.deliveryStaffDirectory = deliveryStaffDirectory;

        JTableHeader tableHeader = tblDeliveryStaff.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        populateDeliveryStaffRole();
        pnlUpdateUser.setVisible(false);
        flags = new FlagClass();
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
        tblDeliveryStaff = new javax.swing.JTable();
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
        pnlUpdateUser = new javax.swing.JPanel();
        lblAddUser1 = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        lblLastName1 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtUserName1 = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        btnUpdateSave = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 255, 255));

        lblPanelHeading.setBackground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPanelHeading.setForeground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelHeading.setText("Delivery Staff");

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

        tblDeliveryStaff.setBackground(new java.awt.Color(255, 255, 255));
        tblDeliveryStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDeliveryStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "USERNAME", "PASSWORD", "FULL NAME"
            }
        ));
        tblDeliveryStaff.setSelectionBackground(new java.awt.Color(153, 209, 232));
        tblDeliveryStaff.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblDeliveryStaff);

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
        lblLastName.setText("Last Name : ");

        pnlUpdateUser.setBackground(new java.awt.Color(240, 255, 255));

        lblAddUser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddUser1.setForeground(new java.awt.Color(0, 102, 102));
        lblAddUser1.setText("UPDATE USER");

        lblFirstName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName1.setText("First Name : ");

        lblLastName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName1.setText("Last Name : ");

        lblUserName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName1.setText("Username : ");

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword1.setText("Password : ");

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

        javax.swing.GroupLayout pnlUpdateUserLayout = new javax.swing.GroupLayout(pnlUpdateUser);
        pnlUpdateUser.setLayout(pnlUpdateUserLayout);
        pnlUpdateUserLayout.setHorizontalGroup(
            pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                                .addComponent(lblLastName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                                .addComponent(lblFirstName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                                .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(lblAddUser1))
                        .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(btnUpdateSave)))
                    .addContainerGap(57, Short.MAX_VALUE)))
        );
        pnlUpdateUserLayout.setVerticalGroup(
            pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateUserLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUpdateUserLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(lblAddUser1)
                    .addGap(18, 18, 18)
                    .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFirstName1)
                        .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLastName1)
                        .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUserName1)
                        .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(lblPassword1)
                    .addGap(31, 31, 31)
                    .addComponent(btnUpdateSave)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(pnlUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLastName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFirstName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblAddUser))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnCreateUser)))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDelete))
                    .addComponent(lblAddUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnCreateUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        if (validations()) {
            String userName = txtUserName.getText();
            String password = pwdPassword.getText();

            if (!business.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                JOptionPane.showMessageDialog(null, "UserName already taken!");
                txtUserName.setText("");
                pwdPassword.setText("");
            } else {
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                Employee employee = new Employee(txtFirstName.getText() + " " + txtLastName.getText());
                DeliveryManRole role = new DeliveryManRole();
                business.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                JOptionPane.showMessageDialog(null, "User Account added successfully.");
                txtFirstName.setText("");
                txtLastName.setText("");
                txtUserName.setText("");
                pwdPassword.setText("");
                populateDeliveryStaffRole();

                DeliveryStaff deliveryStaff = deliveryStaffDirectory.addDeliveryStaff();
                deliveryStaff.setUserName(userName);
                deliveryStaff.setFirstName(firstName);
                deliveryStaff.setLastName(lastName);
                business.setDeliveryStaffDirectory(deliveryStaffDirectory);
            }
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        if (updateValidations()) {

            if (!business.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName1.getText())) {
                JOptionPane.showMessageDialog(null, "UserName already taken!");
                txtUserName1.setText("");
                txtPassword.setText("");
            } else {

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

                DeliveryStaff staff = business.getDeliveryStaffDirectory().findStaffByUserName(flags.getUserName());
                staff.setUserName(txtUserName1.getText());

                for (int i = 0; i <= business.getDeliveryStaffDirectory().getDeliveryStaffMembers().size() - 1; i++) {
                    if (business.getDeliveryStaffDirectory().getDeliveryStaffMembers().get(i).getUserName().equals(flags.getUserName())) {
                        business.getDeliveryStaffDirectory().getDeliveryStaffMembers().set(i, staff);
                    }
                }

                business.getOrderDirectory().updateSelectedDeliveryStaffOrders(flags.getDeliveryStaffName(), txtFirstName1.getText() + " " + txtLastName1.getText());
                JOptionPane.showMessageDialog(null, "User Account updated successfully.");
                pnlUpdateUser.setVisible(false);
                populateDeliveryStaffRole();
            }
        }
    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblDeliveryStaff.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a User");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblDeliveryStaff.getModel();
            UserAccount selectedUserAccount = (UserAccount) model.getValueAt(selectedRowIndex, 0);
            UserAccount accountToBeRemoved = business.getUserAccountDirectory().fetchUserAccountUsingUserName(selectedUserAccount.getUsername());
            business.getUserAccountDirectory().removeAccount(accountToBeRemoved);
            JOptionPane.showMessageDialog(null, "User Account deleted successfully.");
            populateDeliveryStaffRole();

            DeliveryStaff staff = business.getDeliveryStaffDirectory().findStaffByUserName(selectedUserAccount.getUsername());

            business.getOrderDirectory().removeSelectedDeliveryStaffOrders(staff.getFirstName() + " " + staff.getLastName());
            business.getDeliveryStaffDirectory().removeRestaurant(staff);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int selectedRowIndex = tblDeliveryStaff.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a User");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblDeliveryStaff.getModel();
            UserAccount selectedUserAccount = (UserAccount) model.getValueAt(selectedRowIndex, 0);
            pnlUpdateUser.setVisible(true);
            txtFirstName1.setText(selectedUserAccount.getEmployee().getName().substring(0, selectedUserAccount.getEmployee().getName().indexOf(" ")));
            txtLastName1.setText(selectedUserAccount.getEmployee().getName().substring(selectedUserAccount.getEmployee().getName().indexOf(" ") + 1, selectedUserAccount.getEmployee().getName().length()));
            txtUserName1.setText(selectedUserAccount.getUsername());
            txtPassword.setText(selectedUserAccount.getPassword());
            flags.setUserName(selectedUserAccount.getUsername());
            flags.setDeliveryStaffName(selectedUserAccount.getEmployee().getName());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private boolean validations() {
        boolean validData = true;
        if (txtFirstName == null || txtFirstName.getText().isBlank() || txtFirstName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the First Name.");
            validData = false;
            return validData;
        } else if (txtLastName == null || txtLastName.getText().isBlank() || txtLastName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Last Name.");
            validData = false;
            return validData;
        } else if (txtUserName.getText().isBlank() || txtUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a valid User Name.");
            validData = false;
            return validData;
        } else if (pwdPassword.getText().isBlank() || pwdPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Password.");
            validData = false;
            return validData;
        } else {
            return true;
        }
    }

    private boolean updateValidations() {
        boolean validData = true;
        if (txtFirstName1 == null || txtFirstName1.getText().isBlank() || txtFirstName1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the First Name.");
            validData = false;
            return validData;
        } else if (txtLastName1 == null || txtLastName1.getText().isBlank() || txtLastName1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Last Name.");
            validData = false;
            return validData;
        } else if (txtUserName1.getText().isBlank() || txtUserName1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a valid User Name.");
            validData = false;
            return validData;
        } else if (txtPassword.getText().isBlank() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Password.");
            validData = false;
            return validData;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblAddUser1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblPanelHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JPanel pnlUpdateUser;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable tblDeliveryStaff;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserName1;
    // End of variables declaration//GEN-END:variables

    private void populateDeliveryStaffRole() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryStaff.getModel();
        model.setRowCount(0);

        for (UserAccount userAccount : business.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[3];
            RestaurantRole role = new RestaurantRole();
            if (userAccount.getRole() != null && userAccount.getRole().type != null && userAccount.getRole().type == Role.RoleType.DeliveryMan) {
                row[0] = userAccount;
                row[1] = userAccount.getPassword();
                row[2] = userAccount.getEmployee().getName();
                model.addRow(row);
            }
        }
    }
}
