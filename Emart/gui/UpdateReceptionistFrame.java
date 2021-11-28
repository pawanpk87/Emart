/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.gui;

import Emart.dao.ReceptionistDao;
import Emart.pojo.ReceptionistPojo;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UpdateReceptionistFrame extends javax.swing.JFrame {

    Map<String,String> allId;
    String password;
    public UpdateReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        getEmployees();
    }

    public boolean validPassword()
    {
       char [] pwd1=jPassword.getPassword();
       char [] pwd2=jRePassword.getPassword();
       
       if(pwd1.length < 4 || pwd2.length < 4)
       {
            JOptionPane.showMessageDialog(null,"Password must be atleast 4 characters long !","too small!",JOptionPane.INFORMATION_MESSAGE);
            return false;
       }
       password=String.valueOf(pwd1);
       String repassword=String.valueOf(pwd1);
       if(!password.equals(repassword))
       {
           JOptionPane.showMessageDialog(null,"Password do not match!","Not Matching!",JOptionPane.ERROR_MESSAGE);
           return false;
       }
       return true;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnLogout = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jcomboEmpId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRePassword = new javax.swing.JPasswordField();
        jPassword = new javax.swing.JPasswordField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Emart/images/staffpeople.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Receptionist Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jbtnLogout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogout.setText("Logout");
        jbtnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogout.setContentAreaFilled(false);
        jbtnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jcomboEmpId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcomboEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboEmpIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Repassword");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee Name");

        jRePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jcomboEmpId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRePassword)
                    .addComponent(jPassword))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomboEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jbtnUpdate)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed

        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        new ManageReceptionistFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed

        if(!validPassword())
        {
            return;
        }
        if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"UserId can not be left!","Imcomplete data!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{            
            String userId=jcomboEmpId.getSelectedItem().toString();
            boolean result=ReceptionistDao.updatePassword(userId,password);
            if(!result)
            {
                JOptionPane.showMessageDialog(null,"Password could not Update !","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                jcomboEmpId.setSelectedIndex(0);
                return;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jcomboEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboEmpIdActionPerformed

        try{
            String userId=jcomboEmpId.getSelectedItem().toString();
            txtEmpName.setText(allId.get(userId));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }

    }//GEN-LAST:event_jcomboEmpIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPasswordField jRePassword;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<String> jcomboEmpId;
    private javax.swing.JTextField txtEmpName;
    // End of variables declaration//GEN-END:variables

   private void getEmployees() {
        
        try{
            
            allId=ReceptionistDao.getallRecpId();
            if(allId.isEmpty())
            {
              JOptionPane.showMessageDialog(null,"No Receptionist Present!!","Not Found!",JOptionPane.INFORMATION_MESSAGE);            
              return;   
            }
            jbtnUpdate.setEnabled(true);
            Set<String> id=allId.keySet();
            for(String str : id)
            {
                jcomboEmpId.addItem(str);
            }
            txtEmpName.setText("");
        }
        catch(SQLException ex)
        { 
          JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          return;
        } 
        
    }
    public boolean validateInput()
    {
        if(txtEmpName.getText().trim().isEmpty())
            return false;
        return true;
    }
    private void clearText() {
       txtEmpName.setText("");       
       jPassword.setText("");
       jRePassword.setText("");       
    }
}
