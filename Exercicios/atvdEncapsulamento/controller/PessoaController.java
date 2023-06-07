package Exercicios.atvdEncapsulamento.controller;

import javax.swing.JOptionPane;

import Exercicios.atvdEncapsulamento.model.Pessoa;

public class PessoaController {
    
    Pessoa pessoa = new Pessoa();

    public PessoaController(String nome,int Idade){
        pessoa.setNome(nome);
        pessoa.setIdade(Idade);

    }
    
}
