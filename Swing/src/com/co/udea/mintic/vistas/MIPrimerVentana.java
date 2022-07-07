package com.co.udea.mintic.vistas;

import com.co.udea.mintic.model.Reto1;
import java.awt.Color;
import java.util.Arrays;

public class MIPrimerVentana extends javax.swing.JFrame {


    public MIPrimerVentana() {
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

        lblHolaMundo = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        lblPanel = new javax.swing.JLabel();
        lblTextoReto1 = new javax.swing.JLabel();
        lblResultadoReto1 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UDEA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHolaMundo.setText("Hola Mundo!");
        lblHolaMundo.setToolTipText("Desde la GUI");
        lblHolaMundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblHolaMundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        lblPanel.setText("click me");
        lblPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(lblPanel)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPanel)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 400, 130));

        lblTextoReto1.setText("El resultado es :");
        getContentPane().add(lblTextoReto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        getContentPane().add(lblResultadoReto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 230, 20));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dato", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 470, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPanelMouseEntered
        pnlPrincipal.setBackground(Color.RED);
    }//GEN-LAST:event_lblPanelMouseEntered

    private void lblPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPanelMouseExited
        pnlPrincipal.setBackground(Color.GREEN);
    }//GEN-LAST:event_lblPanelMouseExited

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        int [] compra1 = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        
        Reto1 objReto1 = new Reto1();
       
        lblResultadoReto1.setText(Arrays.toString(objReto1.procesar(compra1)));
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        lblResultadoReto1.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(MIPrimerVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MIPrimerVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MIPrimerVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MIPrimerVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MIPrimerVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHolaMundo;
    private javax.swing.JLabel lblPanel;
    private javax.swing.JLabel lblResultadoReto1;
    private javax.swing.JLabel lblTextoReto1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}