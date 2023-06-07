package Exercicios.atvdEncapsulamento.view;

import javax.swing.JOptionPane;

import Exercicios.atvdEncapsulamento.controller.principalController;

/**
 * Descrição da classe.
 *
 * @author Luiz Felipe
 * @version 1.0
 * @since 07/06/2023
 * @see <a href="https://github.com/LuizxDev">Link dos meus repositórios</a>
 */

public class Aplicacao {

    public static void main(String[] args) {

        principalController controller = new principalController();

        String nome = JOptionPane.showInputDialog(null, "Ola, Digite seu nome");

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Idade"));

        controller.cadastroPessoa(nome, idade);

        if (idade < 18) {
            JOptionPane.showMessageDialog(null,
                    "Não é possível registrar um carro, pois você não possui idade suficiente.");
        } else {
            String marca = JOptionPane.showInputDialog(null, "Digite a marca do Carro");

            String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do Carro");

            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do Carro"));

            controller.cadastroCarro(marca, modelo, ano);

            JOptionPane.showMessageDialog(null, "Registro feito com sucesso!");

            JOptionPane.showMessageDialog(null,
                    "--Seus dados-- \nNome: " + nome.toUpperCase() + "\nIdade: " + idade
                            + "\n--Dados do Carro-- \nMarca: " + marca.toUpperCase() + "\nModelo: "
                            + modelo.toUpperCase() + "\nAno: "
                            + ano);

        }

    }

}
