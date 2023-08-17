/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DisasterHelpProviderOrganisationAdmin;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class DisasterHelpProviderOrganisationAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
   
    public DisasterHelpProviderOrganisationAdminWorkArea(JPanel downJPanel,Enterprise enterprise) {
        initComponents();
        this.downJPanel=downJPanel;
        this.enterprise=enterprise;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manageUserAccountBtn = new javax.swing.JButton();
        manageEmployeeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Disaster Help Provider Organisation Admin Work Area");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        manageUserAccountBtn.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        manageUserAccountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_useraccount.jpeg"))); // NOI18N
        manageUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountBtnActionPerformed(evt);
            }
        });

        manageEmployeeBtn.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        manageEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_emp.jpeg"))); // NOI18N
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("MANAGE USER ACCOUNT");

        jLabel4.setText("MANAGE EMPLOYEE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(manageEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(manageUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)
                        .addGap(319, 319, 319)
                        .addComponent(jLabel3)))
                .addContainerGap(442, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountBtnActionPerformed
        ManageUserAccount muajp = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("HelpProviderManageUserAccount", muajp);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageUserAccountBtnActionPerformed

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        ManageEmployee manageEmployeeJPanel = new ManageEmployee(downJPanel, enterprise.getOrganizationDirectory());
       downJPanel.add("GiverManageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}
