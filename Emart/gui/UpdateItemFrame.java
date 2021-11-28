/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.gui;

import Emart.dao.ProductsDao;
import Emart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class UpdateItemFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateItemFrame
     */
    DefaultTableModel tm;
    public UpdateItemFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadDetails();
    }

    public boolean validateInput()
    {
        return !(txtProductName.getText().isEmpty() || txtProductPrice.getText().isEmpty() || txtOurPrice.getText().isEmpty() || txtCompanyname.getText().isEmpty() || txtQuantity.getText().isEmpty());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnBack = new javax.swing.JButton();
        jbtnLogout2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtCompanyname = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtOurPrice = new javax.swing.JTextField();
        jcTax = new javax.swing.JComboBox<>();
        jbtnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAllOrders = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Item Panel");

        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBack.setText("Back");
        jbtnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBack.setContentAreaFilled(false);
        jbtnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jbtnLogout2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnLogout2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogout2.setText("Logout");
        jbtnLogout2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogout2.setContentAreaFilled(false);
        jbtnLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbtnLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBack)
                    .addComponent(jbtnLogout2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Company");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Our Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tax");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Id");

        txtProductId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtProductPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtCompanyname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtOurPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jcTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcTax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "30%", "50%" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtCompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcTax, 0, 125, Short.MAX_VALUE)
                    .addComponent(txtProductName))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jcTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpdate.setText("Update");
        jbtnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnUpdate.setContentAreaFilled(false);
        jbtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUpdate.setEnabled(false);
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jtAllOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtAllOrders.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtAllOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAllOrders.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jtAllOrdersMouseDragged(evt);
            }
        });
        jtAllOrders.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jtAllOrdersMouseWheelMoved(evt);
            }
        });
        jtAllOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAllOrdersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtAllOrdersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtAllOrders);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        new ManageStocksFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogout2ActionPerformed

        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnLogout2ActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed

        if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields!","Imcomplete data!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            int n=jcTax.getSelectedItem().toString().length();
            int tax=Integer.parseInt(jcTax.getSelectedItem().toString().substring(0,n-1));
            ProductsPojo p=new ProductsPojo();
            p.setP_ID(txtProductId.getText().trim());
            p.setP_name(txtProductName.getText().trim());
            p.setP_companyname(txtCompanyname.getText().trim());
            p.setP_price(Double.parseDouble(txtProductPrice.getText().trim()));
            p.setOur_price(Double.parseDouble(txtOurPrice.getText().trim()));
            p.setQuantity(Integer.parseInt(txtQuantity.getText().trim()));
            p.setTax(tax);
            boolean result=ProductsDao.updateProducts(p);

            if(!result)
            {
                JOptionPane.showMessageDialog(null,"Product could not Updated !","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Record Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                tm.setRowCount(0);
                loadDetails();
                resetInput();                
                return;
            }
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Please input numaric value!","Error!",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
            return;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jtAllOrdersMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAllOrdersMouseDragged
        
    }//GEN-LAST:event_jtAllOrdersMouseDragged

    private void jtAllOrdersMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jtAllOrdersMouseWheelMoved

    }//GEN-LAST:event_jtAllOrdersMouseWheelMoved

    private void jtAllOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAllOrdersMouseClicked
        int row=jtAllOrders.getSelectedRow();   
        
        String p_id=tm.getValueAt(row,0).toString(); 
        String p_name=tm.getValueAt(row,1).toString();
        String p_company=tm.getValueAt(row,2).toString();
        String p_price=tm.getValueAt(row,3).toString();
        String p_ourprice=tm.getValueAt(row,4).toString();
        String p_quantity=tm.getValueAt(row,5).toString();
        
        int n=tm.getValueAt(row,6).toString().length();
        int tax=Integer.parseInt(tm.getValueAt(row,6).toString().substring(0,n-1));
        
        txtProductId.setText(p_id);
        txtProductName.setText(p_name);
        txtCompanyname.setText(p_company);
        txtProductPrice.setText(p_price);
        txtOurPrice.setText(p_ourprice);
        txtQuantity.setText(p_quantity);
        jcTax.setSelectedItem(String.valueOf(tax)+"%");         
    }//GEN-LAST:event_jtAllOrdersMouseClicked

    private void jtAllOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAllOrdersMousePressed
        
    }//GEN-LAST:event_jtAllOrdersMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout2;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<String> jcTax;
    private javax.swing.JTable jtAllOrders;
    private javax.swing.JTextField txtCompanyname;
    private javax.swing.JTextField txtOurPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
   private void loadDetails() {
        try{
           List<ProductsPojo> al=ProductsDao.getProductDetails();
           if(al==null)
           {
               JOptionPane.showMessageDialog(null,"Not Orders Present!","Not Any!",JOptionPane.INFORMATION_MESSAGE);
               return;
           }
           jbtnUpdate.setEnabled(true);
           tm=(DefaultTableModel)jtAllOrders.getModel();
           Object [] row=new Object[7];
           for(ProductsPojo p : al)
           {
              row[0]=p.getP_ID();
              row[1]=p.getP_name();
              row[2]=p.getP_companyname();
              row[3]=p.getP_price();
              row[4]=p.getOur_price();
              row[5]=p.getQuantity();
              row[6]=p.getTax()+"%";
              tm.addRow(row);
           }           
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error");
            ex.printStackTrace();
        }
    }
   
   
   private void resetInput() {
      txtProductName.setText("");
      txtProductPrice.setText("");
      txtOurPrice.setText("");
      txtCompanyname.setText("");
      txtQuantity.setText("");
      jcTax.setSelectedIndex(0);
    }
}
