/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author BELAL WAEL
 */
public class deposit extends javax.swing.JFrame {

    /**
     * Creates new form deposit
     */
    public deposit() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        edt_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(0, 51, 102));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Enter Number For Deposit");

        jButton53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton53.setForeground(new java.awt.Color(0, 51, 102));
        jButton53.setText("1");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton54.setForeground(new java.awt.Color(0, 51, 102));
        jButton54.setText("7");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton55.setForeground(new java.awt.Color(0, 51, 102));
        jButton55.setText("4");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton56.setForeground(new java.awt.Color(0, 51, 102));
        jButton56.setText("5");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton57.setForeground(new java.awt.Color(0, 51, 102));
        jButton57.setText("2");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton58.setForeground(new java.awt.Color(0, 51, 102));
        jButton58.setText("3");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton59.setForeground(new java.awt.Color(0, 51, 102));
        jButton59.setText("6");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton60.setForeground(new java.awt.Color(0, 51, 102));
        jButton60.setText("8");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(0, 51, 102));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton62.setForeground(new java.awt.Color(0, 51, 102));
        jButton62.setText("9");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numbers(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(255, 204, 51));
        jButton63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("Clear");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(255, 0, 51));
        jButton64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("Cancel");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(51, 255, 0));
        jButton65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("Enter");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton55)
                        .addGap(20, 20, 20)
                        .addComponent(jButton56)
                        .addGap(20, 20, 20)
                        .addComponent(jButton59)
                        .addGap(20, 20, 20)
                        .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_0)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton54)
                                .addGap(20, 20, 20)
                                .addComponent(jButton60)))
                        .addGap(20, 20, 20)
                        .addComponent(jButton62)
                        .addGap(18, 18, 18)
                        .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edt_text, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jButton53)
                            .addGap(20, 20, 20)
                            .addComponent(jButton57)
                            .addGap(20, 20, 20)
                            .addComponent(jButton58)
                            .addGap(20, 20, 20)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton53)
                    .addComponent(jButton57)
                    .addComponent(jButton58)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton59)
                    .addComponent(jButton56)
                    .addComponent(jButton55)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton54)
                    .addComponent(jButton60)
                    .addComponent(jButton62)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_0)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
    
//
//            String pass_client="";
//            
//            PreparedStatement getPass = con.prepareStatement("select pass from password where id = ?");
//            getPass.setInt(1, 1);
//                ResultSet rsPass = getPass.executeQuery();
//                
//            
//                while(rsPass.next()){
//                    pass_client=rsPass.getString(1);
////                JOptionPane.showMessageDialog(this, rs.getString(5));
//// System.out.println(pass_client);
//                }           
//            
//            
//            
//            
//            
//            
//          String sal="0";
//            PreparedStatement stmt = con.prepareStatement("select salary from client where client_pass = ?");
//            stmt.setString(1, pass_client);
//                ResultSet rs = stmt.executeQuery();
//                 System.out.println(pass_client);
//                while(rs.next()){
//                   sal=rs.getString(1);
//                
//                }   
//                 Integer val=Integer.valueOf( edt_text.getText());
//                Integer salInt =Integer.valueOf(sal);
//                Integer newSal=0;
//                if(val < salInt )
//                {
//               
//                     newSal=salInt-val;
//                    JOptionPane.showMessageDialog(null, "sucssefly your new balance "+newSal);
//                }
//                    else
//                    JOptionPane.showMessageDialog(null, "balance not enough\n");
//                
//                
//                
//                
//                //update 
//                PreparedStatement update_pass = con.prepareStatement("update client set salary=? where client_pass=?;");
//                update_pass.setString(1, String.valueOf(newSal));
//                update_pass.setString(2, pass_client);
//                update_pass.executeUpdate();
//                
                        // TODO add your handling code here:
        new operation().setVisible(true);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        new operation().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton64ActionPerformed

    private void btn_numbers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numbers
        // TODO add your handling code here:
         switch (evt.getActionCommand()) {
            case "0":
                if (edt_text.getText().length() > 0) {
                    edt_text.setText(edt_text.getText() + "0");
                }
                break;
            case "1":
                edt_text.setText(edt_text.getText() + "1");
                break;
            case "2":
                edt_text.setText(edt_text.getText() + "2");
                break;
            case "3":
                edt_text.setText(edt_text.getText() + "3");
                break;
            case "4":
                edt_text.setText(edt_text.getText() + "4");
                break;
            case "5":
                edt_text.setText(edt_text.getText() + "5");
                break;
            case "6":
                edt_text.setText(edt_text.getText() + "6");
                break;
            case "7":
                edt_text.setText(edt_text.getText() + "7");
                break;
            case "8":
                edt_text.setText(edt_text.getText() + "8");
                break;
            case "9":
                edt_text.setText(edt_text.getText() + "9");
                break;

        }
    }//GEN-LAST:event_btn_numbers

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        edt_text.setText("");
    }//GEN-LAST:event_jButton63ActionPerformed

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JTextField edt_text;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
