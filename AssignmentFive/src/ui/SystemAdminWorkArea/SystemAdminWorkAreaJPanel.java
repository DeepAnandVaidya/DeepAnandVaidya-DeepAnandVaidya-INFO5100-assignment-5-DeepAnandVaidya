/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Business;
import javax.swing.JPanel;

/**
 *
 * @author deepv
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Business ecosystem) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        NavigationJPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        workAreaPanel = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(240, 255, 255));

        NavigationJPanel.setBackground(new java.awt.Color(0, 51, 51));

        jButton2.setBackground(new java.awt.Color(206, 217, 217));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("MANAGE RESTAURANTS");

        jButton3.setBackground(new java.awt.Color(206, 217, 217));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("MANAGE DELIVERY STAFF");

        jButton4.setBackground(new java.awt.Color(206, 217, 217));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("MANAGE CUSTOMERS");

        javax.swing.GroupLayout NavigationJPanelLayout = new javax.swing.GroupLayout(NavigationJPanel);
        NavigationJPanel.setLayout(NavigationJPanelLayout);
        NavigationJPanelLayout.setHorizontalGroup(
            NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(NavigationJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavigationJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4});

        NavigationJPanelLayout.setVerticalGroup(
            NavigationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationJPanelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        NavigationJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4});

        jSplitPane1.setLeftComponent(NavigationJPanel);

        workAreaPanel.setBackground(new java.awt.Color(240, 255, 255));

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(workAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NavigationJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables
}
