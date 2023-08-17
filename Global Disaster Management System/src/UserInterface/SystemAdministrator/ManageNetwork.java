/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdministrator;


import BusinessModel.EcoSystem;
import BusinessModel.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HM
 */
public class ManageNetwork extends javax.swing.JPanel {
private JPanel downJPanel;
    private EcoSystem ecosystem;
    /**
     * Creates new form ManageNetwork
     */
    public ManageNetwork(JPanel downJPanel,EcoSystem ecosystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.ecosystem=ecosystem;
        populateNetworkTable();
    }

    
    public void populateNetworkTable(){
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Network");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 45, -1, -1));

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 54, -1, -1));

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));
        jPanel2.add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 166, 30));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 84, 30));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 90, 80, 30));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(networkJTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 550, 450));

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        downJPanel.remove(this);
        Component[] componentArray = downJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdministratorWorkArea sysAdminwjp = (SystemAdministratorWorkArea) component;
       // sysAdminwjp.populateTree(); //commented for populateTree on 3rd Dec 2022
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);    
       
    }//GEN-LAST:event_BackBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
       Matcher matcher = pattern.matcher(nameTxtField.getText());
        String name = nameTxtField.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Network name!");
                return;
        }
         else if(!matcher.matches())
        {
          JOptionPane.showMessageDialog(null,"Name field should contain only characters");
        }
        else{
        Network network = ecosystem.addNetwork();
        network.setNetworkname(name);
        
        populateNetworkTable();
        nameTxtField.setText("");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow= networkJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Network p=(Network) networkJTable.getValueAt(selectedRow, 0);

            for (Network network : ecosystem.getNetworkList()) {
                    if(p==network){
                      ecosystem.getNetworkList().remove(p);
                        break;
                    }
            }

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateNetworkTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable networkJTable;
    // End of variables declaration//GEN-END:variables
}