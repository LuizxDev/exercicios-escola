package Exercicios.atvdEncapsulamento.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import Exercicios.atvdEncapsulamento.model.Carro;
import Exercicios.atvdEncapsulamento.model.Pessoa;

public class principalController {

    public void cadastroPessoa(String nome, int idade) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nome);
        pessoa.setIdade(idade);

    }

    public void cadastroCarro(String marca, String modelo, int ano) {
        Carro carro = new Carro();

        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setAno(ano);
    }

    public String dataRegistro(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String data = format.format(new Date());
        return data;
    }

}
