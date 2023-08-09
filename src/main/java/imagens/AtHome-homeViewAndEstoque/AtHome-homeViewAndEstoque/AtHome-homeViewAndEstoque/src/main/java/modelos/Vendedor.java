/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Bruno
 */
public class Vendedor {

    private String nome, cpf, usuario, email, senha;

       public Vendedor(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
      
        public Vendedor(String usuario) {
        this.usuario = usuario;
    }
       
    public Vendedor(String nome,String cpf, String usuario, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
