/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.IOException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.Produto;

/**
 *
 * @author Bruno
 */
public class EstoqueView extends javax.swing.JFrame {

    private HomeView h;

    /**
     * Creates new form Estoque
     */
    public EstoqueView(HomeView home) {
        h = home;

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaBtn = new javax.swing.JButton();
        pesquisaBox = new java.awt.Choice();
        prdNome = new javax.swing.JTextField();
        panel = new javax.swing.JScrollPane();
        estoqueList = new javax.swing.JList<>();
        pesquisaFD = new javax.swing.JTextField();
        prdID = new javax.swing.JTextField();
        prdPreco = new javax.swing.JTextField();
        prdQuantidade = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        addBtn = new javax.swing.JMenu();
        removeBtn = new javax.swing.JMenu();
        editBtn = new javax.swing.JMenu();
        editNome = new javax.swing.JMenuItem();
        editId = new javax.swing.JMenuItem();
        editQuanti = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque - At Home");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pesquisaBtn.setBackground(new java.awt.Color(204, 204, 255,1));
        pesquisaBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\search.png"));
        pesquisaBtn.setToolTipText("");
        pesquisaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pesquisaBtn.setBorderPainted(false);
        pesquisaBtn.setContentAreaFilled(false);
        pesquisaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 100, 140, 34));

        pesquisaBox.add("NOME");
        pesquisaBox.add("ID");
        pesquisaBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pesquisaBox.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(pesquisaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 180, 34));

        prdNome.setEditable(false);
        prdNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prdNome.setForeground(new java.awt.Color(51, 51, 51));
        prdNome.setText(Produto.NA);
        prdNome.setToolTipText("");
        prdNome.setBorder(null);
        prdNome.setHorizontalAlignment(JLabel.CENTER);
        prdNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdNome.setOpaque(false);
        pesquisaFD.setBackground(new java.awt.Color(0,0,0,1));
        prdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdNomeActionPerformed(evt);
            }
        });
        getContentPane().add(prdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 230, 250, 30));

        panel.setBorder(null);
        panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        DefaultListModel<Produto> listModel = new DefaultListModel<>();
        estoqueList.setBackground(new java.awt.Color(28, 28, 36));
        estoqueList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estoqueList.setForeground(new java.awt.Color(255, 255, 255));
        estoqueList.setModel(listModel);
        CRUD oi;
        try{
            oi = new CRUD();

            for(Produto produto: oi.getTodosProdutos()){
                listModel.addElement(produto);
                System.out.println("try 2");

            }}catch(Exception e){
                System.out.println("erro excesão 2");

            }

            DefaultListCellRenderer renderer =  (DefaultListCellRenderer)estoqueList.getCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
            estoqueList.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    estoqueListMouseClicked(evt);
                }
            });
            panel.setViewportView(estoqueList);

            getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 186, 290, 490));

            pesquisaFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            pesquisaFD.setForeground(new java.awt.Color(51, 51, 51));
            pesquisaFD.setToolTipText("");
            pesquisaFD.setBorder(null);
            pesquisaFD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            pesquisaFD.setAlignmentY(JTextField.CENTER);
            pesquisaFD.setHorizontalAlignment(JLabel.CENTER);
            pesquisaFD.setOpaque(false);
            pesquisaFD.setBackground(new java.awt.Color(0,0,0,1));
            pesquisaFD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pesquisaFDActionPerformed(evt);
                }
            });
            getContentPane().add(pesquisaFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 100, 160, 30));

            prdID.setEditable(false);
            prdID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            prdID.setForeground(new java.awt.Color(51, 51, 51));
            prdID.setText(Produto.NA);
            prdID.setToolTipText("");
            prdID.setBorder(null);
            prdID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            prdID.setHorizontalAlignment(JLabel.CENTER);
            prdID.setOpaque(false);
            prdID.setBackground(new java.awt.Color(0,0,0,1));
            getContentPane().add(prdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 260, 30));

            prdPreco.setEditable(false);
            prdPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            prdPreco.setForeground(new java.awt.Color(51, 51, 51));
            prdPreco.setText(Produto.NA);
            prdPreco.setToolTipText("");
            prdPreco.setBorder(null);
            prdPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            prdPreco.setHorizontalAlignment(JLabel.CENTER);
            prdPreco.setOpaque(false);
            prdPreco.setBackground(new java.awt.Color(0,0,0,1));
            getContentPane().add(prdPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 260, 40));

            prdQuantidade.setEditable(false);
            prdQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            prdQuantidade.setForeground(new java.awt.Color(51, 51, 51));
            prdQuantidade.setText(Produto.NA);
            prdQuantidade.setToolTipText("");
            prdQuantidade.setBorder(null);
            prdQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            prdQuantidade.setHorizontalAlignment(JLabel.CENTER);
            prdQuantidade.setOpaque(false);
            prdQuantidade.setBackground(new java.awt.Color(0,0,0,1));
            getContentPane().add(prdQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 260, 30));

            fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\Estoque-page.png")); // NOI18N
            getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            jMenuBar1.setBackground(new java.awt.Color(204, 255, 102));
            jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
            jMenuBar1.setToolTipText("Informaçoes do produto");
            jMenuBar1.setFocusable(false);

            addBtn.setText("Adicionar");
            addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    addBtnMouseClicked(evt);
                }
            });
            addBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addBtnActionPerformed(evt);
                }
            });
            jMenuBar1.add(addBtn);

            removeBtn.setText("Remover");
            removeBtn.setEnabled(false);
            removeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    removeBtnMouseClicked(evt);
                }
            });
            removeBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removeBtnActionPerformed(evt);
                }
            });
            jMenuBar1.add(removeBtn);

            editBtn.setText("Editar");
            editBtn.setToolTipText("informações do produto");
            editBtn.setEnabled(false);

            editNome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            editNome.setText("Nome");
            editNome.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    editNomeActionPerformed(evt);
                }
            });
            editBtn.add(editNome);

            editId.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            editId.setText("ID");
            editId.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    editIdActionPerformed(evt);
                }
            });
            editBtn.add(editId);

            editQuanti.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            editQuanti.setText("quantidade");
            editQuanti.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    editQuantiActionPerformed(evt);
                }
            });
            editBtn.add(editQuanti);

            jMenuBar1.add(editBtn);

            setJMenuBar(jMenuBar1);

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        h.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void editQuantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editQuantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editQuantiActionPerformed

    private void editIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editIdActionPerformed

    private void editNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNomeActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeBtnActionPerformed

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBtnMouseClicked
        // TODO add your handling code here:
        if (removeBtn.isEnabled()) {
            CRUD oi;
            Object[] options = {"Confirmar", "Cancelar"};

            int i = JOptionPane.showOptionDialog(this, "Excluir item selecionado?", "Excluir Item", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            try {
                oi = new CRUD();
                if (i == 0) {

                    Produto p = estoqueList.getSelectedValue();
                    oi.delete("estoque", p.getId_produto());
                    ((DefaultListModel) estoqueList.getModel()).remove(estoqueList.getSelectedIndex());
                    limparLista();
                    JOptionPane.showMessageDialog(this, "Item deletado do estoque", "Exclusão de produto", HEIGHT);

                } else {
                    JOptionPane.showMessageDialog(this, "exclusão calcelada", "Exclusão de produto", HEIGHT);

                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro, tente novamente!", "Erro ao deletar", HEIGHT);

            }
        }
    }//GEN-LAST:event_removeBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
        ProdutoView produtoView = new ProdutoView();
        produtoView.setVisible(true);

    }//GEN-LAST:event_addBtnMouseClicked

    private void pesquisaFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaFDActionPerformed

    private void prdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prdNomeActionPerformed

    private void estoqueListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estoqueListMouseClicked
        // TODO add your handling code here:
        Produto p = estoqueList.getSelectedValue();
        prdNome.setText(p.getNome());
        prdID.setText(p.getId_produto());
        prdPreco.setText(Double.toString(p.getPreco()));
        prdQuantidade.setText(Integer.toString(p.getQuantidade()));
        removeBtn.setEnabled(true);
        editBtn.setEnabled(true);

    }//GEN-LAST:event_estoqueListMouseClicked

    private void pesquisaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBtnActionPerformed
        // TODO add your handling code here:
        CRUD oi;
        try {
            oi = new CRUD();
            DefaultListModel<Produto> model = new DefaultListModel<>();

            if (pesquisaBox.getSelectedItem() != null && !pesquisaFD.getText().toLowerCase().equals("")) {
                if (pesquisaBox.getSelectedItem().equals("NOME")) {

                    for (Produto produto : oi.getTodosProdutos(pesquisaFD.getText().toLowerCase())) {
                        model.addElement(produto);
                    }

                } else {
                  model.addElement( (Produto) oi.getPorID("produtos", pesquisaFD.getText().toLowerCase()));
                }

            }
          //  estoqueList.setModel(model);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_pesquisaBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        limparLista();
    }// GEN-LAST:event_editBtnActionPerformed

    private void limparLista() {
        estoqueList.clearSelection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addBtn;
    private javax.swing.JMenu editBtn;
    private javax.swing.JMenuItem editId;
    private javax.swing.JMenuItem editNome;
    private javax.swing.JMenuItem editQuanti;
    private javax.swing.JList<Produto> estoqueList;
    private javax.swing.JLabel fundo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane panel;
    private java.awt.Choice pesquisaBox;
    private javax.swing.JButton pesquisaBtn;
    private javax.swing.JTextField pesquisaFD;
    private javax.swing.JTextField prdID;
    private javax.swing.JTextField prdNome;
    private javax.swing.JTextField prdPreco;
    private javax.swing.JTextField prdQuantidade;
    private javax.swing.JMenu removeBtn;
    // End of variables declaration//GEN-END:variables
}
