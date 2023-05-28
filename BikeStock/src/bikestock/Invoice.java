/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bikestock;

import Data.dbcon;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lenovo
 */
public class Invoice extends javax.swing.JFrame {

  
   

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
    }
     
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtengnum4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnInvoicID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbBike = new javax.swing.JComboBox<>();
        tctnic = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDiscountRate = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        price0 = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        tctnic1 = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtengnum44 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        Bill = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableINVOCE = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btnSAVE = new javax.swing.JButton();
        btnUPDATE = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCal = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reaspt = new javax.swing.JTextArea();
        NICvalidate = new javax.swing.JLabel();
        NICvalidate1 = new javax.swing.JLabel();
        NICvalidate2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtengnum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 190, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Bike Engine Number");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel2.add(btnInvoicID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 40, 37, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Bike Name");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Customer Name");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Discount Rate");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 100, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Invoice ID");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        cmbBike.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, -1));
        jPanel2.add(tctnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 191, 30));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 191, -1));
        jPanel2.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 160, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Customer NIC");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel2.add(txtDiscountRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 160, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Final Bill Amount");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 120, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Price");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 60, -1));

        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK TO MAIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("CUSTOMER INVOICE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(price0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 200, 30));
        jPanel3.add(txtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 191, 30));

        tctnic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tctnic1ActionPerformed(evt);
            }
        });
        tctnic1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tctnic1KeyPressed(evt);
            }
        });
        jPanel3.add(tctnic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 191, 30));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Customer NIC");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Customer Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Bike Price");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setText("Invoce ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        jPanel3.add(txtengnum44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setText("Bike Engine Number");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CT 100", "PLATINA", "DISCOVERY", "PULSAR", "SCOOTY PEP", "TVS SPORTS", "APACHI", "DIO", "HONET", "ACTIVA 5G", " ", " " }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setText("Discount Rate");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setText("Final bill ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setText("Bike Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, -1));
        jPanel3.add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 30));
        jPanel3.add(Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 200, 30));

        jTableINVOCE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NIC", "Customer Name", "Bike Engine Number", "Bike Name", "Price", "Discount", "Final Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableINVOCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableINVOCEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableINVOCE);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 770, 180));

        btnview.setText("VIEW");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel3.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        btnSAVE.setText("SAVE");
        btnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAVEActionPerformed(evt);
            }
        });
        jPanel3.add(btnSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        btnUPDATE.setText("UPDATE");
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });
        jPanel3.add(btnUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        btnCal.setText("CALCULATE");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        jPanel3.add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        btnprint.setText("PRINT INVOICE");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel3.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 482, -1, 40));

        reaspt.setColumns(20);
        reaspt.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        reaspt.setRows(5);
        jScrollPane2.setViewportView(reaspt);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 460, 450));

        NICvalidate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NICvalidate.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(NICvalidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 20));

        NICvalidate1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NICvalidate1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(NICvalidate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, 20));

        NICvalidate2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NICvalidate2.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(NICvalidate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Main1 mi= new Main1();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
public  void NICCvalidate(){
         
       String  nic=tctnic1.getText();
       
       if(nic.length()<10){
           
           NICvalidate.setText("NIC should be 10 or 11 numbers");
           
       }
       else{
           NICvalidate.setText("");
       }
      

 
      
}
    
    private void btnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAVEActionPerformed
       
        
          String name=txtname1.getText();
          String nic=tctnic1.getText();
          String id=ID.getText();
          String engine=txtengnum44.getText();
          String price=price0.getText();
          String rate=txtRate.getText();
          String bill=Bill.getText();
          String Bike=jComboBox1.getSelectedItem().toString();
          
          if(name.equals("")||nic.equals("")||id.equals("")||engine.equals("")||price.equals("")||rate.equals("")||bill.equals("")||Bike.equals(""))
          {
              
              JOptionPane.showMessageDialog(null,"Please fill Fealds");
          }
          else{         
      try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
        int row_count=st.executeUpdate("INSERT INTO invoice4 VALUES('"+id+"','"+nic+"','"+name+"','"+engine+"','"+Bike+"','"+price+"','"+rate+"','"+bill+"')");
        int row_count2=st.executeUpdate("DELETE FROM ct100 where eng='"+engine+"'");
        int row_count3=st.executeUpdate("DELETE FROM platina where eng='"+engine+"'");
        int row_count4=st.executeUpdate("DELETE FROM discovery where eng='"+engine+"'");
        int row_count5=st.executeUpdate("DELETE FROM palsar where eng='"+engine+"'");
        int row_count6=st.executeUpdate("DELETE FROM dio where eng='"+engine+"'");
        int row_count7=st.executeUpdate("DELETE FROM activa5g where eng='"+engine+"'");
        int row_count8=st.executeUpdate("DELETE FROM apachi where eng='"+engine+"'");
        int row_count9=st.executeUpdate("DELETE FROM pep where eng='"+engine+"'");
        int row_count11=st.executeUpdate("DELETE FROM sport where eng='"+engine+"'");
                                                                  
        if(row_count>0)
         {
             
            JOptionPane.showMessageDialog(null, "Record Insert");  
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
        ct100 c=new ct100();
        c.avelable();
        
        platina o=new platina();
        o.avelable();
        
        discovery p=new discovery();
        p.avelable();
        
        DIO d=new DIO();
        d.avelable();
        
        activav5G x=new activav5G();
        x.avelable();
        
        palsar l=new palsar();
        l.avelable();
        
        HONET H=new HONET();
        H.avelable();
        
        scootyPEP q=new scootyPEP();
        q.avelable();
        
       
        tvsSports G=new tvsSports();
        G.avelable();
        
        
      try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
       
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
          }
    }//GEN-LAST:event_btnSAVEActionPerformed

    private void tctnic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctnic1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tctnic1ActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
       
      
        try
        {
           
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NIC");
        dtm.addColumn("Customer Name");
        dtm.addColumn("Bike Engine Number");
        dtm.addColumn("Bike Name");
         dtm.addColumn("Price");
          dtm.addColumn("Discount");
           dtm.addColumn("Final Bill");
        
        Statement st=dbcon.createDbConnection().createStatement();
        java.sql.ResultSet rst=st.executeQuery("select * from invoice4");
       while(rst.next())
            {
                String[] value=new String[8];
                value[0]=rst.getString(1);
                value[1]=rst.getString(2);
                value[2]=rst.getString(3);
                value[3]=rst.getString(4);
                value[4]=rst.getString(5);
                value[5]=rst.getString(6);
                value[6]=rst.getString(7);
                value[7]=rst.getString(8);
                dtm.addRow(value);
            }
         jTableINVOCE.setModel(dtm);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         
        
          String id=ID.getText();
          
      try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
        int row_count=st.executeUpdate("DELETE FROM invoice4 where ID='"+id+"'");
        
        if(row_count>0)
         {
             
            JOptionPane.showMessageDialog(null, "Record Deleted");  
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
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        // TODO add your handling code here:
        
               
          String name=txtname1.getText();
          String nic=tctnic1.getText();
          String id=ID.getText();
              
         
          String engine=txtengnum44.getText();
          String price=price0.getText();
          String rate=txtRate.getText();
          String bill=Bill.getText();
          String Bike=jComboBox1.getSelectedItem().toString();

                     
      try
        {    
        Statement st=dbcon.createDbConnection().createStatement();
        int row_count=st.executeUpdate("UPDATE invoice4 SET cusName='"+name+"',NIC='"+nic+"',engineNumber='"+engine+"',BikeName='"+Bike+"',price='"+price+"',rate='"+rate+"',finalBill='"+bill+"' where ID='"+id+"'" );
        
        if(row_count>0)
         {
             
            JOptionPane.showMessageDialog(null, "Record Update");  
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
        
        
        
    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
      
      Date obj=new Date();
      String date=obj.toString();
      reaspt.setText(reaspt.getText()+"                                       KIRULAPANAGE MOTORS             \n\n ");
      reaspt.setText(reaspt.getText()+"\n+"+date+"\n");
      reaspt.setText(reaspt.getText()+"*********************************************************************************************\n\n");
      
      reaspt.setText(reaspt.getText()+"INVOICE ID          :     "+ID.getText()+"\n\n");
       reaspt.setText(reaspt.getText()+"CUSTOME NIC        :     "+tctnic1.getText()+"\n\n");
        reaspt.setText(reaspt.getText()+"CUSTOMER NAME     :     "+txtname1.getText()+"\n\n");
         reaspt.setText(reaspt.getText()+"BIKE ENGINE NUMBER  :  "+txtengnum44.getText()+"\n\n");
          reaspt.setText(reaspt.getText()+"BIKE NAME      :     "+jComboBox1.getSelectedItem()+"\n\n");
           reaspt.setText(reaspt.getText()+"BIKE PRICE     :     "+price0.getText()+"\n\n");
            reaspt.setText(reaspt.getText()+"DISCOUNT RATE :     "+txtRate.getText()+"\n\n");
            reaspt.setText(reaspt.getText()+"FINAL BILL    :     "+Bill.getText()+"\n\n\n\n\n");
             reaspt.setText(reaspt.getText()+"                                                               CUSTOMER SIGNATURE\n\n");
              reaspt.setText(reaspt.getText()+"                THANK YOU JOIN WITH US                                                  ");
            
      
      
      
      
    }//GEN-LAST:event_btnprintActionPerformed

    private void jTableINVOCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableINVOCEMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel) jTableINVOCE.getModel();
        int selectedRowIndex= jTableINVOCE.getSelectedRow();
        
        tctnic1.setText(model.getValueAt(selectedRowIndex,1).toString());
        txtname1.setText(model.getValueAt(selectedRowIndex,2).toString());
        ID.setText(model.getValueAt(selectedRowIndex,0).toString());
        txtengnum44.setText(model.getValueAt(selectedRowIndex,3).toString());
        txtRate.setText(model.getValueAt(selectedRowIndex,6).toString());
        Bill.setText(model.getValueAt(selectedRowIndex,7).toString());
        price0.setText(model.getValueAt(selectedRowIndex,5).toString());
    }//GEN-LAST:event_jTableINVOCEMouseClicked

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
         String pric=price0.getText();
         String rate=txtRate.getText();
        double finalBILL;
        double price=Double.parseDouble(pric);
        double rat=Double.parseDouble(rate);
      
        
        double dis=price*rat/100;
        finalBILL=price-dis;
        Bill.setText(String.valueOf(finalBILL));
        
                
    }//GEN-LAST:event_btnCalActionPerformed

    private void tctnic1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctnic1KeyPressed
        // TODO add your handling code here:
        
        NICCvalidate();
        
        
    }//GEN-LAST:event_tctnic1KeyPressed
   
    
    
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
      
        
    
   
           
           
       } 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bill;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel NICvalidate;
    private javax.swing.JLabel NICvalidate1;
    private javax.swing.JLabel NICvalidate2;
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTextField btnInvoicID;
    private javax.swing.JButton btnSAVE;
    private javax.swing.JButton btnUPDATE;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnview;
    private javax.swing.JComboBox<String> cmbBike;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableINVOCE;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField price0;
    private javax.swing.JTextArea reaspt;
    private javax.swing.JTextField tctnic;
    private javax.swing.JTextField tctnic1;
    private javax.swing.JTextField txtDiscountRate;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtengnum4;
    public javax.swing.JTextField txtengnum44;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
