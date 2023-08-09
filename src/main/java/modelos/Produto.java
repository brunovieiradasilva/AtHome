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

    public static final String NA = "Selecione um produto";
    private String nome, id_produto = "";
    private double preco;
    private int quantidade;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade, String id_produto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_produto = id_produto;
    }
 public Produto(String nome, double preco, int quntidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quntidade;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quntidade) {
        this.quantidade = quntidade;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }
    
    @Override
    public String toString(){
        return nome;
    }

}
