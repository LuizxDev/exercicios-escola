package Exercicios.atvdEncapsulamento.controller;

import Exercicios.atvdEncapsulamento.model.Carro;
import Exercicios.atvdEncapsulamento.model.Pessoa;

public class principalController {
    
    public void cadastroPessoa(String nome, int idade){

        Pessoa pessoa = new Pessoa();
        Carro carro = new Carro();

        pessoa.setNome(nome);
        pessoa.setIdade(idade);
 
    }

    public void cadastroCarro(String marca, String modelo, int ano) {
        
    }

}
