/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelos.*;

/**
 *
 * @author Bruno
 */
public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        getContentPane().setBackground(new java.awt.Color(32, 28, 36));

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prdNome = new javax.swing.JTextField();
        prdPreco = new javax.swing.JTextField();
        prdQuantidade = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Item ao Estoque");
        setBackground(new java.awt.Color(32, 28, 36));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prdNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prdNome.setForeground(new java.awt.Color(51, 51, 51));
        prdNome.setToolTipText("");
        prdNome.setOpaque(false);
        prdNome.setBorder(null);
        prdNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdNome.setBackground(new java.awt.Color(0,0,0,1));
        prdNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prdNomeKeyPressed(evt);
            }
        });
        getContentPane().add(prdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 97, 280, 30));

        prdPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prdPreco.setForeground(new java.awt.Color(51, 51, 51));
        prdPreco.setToolTipText("");
        prdPreco.setBorder(null);
        prdPreco.setOpaque(false);
        prdPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdPreco.setBackground(new java.awt.Color(0,0,0,1));
        prdPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prdPrecoKeyPressed(evt);
            }
        });
        getContentPane().add(prdPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 220, 30));

        prdQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prdQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        prdQuantidade.setToolTipText("");
        prdQuantidade.setBorder(null);
        prdQuantidade.setOpaque(false);
        prdQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdQuantidade.setBackground(new java.awt.Color(0,0,0,1));
        prdQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prdQuantidadeKeyPressed(evt);
            }
        });
        getContentPane().add(prdQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 280, -1));

        salvarBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\Salvar-button.png")); // NOI18N
        salvarBtn.setContentAreaFilled(false);
        salvarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salvarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 60));

        fundo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\telinha.png")); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -50, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        // TODO add your handling code here:
        CRUD oi;
        try {
            oi = new CRUD();
            Produto produto = new Produto(prdNome.getText(),prdPreco.getText(), prdQuantidade.getText());
            oi.add(produto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algum erro ocorreu!", "Erro ao adicionar item.", HEIGHT);

        }
        dispose();
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void prdQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prdQuantidadeKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);
    }//GEN-LAST:event_prdQuantidadeKeyPressed

    private void prdPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prdPrecoKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);
    }//GEN-LAST:event_prdPrecoKeyPressed

    private void prdNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prdNomeKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);
    }//GEN-LAST:event_prdNomeKeyPressed

    private void enterPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            salvarBtnActionPerformed(null);
        }
    }

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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JTextField prdNome;
    private javax.swing.JTextField prdPreco;
    private javax.swing.JTextField prdQuantidade;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
