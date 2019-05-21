/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olx;

/**
 *
 * @author fabri
 */
public class Produto {
    String nome;
    String detalhes;
    int status;
    int valor;

    public Produto(String nome, String detalhes, int status, int valor) {
        this.nome = nome;
        this.detalhes = detalhes;
        this.status = status;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int cadastroProduto() {
        
    }
    
    public int removerProduto() {
        
    }
    
    public int alterarProduto() {
        
    }
    
    public void alterarValor() {
        
    }
}
