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

    private String vendedor, produto, valor;
    private final Timestamp timestamp = null;


    public Vendas(String vendedor, String produto, String valor) {
   
        this.vendedor = vendedor;
        this.produto = produto;
        this.valor = valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
