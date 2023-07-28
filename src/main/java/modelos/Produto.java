/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Bruno
 */
public class Produto {
  public static final String NA = "N/A";
    private String name, id_produto;
    private double preco;
 private int quntidadeEstoque;

  public Produto(){
      
  }
  
    public Produto(String name, double preco, int quntidadeEstoque, String id_produto) {
        this.name = name;
        this.preco = preco;
        this.quntidadeEstoque = quntidadeEstoque;
        this.id_produto = id_produto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
 

    public int getQuntidadeEstoque() {
        return quntidadeEstoque;
    }

    public void setQuntidadeEstoque(int quntidadeEstoque) {
        this.quntidadeEstoque = quntidadeEstoque;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }
  
 
}
