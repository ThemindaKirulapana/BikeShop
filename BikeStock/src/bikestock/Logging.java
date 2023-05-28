/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bikestock;

import Data.dbcon;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import  java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class Logging extends javax.swing.JFrame {

    /**
     * Creates new form Logging
     */
    public Logging() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUS = new javax.swing.JTextField();
        txtPW = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlog = new javax.swing.JButton();
        btnsignin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("Logging");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 33));
        jPanel1.add(txtPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 220, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("User name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 93, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, -1));

        btnlog.setBackground(new java.awt.Color(204, 0, 255));
        btnlog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlog.setForeground(new java.awt.Color(255, 255, 204));
        btnlog.setText("Logging");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });
        jPanel1.add(btnlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 213, 90, 40));

        btnsignin.setBackground(new java.awt.Color(204, 0, 255));
        btnsignin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsignin.setForeground(new java.awt.Color(255, 255, 204));
        btnsignin.setText("Sign In");
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 213, 94, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 520, 280));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setText("LOGGING");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel4)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        // TODO add your handling code here:
        SignUp we=new SignUp();
        we.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        // TODO add your handling code here:
          
         
          String password=txtPW.getText();
          String user=txtUS.getText();
          
          if(user.equals("")&&password.equals(""))
          {
              JOptionPane.showMessageDialog(null,"Please fill User name or Password");
          }
          else
          {
             try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM signup WHERE username='"+user+"' AND password='"+password+"'");
        if(rs.next())
         {
            JOptionPane.showMessageDialog(null, "Login Sucessfull");  
            Main1 m =new Main1();
            m.setVisible(true);
            this.dispose();
         }
        else
         {
            JOptionPane.showMessageDialog(null, "Username or password is incorrect");
         }
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        } 
          }
          
      
        
    }//GEN-LAST:event_btnlogActionPerformed

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
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logging().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnsignin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtUS;
    // End of variables declaration//GEN-END:variables
}
