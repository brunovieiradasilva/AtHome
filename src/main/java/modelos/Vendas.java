/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Bruno
 */
import com.google.cloud.Timestamp;

public class Vendas {

    private String vendedor, produto[], valor;
    private Timestamp timestamp = null;

    public Vendas(String vendedor, String[] produtos, String valor) {

        this.vendedor = vendedor;
        this.produto = produtos;
        this.valor = valor;
    }

    public void setActualTimestamp() {
        //  Calendar calendar = Calendar.getInstance(Locale.getDefault());
        //   Date data = calendar.getTime();
        //   this.timestamp = Timestamp.of(data);
        this.timestamp = Timestamp.now();
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String[] getProduto() {
        return produto;
    }

    public void setProduto(String[] produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
