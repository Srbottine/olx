/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olx;

import java.util.Scanner;


/**
 *
 * @author fabri
 */
public class Usuário {
    String nome;
    double cpf;
    double senha;
    Scanner scan = new Scanner(System.in);

    public Usuário(String nome, double cpf, double senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(double senha) {
        this.senha = senha;
    }
    
    
    public Usuário cadastroUsuario(String name, double cpefi) {
        System.out.println("CADASTRO");
        System.out.println("");
        System.out.println("Digite o nome: ");
        name = scan.next(nome);
        System.out.println("Digite o CPF: ");
        
    }
    
    public boolean login() {
        
    }
    
    public double alterarSenha() {
        
    }
    
    public void excluirConta() {
        
    }
    
    public Produto pesquisaProduto() {
        
    }
    
    public Produto compra() {
        
    }
    
    public Produto venda() {
        
    }
}
