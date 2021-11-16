/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantRole;

import business.Business;
import business.Restaurant.Restaurant;
import business.Restaurant.RestaurantDirectory;
import business.useraccount.UserAccount;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author deepv
 */
public class RestaurantAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantAreaJPanel
     */
    Business business;
    RestaurantDirectory restaurantDirectory;
    UserAccount account;
    Restaurant restaurant;
    String managerName;

    public RestaurantAreaJPanel(JPanel userProcessContainer, UserAccount account, Business business, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.business = business;
        this.restaurantDirectory = restaurantDirectory;
        this.account = account;
        managerName = account.getEmployee().getName();
        restaurant = restaurantDirectory.findRestaurant(managerName);
        lblRestaurantName.setText(restaurant.getName() == null ? managerName + "'s Dashboard" : restaurant.getName());
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
        NavigationJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        workAreaPanel = new javax.swing.JPanel();
        lblRestaurantName = new javax.swing.JLabel();
        EditDetailsPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCuisine = new javax.swing.JLabel();
        txtCuisine = new javax.swing.JTextField();
        lblVeg = new javax.swing.JLabel();
        chkVeg = new javax.swing.JCheckBox();
        lblNonVeg = new javax.swing.JLabel();
        chkNonVeg = new javax.swing.JCheckBox();
        lblVegan = new javax.swing.JLabel();
        chkVegan = new javax.swing.JCheckBox();
        lvlAll = new javax.swing.JLabel();
        chkAll = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        NavigationJPanel.setBackground(new java.awt.Color(0, 51, 51));

        jButton1.setBackground(new java.awt.Color(206, 217, 217));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("MENU");

        jButton2.setBackground(new java.awt.Color(206, 217, 217));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("VIEW DELIVERY STAFF");

        jButton3.setBackground(new java.awt.Color(206, 217, 217));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("VIEW ORDERS");

        jButton4.setBackground(new java.awt.Color(206, 217, 217));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("EDIT DETAILS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationJPanelLayout = new javax.swing.GroupLayout(NavigationJPanel);
        NavigationJPanel.setLayout(NavigationJPanelLayout);
        NavigationJPanelLayout.setHorizontalGroup(
            NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavigationJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        NavigationJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        NavigationJPanelLayout.setVerticalGroup(
            NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationJPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        NavigationJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jSplitPane1.setLeftComponent(NavigationJPanel);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        workAreaPanel.setBackground(new java.awt.Color(240, 255, 255));

        lblRestaurantName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRestaurantName.setForeground(new java.awt.Color(0, 153, 153));
        lblRestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantName.setText("<restaurant name>");

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblRestaurantName)
                .addContainerGap(545, Short.MAX_VALUE))
        );

        jLayeredPane1.add(workAreaPanel, "card2");

        EditDetailsPanel.setBackground(new java.awt.Color(240, 255, 255));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 153, 153));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Edit Restaurant Details");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 51, 51));
        lblName.setText("NAME : ");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 51, 51));
        lblAddress.setText("ADDRESS : ");

        lblCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCuisine.setForeground(new java.awt.Color(0, 51, 51));
        lblCuisine.setText("CUISINE : ");

        lblVeg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVeg.setForeground(new java.awt.Color(0, 51, 51));
        lblVeg.setText("VEG : ");

        chkVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVegActionPerformed(evt);
            }
        });

        lblNonVeg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNonVeg.setForeground(new java.awt.Color(0, 51, 51));
        lblNonVeg.setText("NON-VEG : ");

        chkNonVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNonVegActionPerformed(evt);
            }
        });

        lblVegan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVegan.setForeground(new java.awt.Color(0, 51, 51));
        lblVegan.setText("VEGAN : ");

        chkVegan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVeganActionPerformed(evt);
            }
        });

        lvlAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlAll.setForeground(new java.awt.Color(0, 51, 51));
        lvlAll.setText("ALL :");

        chkAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAllActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(215, 254, 211));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(72, 151, 64));
        btnSave.setText("SAVE CHANGES");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 51));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditDetailsPanelLayout = new javax.swing.GroupLayout(EditDetailsPanel);
        EditDetailsPanel.setLayout(EditDetailsPanelLayout);
        EditDetailsPanelLayout.setHorizontalGroup(
            EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                        .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditDetailsPanelLayout.createSequentialGroup()
                                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCuisine, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVeg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNonVeg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVegan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lvlAll, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtAddress)
                                    .addComponent(txtCuisine, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(chkVeg)
                                    .addComponent(chkNonVeg)
                                    .addComponent(chkVegan)
                                    .addComponent(chkAll))))
                        .addContainerGap(269, Short.MAX_VALUE))
                    .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(24, 24, 24))))
        );
        EditDetailsPanelLayout.setVerticalGroup(
            EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblHeader))
                    .addGroup(EditDetailsPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)))
                .addGap(97, 97, 97)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuisine)
                    .addComponent(txtCuisine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVeg)
                    .addComponent(chkVeg))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNonVeg)
                    .addComponent(chkNonVeg))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVegan)
                    .addComponent(chkVegan))
                .addGap(18, 18, 18)
                .addGroup(EditDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlAll)
                    .addComponent(chkAll))
                .addGap(54, 54, 54)
                .addComponent(btnSave)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLayeredPane1.add(EditDetailsPanel, "card3");

        jSplitPane1.setRightComponent(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switchPanels(EditDetailsPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void chkNonVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNonVegActionPerformed
        chkVeg.setSelected(false);
        chkVegan.setSelected(false);
        chkAll.setSelected(false);
    }//GEN-LAST:event_chkNonVegActionPerformed

    private void chkVeganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVeganActionPerformed
        chkVeg.setSelected(false);
        chkNonVeg.setSelected(false);
        chkAll.setSelected(false);
    }//GEN-LAST:event_chkVeganActionPerformed

    private void chkAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAllActionPerformed
        chkVeg.setSelected(false);
        chkNonVeg.setSelected(false);
        chkVegan.setSelected(false);
    }//GEN-LAST:event_chkAllActionPerformed

    private void chkVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVegActionPerformed
        chkNonVeg.setSelected(false);
        chkVegan.setSelected(false);
        chkAll.setSelected(false);
    }//GEN-LAST:event_chkVegActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        restaurant.setName(txtName.getText());
        restaurant.setAddress(txtAddress.getText());
        restaurant.setCuisine(txtCuisine.getText());

        if (chkVeg.isSelected()) {
            restaurant.setVegOrNonVeg("VEG");
        } else if (chkNonVeg.isSelected()) {
            restaurant.setVegOrNonVeg("NON-VEG");
        } else if (chkVegan.isSelected()) {
            restaurant.setVegOrNonVeg("VEGAN");
        } else {
            restaurant.setVegOrNonVeg("ALL");
        }

        JOptionPane.showMessageDialog(null, "Restaurant Details saved successfully.");
        txtName.setText("");
        txtAddress.setText("");
        txtCuisine.setText("");
        chkVeg.setSelected(false);
        chkNonVeg.setSelected(false);
        chkVegan.setSelected(false);
        chkAll.setSelected(false);
        switchPanels(workAreaPanel);

        for (int i = 0; i <= restaurantDirectory.getRestaurants().size() - 1; i++) {
            if (restaurantDirectory.getRestaurants().get(i).getManagerName().equals(managerName)) {
                restaurantDirectory.getRestaurants().set(i, restaurant);
            }
        }
        
        lblRestaurantName.setText(restaurant.getName());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        switchPanels(workAreaPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void switchPanels(Component component) {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(component);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EditDetailsPanel;
    private javax.swing.JPanel NavigationJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkAll;
    private javax.swing.JCheckBox chkNonVeg;
    private javax.swing.JCheckBox chkVeg;
    private javax.swing.JCheckBox chkVegan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCuisine;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNonVeg;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblVeg;
    private javax.swing.JLabel lblVegan;
    private javax.swing.JLabel lvlAll;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCuisine;
    private javax.swing.JTextField txtName;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables

}
