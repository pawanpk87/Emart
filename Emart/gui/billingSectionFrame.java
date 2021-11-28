/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.gui;

import Emart.dao.OdersDao;
import Emart.dao.ProductsDao;
import Emart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class billingSectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form billingSectionFrame
     */
    ArrayList<ProductsPojo> allItem=new ArrayList<>();
    DefaultTableModel tm;
    double grTotal=0.0;
    
    public billingSectionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tm=(DefaultTableModel)jtAllOrders.getModel();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jbtnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAllOrders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jbtnGenerateBill = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jbtnLogout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogout.setText("Back");
        jbtnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogout.setContentAreaFilled(false);
        jbtnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View All Orders");

        jtAllOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtAllOrders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtAllOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAllOrders.setEnabled(false);
        jScrollPane1.setViewportView(jtAllOrders);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generate Bill");

        txtProductId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        jbtnGenerateBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGenerateBill.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerateBill.setText("Generate Bill");
        jbtnGenerateBill.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnGenerateBill.setContentAreaFilled(false);
        jbtnGenerateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerateBillActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setText("0.0");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jbtnGenerateBill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGenerateBill)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
        new ReceptionistOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

    private void jbtnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerateBillActionPerformed
        
        try{
            String ordId=OdersDao.getNextOderId();
            if(OdersDao.addOrders(allItem, ordId) && ProductsDao.updateStocks(allItem))
            {
               JOptionPane.showMessageDialog(null,"Order of Rs"+grTotal+"/- created successfully !","Bill generated",JOptionPane.INFORMATION_MESSAGE);
               ViewOrdersFrame vs=new ViewOrdersFrame("ReceptionistOptionFrame");
               vs.setVisible(true);
               this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Orders not created","Not created !",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
        
    }//GEN-LAST:event_jbtnGenerateBillActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        
        if(txtProductId.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please input productId!","Imcomplete data!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        loadDetails(txtProductId.getText().trim());        
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(billingSectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billingSectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billingSectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billingSectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billingSectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnGenerateBill;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JTable jtAllOrders;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public void loadDetails(String pId)
    {
        try{
            
            ProductsPojo p=ProductsDao.getProductDetails(pId);
            if(p == null)
            {
              JOptionPane.showMessageDialog(null,"Item Not Found !!","Not Found!",JOptionPane.ERROR_MESSAGE);
              return; 
            }
            int index=getProductId(pId);        
            if(index == -1)
            {                 
                Object [] row=new Object[8]; 
                int quant=1;
                double amount=quant*p.getOur_price();
                p.setQuantity(1);
                p.setTotal(amount+(amount*p.getTax()/100));
                
                row[0]=p.getP_ID();
                row[1]=p.getP_name();
                row[2]=p.getP_companyname();
                row[3]=p.getP_price();
                row[4]=p.getOur_price();
                row[5]=p.getQuantity();
                row[6]=p.getTax()+"%";
                row[7]=p.getTotal();
                tm.addRow(row);                 
                allItem.add(p); 
                grTotal+=p.getTotal();
            } 
            else
            {
                ProductsPojo prd=allItem.get(index);
                int oldQ=(int)tm.getValueAt(index,5);
                double amt=prd.getOur_price();
                int tax=prd.getTax();
                amt=amt+(amt*tax/100);
                double total=(double)tm.getValueAt(index,7);
                
                tm.setValueAt(++oldQ, index,5);
                tm.setValueAt(total+amt,index,7);
                grTotal+=amt;
                
                prd.setQuantity(oldQ);
                prd.setTotal(total+amt);
                
                allItem.set(index, prd);
            }
            txtTotal.setText(String.valueOf(grTotal));
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }
    
    
    public int getProductId(String pId)
    {
        int index=-1;
        for(int i=0; i<allItem.size(); i++)
        {
            ProductsPojo p=allItem.get(i);
            if(p.getP_ID().equals(pId))
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
