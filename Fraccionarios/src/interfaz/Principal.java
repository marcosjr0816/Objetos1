/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Sarmientos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdConvertirMixto.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtDen1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtNum2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDen2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEntero = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDen3 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdConvertirMixto = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Operaciones con Fraccionarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        txtNum1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, -1));

        txtDen1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtDen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 10));

        cmbOperacion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        cmbOperacion.setForeground(new java.awt.Color(255, 0, 51));
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "−", "×", "÷" }));
        getContentPane().add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        txtNum2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 60, 10));

        txtDen2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtDen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("  =");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 20, 20));

        txtEntero.setEditable(false);
        getContentPane().add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 40, 30));

        txtNum3.setEditable(false);
        txtNum3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 60, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 60, 10));

        txtDen3.setEditable(false);
        txtDen3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        getContentPane().add(txtDen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 60, -1));

        cmdCalcular.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        cmdConvertirMixto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdConvertirMixto.setText("Convertir a mixto");
        cmdConvertirMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirMixtoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdConvertirMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        cmdLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, nume1, nume2, deno1, deno2;
        Fraccionario f1, f2, f3 = null;
        int sw = 1;
        txtNum3.setText("");
        txtDen3.setText("");
        txtEntero.setText("");
        if (txtNum1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite numerador de la fracción número 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNum1.requestFocusInWindow();
        } else if (txtDen1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite denominador de la fracción número 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDen1.requestFocusInWindow();
        } else if (txtNum2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite numerador de la fracción número 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNum2.requestFocusInWindow();
        } else if (txtDen2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite denominador de la fracción número 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDen2.requestFocusInWindow();
        } else {
            try {
                nume1 = Integer.parseInt(txtNum1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El numerador de la fracción número 1 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNum1.requestFocusInWindow();
                txtNum1.selectAll();
                sw = 0;
            }
            try {
                deno1 = Integer.parseInt(txtDen1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El denominador de la fracción número 1 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDen1.requestFocusInWindow();
                txtDen1.selectAll();
                sw = 0;
            }
            try {
                nume2 = Integer.parseInt(txtNum2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El numerador de la fracción número 2 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNum2.requestFocusInWindow();
                txtNum2.selectAll();
                sw = 0;
            }
            try {
                deno2 = Integer.parseInt(txtDen2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El denominador de la fracción número 2 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDen2.requestFocusInWindow();
                txtDen2.selectAll();
                sw = 0;
            }
            if (sw == 1) {
                op = cmbOperacion.getSelectedIndex();
                nume1 = Integer.parseInt(txtNum1.getText());
                deno1 = Integer.parseInt(txtDen1.getText());
                nume2 = Integer.parseInt(txtNum2.getText());
                deno2 = Integer.parseInt(txtDen2.getText());
                try {
                    f1 = new Fraccionario(nume1, deno1);
                    f2 = new Fraccionario(nume2, deno2);

                    switch (op) {
                        case 0:
                        f3 = f1.sumar(f2);
                        break;
                        case 1:
                        f3 = f1.restar(f2);
                        break;
                        case 2:
                        f3 = f1.multiplicar(f2);
                        break;
                        case 3:
                        f3 = f1.dividir(f2);
                        break;
                    }
                    txtNum3.setText("" + f3.getNumerador());
                    txtDen3.setText("" + f3.getDenominador());
                    cmdConvertirMixto.setEnabled(true);
                } catch (DenominadorCeroException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdConvertirMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirMixtoActionPerformed
        int ente, nume, deno, nume3, deno3;
        nume3 = Integer.parseInt(txtNum3.getText());
        deno3 = Integer.parseInt(txtDen3.getText());
        ente = nume3 / deno3;
        nume = nume3 % deno3;
        deno = deno3;
        txtEntero.setText("" + ente);
        txtNum3.setText("" + nume);
        txtDen3.setText("" + deno);
        cmdConvertirMixto.setEnabled(false);
    }//GEN-LAST:event_cmdConvertirMixtoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNum1.setText("");
        txtNum2.setText("");
        txtNum3.setText("");
        txtDen1.setText("");
        txtDen2.setText("");
        txtDen3.setText("");
        txtEntero.setText("");
        cmbOperacion.setSelectedIndex(0);
        txtNum1.requestFocusInWindow();
        cmdConvertirMixto.setEnabled(false);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertirMixto;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDen1;
    private javax.swing.JTextField txtDen2;
    private javax.swing.JTextField txtDen3;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    // End of variables declaration//GEN-END:variables
}
