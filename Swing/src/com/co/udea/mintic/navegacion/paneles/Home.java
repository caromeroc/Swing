/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.co.udea.mintic.navegacion.paneles;

/**
 *
 * @author CarlosRomero
 */
public class Home extends javax.swing.JFrame {

    Reto1 pnlReto1 = new Reto1();
    Figura pnlFigura = new Figura();
    Calculadora pnlCalc = new Calculadora();

    public Home() {
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

        pnlBotones = new javax.swing.JPanel();
        btnIraReto1 = new javax.swing.JButton();
        btnIraFigura = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));

        btnIraReto1.setText("Reto 1");
        btnIraReto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIraReto1ActionPerformed(evt);
            }
        });

        btnIraFigura.setText("Figura");
        btnIraFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIraFiguraActionPerformed(evt);
            }
        });

        btnCalculadora.setText("Calculadora");
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnIraReto1)
                .addGap(61, 61, 61)
                .addComponent(btnIraFigura)
                .addGap(56, 56, 56)
                .addComponent(btnCalculadora)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIraReto1)
                    .addComponent(btnIraFigura)
                    .addComponent(btnCalculadora))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIraReto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIraReto1ActionPerformed

        pnlReto1.setBounds(50, 100, 500, 200);
        this.add(pnlReto1);
        pnlReto1.setVisible(Boolean.TRUE);
        pnlFigura.setVisible(Boolean.FALSE);
        pnlCalc.setVisible(Boolean.FALSE);
        this.validate();
        this.repaint();

    }//GEN-LAST:event_btnIraReto1ActionPerformed

    private void btnIraFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIraFiguraActionPerformed

        pnlFigura.setBounds(50, 100, 500, 200);
        this.add(pnlFigura);
        pnlFigura.setVisible(Boolean.TRUE);
        pnlReto1.setVisible(Boolean.FALSE);
        pnlCalc.setVisible(Boolean.FALSE);
        this.validate();
        this.repaint();
    }//GEN-LAST:event_btnIraFiguraActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed

        pnlCalc.setBounds(50, 100, 500, 500);
        this.add(pnlCalc);
        pnlCalc.setVisible(Boolean.TRUE);
        pnlReto1.setVisible(Boolean.FALSE);
        pnlFigura.setVisible(Boolean.FALSE);
        this.validate();
        this.repaint();

    }//GEN-LAST:event_btnCalculadoraActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnIraFigura;
    private javax.swing.JButton btnIraReto1;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
