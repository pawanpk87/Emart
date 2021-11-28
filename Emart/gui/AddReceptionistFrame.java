/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.gui;

import Emart.dao.EmployeeDao;
import Emart.dao.ReceptionistDao;
import Emart.pojo.UserPojo;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddReceptionistFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddReceptionistFrame
     */
    Map<String,String> receptionistList;
    public AddReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);        
        resetInput();
    }
    
    public int validateInput()
    {
        if(jPassword.getPassword().length <4 || jrePassword.getPassword().length<4)
        {
            return -1;
        }
        else if(txtUserID.getText().trim().isEmpty())
            return 0;
        else
            return 1;
    }
    public boolean isPasswordMatching(String pwd,String repwd)
    {
        return pwd.equals(repwd);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnLogout = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jrePassword = new javax.swing.JPasswordField();
        jcomboEmpId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Emart/images/staffpeople.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Receptionist Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

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
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jbtnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdd.setText("Add");
        jbtnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAdd.setContentAreaFilled(false);
        jbtnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User ID");

        txtUserID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Re Password");

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jrePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jcomboEmpId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcomboEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboEmpIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpName)
                            .addComponent(txtUserID)
                            .addComponent(jcomboEmpId, 0, 195, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(jrePassword))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAdd))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed

        int result=validateInput();
        
        if(result==-1)
        {
            JOptionPane.showMessageDialog(null,"Password must be atleast 4 characters long !","too small!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else if(result == 0)
        {
            JOptionPane.showMessageDialog(null,"UserId can not be left!","Imcomplete data!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        char [] pwd=jPassword.getPassword();
        char [] repwd=jPassword.getPassword();
        if(!isPasswordMatching(String.valueOf(pwd),String.valueOf(repwd)))
        {
            JOptionPane.showMessageDialog(null,"Password do not match!","Not Matching!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            String empId=jcomboEmpId.getSelectedItem().toString();
            String empName=txtEmpName.getText();
            String userId=txtUserID.getText();
            UserPojo user=new UserPojo();
            user.setEmpid(empId);
            user.setUsername(empName);
            user.setUserid(userId);
            user.setPassword(String.valueOf(pwd));            

            boolean result2=ReceptionistDao.addReceptionist(user);
            if(!result2)
            {
                JOptionPane.showMessageDialog(null,"Record could not Added !","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Record Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                resetInput();
                return;
            }
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Invalid input!","Error!",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
            return;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jcomboEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboEmpIdActionPerformed
        
        if(jcomboEmpId.getItemCount()==0)
            return;
        txtEmpName.setText(receptionistList.get(jcomboEmpId.getSelectedItem().toString()));
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
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JComboBox<String> jcomboEmpId;
    private javax.swing.JPasswordField jrePassword;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables

   private void resetInput() {
        
        try{
            
            receptionistList=ReceptionistDao.getNotRegisteredReceptionist();
            if(receptionistList.isEmpty())
            {
               JOptionPane.showMessageDialog(null,"No Un-registered receptionist present!!","Not found!",JOptionPane.INFORMATION_MESSAGE);
               jbtnAdd.setEnabled(false);
               return; 
            }
            jbtnAdd.setEnabled(true);
            Set<String> list=receptionistList.keySet();
            Iterator<String> it=list.iterator();
            jcomboEmpId.removeAllItems();
            while(it.hasNext())
            {
                jcomboEmpId.addItem(it.next());
            }   
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null,"Problem in Connection Try Again!!","Error!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          return;
        }             
    }

    private void clearText() {
       txtUserID.setText("");
       jPassword.setText("");
       jrePassword.setText("");
       
    }
}
