/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelos.Produto;
import modelos.produtoTableModel;

/**
 *
 * @author Bruno
 */
public class Estoque extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public Estoque() {
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

        pesquisaFD = new javax.swing.JTextField();
        pesquisaBtn = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prdPreco = new javax.swing.JTextField();
        prdID = new javax.swing.JTextField();
        prdNome = new javax.swing.JTextField();
        prdQuantidade = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addEstoque = new javax.swing.JMenuItem();
        addItem = new javax.swing.JMenuItem();
        removeBtn = new javax.swing.JMenu();
        editBtn = new javax.swing.JMenu();
        editNome = new javax.swing.JMenuItem();
        editId = new javax.swing.JMenuItem();
        editQuanti = new javax.swing.JMenuItem();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pesquisaBox = new java.awt.Choice();
        jScrollPane2 = new javax.swing.JScrollPane();
        estoqueTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pesquisaFD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesquisaFD.setToolTipText("");
        pesquisaFD.setBorder(null);
        pesquisaFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaFDActionPerformed(evt);
            }
        });

        pesquisaBtn.setBackground(new java.awt.Color(204, 204, 255));
        pesquisaBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\search.png"));
        pesquisaBtn.setToolTipText("");
        pesquisaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pesquisaBtn.setBorderPainted(false);
        pesquisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBtnActionPerformed(evt);
            }
        });

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
        Icon ic = new ImageIcon(icon);
        jInternalFrame1.setFrameIcon(ic);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) jInternalFrame1.getUI();
        bui.setNorthPane(null);
        jInternalFrame1.setForeground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setTitle("Informações do produto");
        jInternalFrame1.setEnabled(false);
        jInternalFrame1.setFocusCycleRoot(false);
        jInternalFrame1.setFocusable(false);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().setLayout(new javax.swing.BoxLayout(jInternalFrame1.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Produto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID:");

        prdPreco.setEditable(false);
        prdPreco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        prdPreco.setText(Produto.NA);
        prdPreco.setToolTipText("");
        prdPreco.setBorder(null);
        prdPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdPreco.setOpaque(false);
        prdPreco.setBackground(new java.awt.Color(0,0,0,1));
        prdPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdPrecoActionPerformed(evt);
            }
        });

        prdID.setEditable(false);
        prdID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        prdID.setText(Produto.NA);
        prdID.setToolTipText("");
        prdID.setBorder(null);
        prdID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdID.setOpaque(false);
        prdID.setBackground(new java.awt.Color(0,0,0,1));
        prdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdIDActionPerformed(evt);
            }
        });

        prdNome.setEditable(false);
        prdNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        prdNome.setText(Produto.NA);
        prdNome.setToolTipText("");
        prdNome.setBorder(null);
        prdNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdNome.setOpaque(false);
        prdNome.setBackground(new java.awt.Color(0,0,0,1));
        prdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdNomeActionPerformed(evt);
            }
        });

        prdQuantidade.setEditable(false);
        prdQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        prdQuantidade.setText(Produto.NA);
        prdQuantidade.setToolTipText("");
        prdQuantidade.setBorder(null);
        prdQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prdQuantidade.setOpaque(false);
        prdQuantidade.setBackground(new java.awt.Color(0,0,0,1));
        prdQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdQuantidadeActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prdPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prdID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prdNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prdQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prdNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prdID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(prdQuantidade)
                        .addGap(9, 9, 9))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(jDesktopPane1);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 102));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jMenuBar1.setToolTipText("Informaçoes do produto");
        jMenuBar1.setFocusable(false);

        jMenu1.setText("adicionar");

        addEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addEstoque.setText("item ao estoque");
        addEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(addEstoque);

        addItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addItem.setText("Novo item");
        jMenu1.add(addItem);

        jMenuBar1.add(jMenu1);

        removeBtn.setText("remover");
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

        editBtn.setText("editar");
        editBtn.setToolTipText("informações do produto");
        editBtn.setEnabled(false);
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

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

        jInternalFrame1.setJMenuBar(jMenuBar1);

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("  Itens em estoque");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 51, 51)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("por:");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("igual a:");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));

        pesquisaBox.add("NOME");
        pesquisaBox.add("ID");

        produtoTableModel tableModel = null;
        try{
            new produtoTableModel();
        }catch(Exception e){

        }
        estoqueTable.setModel(tableModel);
        estoqueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estoqueTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(estoqueTable);
        if (estoqueTable.getColumnModel().getColumnCount() > 0) {
            estoqueTable.getColumnModel().getColumn(0).setResizable(false);
            estoqueTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pesquisaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(pesquisaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(pesquisaFD, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesquisaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pesquisaFD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addComponent(pesquisaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void estoqueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estoqueTableMouseClicked
        // TODO add your handling code here:
        
        prdNome.setText(estoqueTable.getModel().getValueAt(estoqueTable.getSelectedRow(),0).toString());
        prdID.setText(estoqueTable.getModel().getValueAt(estoqueTable.getSelectedRow(),1).toString());
        prdQuantidade.setText(estoqueTable.getModel().getValueAt(estoqueTable.getSelectedRow(),2).toString());
        prdPreco.setText(estoqueTable.getModel().getValueAt(estoqueTable.getSelectedRow(),3).toString());
    }//GEN-LAST:event_estoqueTableMouseClicked

    private void pesquisaFDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pesquisaFDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pesquisaFDActionPerformed

    private void estoqueListaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_estoqueListaMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_estoqueListaMouseClicked

    private void editNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editNomeActionPerformed
        limparLista(); // TODO add your handling code here:
    }// GEN-LAST:event_editNomeActionPerformed

    private void addEstoqueActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addEstoqueActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addEstoqueActionPerformed

    private void estoqueListaFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_estoqueListaFocusGained
        // TODO add your handling code here:
    }// GEN-LAST:event_estoqueListaFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_formMouseClicked

    private void jInternalFrame1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jInternalFrame1MouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_jInternalFrame1MouseClicked

    private void estoqueListaMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_estoqueListaMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_estoqueListaMouseEntered

    private void estoqueListaMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_estoqueListaMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_estoqueListaMouseExited

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_removeBtnMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_removeBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editBtnMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_editBtnMouseClicked

    private void estoqueListaValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_estoqueListaValueChanged
        // TODO add your handling code here:
    }// GEN-LAST:event_estoqueListaValueChanged

    private void prdPrecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prdPrecoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_prdPrecoActionPerformed

    private void prdIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prdIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_prdIDActionPerformed

    private void prdNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prdNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_prdNomeActionPerformed

    private void prdQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prdQuantidadeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_prdQuantidadeActionPerformed

    private void pesquisaBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pesquisaBtnActionPerformed
        // TODO add your handling code here:
        if (pesquisaBox.getSelectedItem() != null && !pesquisaFD.getText().equals("")) {
            if (pesquisaBox.getSelectedItem().equals("NOME")) {
                int i = 0;
                  while (i < estoqueTable.getModel().getRowCount()) {
                    Produto p = new Produto();
                 
                    i++;
                }
                
            } else {
                int i = 0;
                while (i < estoqueTable.getModel().getRowCount()) {
                    Produto p = new Produto();
                 
                    i++;
                }
            }
        }
    }// GEN-LAST:event_pesquisaBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        limparLista();
    }// GEN-LAST:event_removeBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        limparLista();
    }// GEN-LAST:event_editBtnActionPerformed

    private void editIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editIdActionPerformed
        limparLista(); // TODO add your handling code here:
    }// GEN-LAST:event_editIdActionPerformed

    private void editQuantiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editQuantiActionPerformed
        limparLista(); // TODO add your handling code here:
    }// GEN-LAST:event_editQuantiActionPerformed

    private void limparLista() {
        estoqueTable.clearSelection();
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addEstoque;
    private javax.swing.JMenuItem addItem;
    private javax.swing.JMenu editBtn;
    private javax.swing.JMenuItem editId;
    private javax.swing.JMenuItem editNome;
    private javax.swing.JMenuItem editQuanti;
    private javax.swing.JTable estoqueTable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
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
