/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier.SupplierUser;
import BusinessModel.Supplier.Supplier;
import BusinessModel.Supplier.Supply;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.SupplierOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.WorkQueue.DonationWorkReq;
import BusinessModel.WorkQueue.EmergencyAssistanceSupplyWorkReq;
import BusinessModel.WorkQueue.WorkQueue;
import BusinessModel.WorkQueue.WorkReq;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AkshitSaxena
 */
public class SupplierUserWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Supplier s;
    /**
     * Creates new form SupplierManagerWorkArea
     */
    public SupplierUserWorkArea(JPanel downJPanel, UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        completeBtn.setEnabled(false);
        
   /*    System.out.println("Supplier List size" +((SupplierOrganization) org).getSupplierList().getSupplierList().size());
          for (Supplier supplier : ((SupplierOrganization)org).getSupplierList().getSupplierList()) {
              System.out.println("Supplier List" + supplier.getSupplierName());
            if (UserAccount.getEmployee().getEmpname().equals(supplier.getSupplierName())) {
                 s=supplier;
                System.out.println("Supplier Name" + s.getSupplierName());
            }
        }
//        System.out.println("busi" + s.getWorkQueue().getWorkRequestList().size());
        if (s.getWorkqueue() == null) {
            WorkQueue w = new WorkQueue();
            s.setWorkqueue(w);
        }*/
        
        populateSupplyTable();
       populateCreateTable();
      
        
        
        
         
        
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierRequestJTable = new javax.swing.JTable();
        comboReqType = new javax.swing.JComboBox<>();
        assignBtn = new javax.swing.JButton();
        completeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reqTxt = new javax.swing.JTextField();
        qtyTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        createJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Work Area");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        supplierRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirements", "Quantity", "Status", "Source"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierRequestJTable);

        comboReqType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Food", "Clothes", "Medicine", "Education", "Furniture" }));

        assignBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        completeBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        completeBtn.setText("Complete");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Request to Donors");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Requirement: ");

        reqTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reqTxtKeyTyped(evt);
            }
        });

        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Quantity    :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Request Type: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("AVAILABLE  STOCK AND STATUS: ");

        createJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirement", "Quantity", "Status", "Donor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(createJTable);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supply-work-area.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboReqType, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboReqType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(reqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(addBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = supplierRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            EmergencyAssistanceSupplyWorkReq nswr = (EmergencyAssistanceSupplyWorkReq) supplierRequestJTable.getValueAt(selectedRow, 3);

            nswr.setStatus("Pending");
            nswr.setReciever(UserAccount);

            populateSupplyTable();
            completeBtn.setEnabled(true);

        }

    }//GEN-LAST:event_assignBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed

        int selectedRow = supplierRequestJTable.getSelectedRow();
        int selectedRow1 = createJTable.getSelectedRow();

       

            EmergencyAssistanceSupplyWorkReq p = (EmergencyAssistanceSupplyWorkReq) supplierRequestJTable.getValueAt(selectedRow, 3);
            DonationWorkReq d = (DonationWorkReq) createJTable.getValueAt(selectedRow1, 3);
            
            if (p.getReqType().equals(d.getRequestType()) && (p.getRequest().equals(d.getRequirements()) && (p.getQuantity() <= d.getQuantity()))&&  (d.getStatus().equalsIgnoreCase("Completed & Available in Stock")))
            {
                 int diff = d.getQuantity()- p.getQuantity();
                d.setQuantity(diff);
                p.setStatus("Complete");
            }
            else
            {
               
               JOptionPane.showMessageDialog(null, "Please", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
                    populateSupplyTable();
                 populateCreateTable();
              completeBtn.setEnabled(false);

        

    }//GEN-LAST:event_completeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       
        boolean isValid = qtyTxt.getText().matches("\\d+"); 
        
        String type = comboReqType.getSelectedItem().toString();
        String req = reqTxt.getText();
        int quantity = Integer.parseInt(qtyTxt.getText());

        if(req.equals("") || req.isEmpty())

        {
            JOptionPane.showMessageDialog(null, "Please create requirement");
            return;
        }
        else if(qtyTxt.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Empty fields are not accepted");
            return;
        }
        else if(!isValid)
        {
             JOptionPane.showMessageDialog(null, "quantity must be an integer value");
            return;
        }
        
        

     /*   Supply supply = s.getSupplyDirectory().addSupply();

        supply.setReqType(type);
        supply.setReq(req);
        supply.setQuantity(quantity);
          populateCreateTable();

       // reqTypeTxt.setText("");
        reqTxt.setText("");
        qtyTxt.setText("");*/
        
        DonationWorkReq request = new DonationWorkReq();
                request.setRequestType(type);
                request.setRequirements(req);
                request.setQuantity(quantity);
                request.setStatus("Requested To Donors");
                

                //request.setStatus("Requested");request.setSender(account);
                org.getWorkQueue().getWorkRequestList().add(request);
                UserAccount.getWorkQueue().getWorkRequestList().add(request);
                ESystem.getWorkQueue().getWorkRequestList().add(request);
                populateCreateTable();
                reqTxt.setText("");
                qtyTxt.setText("");
        
        
        
                
                 
        
      

      

    }//GEN-LAST:event_addBtnActionPerformed

    private void reqTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reqTxtKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_reqTxtKeyTyped

    private void qtyTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_qtyTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton assignBtn;
    private javax.swing.JComboBox<String> comboReqType;
    private javax.swing.JButton completeBtn;
    private javax.swing.JTable createJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField reqTxt;
    private javax.swing.JTable supplierRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateSupplyTable() {
        DefaultTableModel model = (DefaultTableModel) supplierRequestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof EmergencyAssistanceSupplyWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((EmergencyAssistanceSupplyWorkReq) work).getReqType();
            row[1] = ((EmergencyAssistanceSupplyWorkReq) work).getRequest();
            row[2] = ((EmergencyAssistanceSupplyWorkReq) work).getQuantity();
            row[3] = work;
            row[4] = work.getSender();
           
            
            model.addRow(row);
           }
        } //To change body of generated methods, choose Tools | Templates.
    }

    private void populateCreateTable()
    {
    DefaultTableModel model = (DefaultTableModel) createJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : org.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((DonationWorkReq) work).getRequestType();
            row[1] = ((DonationWorkReq) work).getRequirements();
          
            row[2] = ((DonationWorkReq) work).getQuantity();
            row[3] = work;
            row[4] = work.getReciever();
            
            model.addRow(row);
           }
        }}
    
    }


