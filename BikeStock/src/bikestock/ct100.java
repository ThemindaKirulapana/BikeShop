/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bikestock;

import Data.dbcon;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class ct100 extends javax.swing.JFrame {

    /**
     * Creates new form ct100
     */
    public ct100() {
        initComponents();
        avelable();
    }

  
    Invoice I=new Invoice();
    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtengnum4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtchassnum = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbcapa = new javax.swing.JComboBox<>();
        cmbfuelcapa = new javax.swing.JComboBox<>();
        cmbcolor = new javax.swing.JComboBox<>();
        txttrance = new javax.swing.JTextField();
        txtprice5 = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaltina = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        coun = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setText("Chasiss Number");

        jLabel5.setText("Capacity");

        jLabel7.setText("Fuel Capacity");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtengnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtengnum4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtengnum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, -1));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setText("CT 100");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(204, 204, 204)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 840, 90));
        getContentPane().add(txtchassnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, -1));
        getContentPane().add(txtweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Engine Number");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setText("Chasiss Number");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 77, -1, -1));

        jLabel4.setText("Weight");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel6.setText("Capacity");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, -1));

        jLabel8.setText("Fuel Capacity");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel9.setText("Color");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel10.setText("Tracemisson");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 20));

        jLabel11.setText("Price");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 40, -1));

        cmbcapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100CC", "125CC", "150CC", " " }));
        jPanel2.add(cmbcapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 150, -1));

        cmbfuelcapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8L", "10L", "12L" }));
        jPanel2.add(cmbfuelcapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 150, -1));

        cmbcolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "BROWN", "MEROON", "RED", " " }));
        jPanel2.add(cmbcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 150, -1));
        jPanel2.add(txttrance, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 150, 30));
        jPanel2.add(txtprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 160, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnupdate.setText("Update Record");
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        tblPaltina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ENGINE NUMBER", "CHASSIS NUMBER", "WEIGHT", "CAPACITY", "FUEL CAPACITY", "COLOUR", "TRANCEMISSION", "PRICE", "STATUS UPDATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPaltina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaltinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPaltinaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPaltinaMousePressed(evt);
            }
        });
        tblPaltina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPaltinaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPaltina);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 780, 170));

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel2.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 232, -1, 30));

        coun.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jPanel2.add(coun, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 50, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("NUMBER OF BIKES IN STOCK");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bjaj bn =new bjaj();
        bn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
              
              
                  
                  
                  
             
        
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
         String eng=txtengnum4.getText();
         String chass=txtchassnum.getText();
         String weight=txtweight.getText();
         String capa=cmbcapa.getSelectedItem().toString();
         String fuel=cmbfuelcapa.getSelectedItem().toString();

             
         String color= cmbcolor.getSelectedItem().toString();
         String trance=txttrance.getText();
         float  price =Float.parseFloat(txtprice5.getText());
         
         if(eng.equals("")||chass.equals("")||weight.equals("")||capa.equals("")||trance.equals("")||fuel.equals("")||color.equals("")){
             
          JOptionPane.showMessageDialog(null,"Please fill Fealds");   
             
         }
         else{
         try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
        int row_count=st.executeUpdate("INSERT INTO ct100 VALUES('"+eng+"','"+chass+"','"+weight+"','"+capa+"','"+fuel+"','"+color+"','"+trance+"','"+price+"')");
        
        if(row_count>0)
         {
            JOptionPane.showMessageDialog(null, "Record Insert");
           
            avelable();
         }
        else
         {
            JOptionPane.showMessageDialog(null, "ERROR");
         }
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
         }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
       try
        {
           
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("ENGINE NUMBER");
        dtm.addColumn("CHASISS NUMBER");
        dtm.addColumn("WEIGHT");
        dtm.addColumn("CAPACITY");
        dtm.addColumn("FUEL CAPACITY");
         dtm.addColumn("COLOUR");
          dtm.addColumn("TRANCEMISSION");
           dtm.addColumn("PRICE");
        
        Statement st=dbcon.createDbConnection().createStatement();
        java.sql.ResultSet rst=st.executeQuery("select * from ct100");
       while(rst.next())
            {
                String[] value=new String[8];
                value[0]=rst.getString(1);
                value[1]=rst.getString(2);
                value[2]=rst.getString(3);
                value[3]=rst.getString(4);
                value[5]=rst.getString(6);
                value[6]=rst.getString(7);
                value[7]=rst.getString(8);
              
                 
                dtm.addRow(value);
            }
         tblPaltina.setModel(dtm);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void tblPaltinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaltinaMouseClicked
        // TODO add your handling code here:
        
          int index =  tblPaltina.getSelectedRow();
        
        TableModel model = tblPaltina.getModel();
        
        String engine2 = model.getValueAt(index, 0).toString();
        String price0 = model.getValueAt(index, 7).toString();
        
        
        I.setVisible(true);
        I.pack();
        I.setLocationRelativeTo(null);
        
        I.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
        
        I.txtengnum44.setText(engine2);
        I.price0.setText(price0);
       
        
     /*    returnEngin a=new returnEngin();
         String eng=a.returnENG();
        */
     
    }//GEN-LAST:event_tblPaltinaMouseClicked

    private void tblPaltinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaltinaMousePressed
        // TODO add your handling code here:
           
        
    }//GEN-LAST:event_tblPaltinaMousePressed

    private void tblPaltinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPaltinaKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_tblPaltinaKeyPressed

    private void tblPaltinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaltinaMouseEntered
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_tblPaltinaMouseEntered

    private void txtengnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtengnum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtengnum4ActionPerformed

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
            java.util.logging.Logger.getLogger(ct100.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ct100.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ct100.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ct100.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ct100().setVisible(true);
            }
        });
    }
    
    public void avelable(){
       
        try{
           Statement st=dbcon.createDbConnection().createStatement();
        java.sql.ResultSet rst=st.executeQuery("select count(*) from  ct100");
       while(rst.next())
            {
               int count=rst.getInt(1);
               coun.setText(String.valueOf(count));
            } 
            
        }
        catch(Exception Ex){
           
              JOptionPane.showMessageDialog(null, Ex.getMessage());
        }
        
        
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JComboBox<String> cmbcapa;
    private javax.swing.JComboBox<String> cmbcolor;
    private javax.swing.JComboBox<String> cmbfuelcapa;
    private javax.swing.JLabel coun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaltina;
    private javax.swing.JTextField txtchassnum;
    public javax.swing.JTextField txtengnum4;
    private javax.swing.JTextField txtprice5;
    private javax.swing.JTextField txttrance;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
