/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.Business;
import business.ConfigureABusiness;
import business.DB4OUtil.DB4OUtil;
import business.Organization;
import business.Restaurant.RestaurantDirectory;
import business.useraccount.UserAccount;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.CardLayout;
import java.nio.file.Paths;
import javax.swing.JPanel;

/**
 *
 * @author deepv
 */
public class MainScreen extends javax.swing.JPanel {

    /**
     * Creates new form MainScreen
     */
    JPanel mainWorkArea;
    UserAccount userAccount;
    Business business;
    private Business system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    RestaurantDirectory restaurantDirectory;

    public MainScreen(JPanel mainWorkArea, UserAccount userAccount, Business business, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.userAccount = userAccount;
        this.business = ConfigureABusiness.configure();
        system = dB4OUtil.retrieveSystem();
        if (system.getRestaurantDirectory() != null) {
            this.restaurantDirectory = system.getRestaurantDirectory();
        } else {
            this.restaurantDirectory = new RestaurantDirectory();
        }
        initUserWorkArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnLogOff = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("<Welcome xyz>");

        btnLogOff.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogOff.setForeground(new java.awt.Color(0, 102, 102));
        btnLogOff.setText("LOGOFF");
        btnLogOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        workArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        // TODO add your handling code here:
        JPanel loginScreen = new LoginScreen(mainWorkArea, business, restaurantDirectory);
        mainWorkArea.add("LoginScreen", loginScreen);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogOffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    private void initUserWorkArea() {
        lblUser.setText("Welcome: " + ((userAccount.getEmployee() != null) ? userAccount.getEmployee().getName() : userAccount.getUsername()));
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("workArea", userAccount.getRole().createWorkArea(workArea, userAccount, system, restaurantDirectory));
        layout.next(workArea);
    }
}
