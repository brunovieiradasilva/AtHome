/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import connection.CRUD;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruno
 */
public class produtoTableModel extends AbstractTableModel {

    private List<Produto> dados = new ArrayList<>();
    private String[] columns = {"NOME", "ID"};

    public produtoTableModel() throws IOException {
        CRUD oi = new CRUD();

        Produto[] produtos = oi.getTodosProdutos();
        for (Produto p : produtos) {
            addRow(p);
        }

    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getName();
            case 1:
                return dados.get(rowIndex).getId_produto();
            case 2:
                return dados.get(rowIndex).getQuntidadeEstoque();
            case 3:
                return dados.get(rowIndex).getPreco();
        }
        return null;
    }

    public void addRow(Produto p) {
        this.dados.add(p);
    }

}
