package Exercicios.atvd;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Carro car = new Carro();
        Pessoa p1 = new Pessoa();

        p1.setNome(JOptionPane.showInputDialog("Digite seu nome"));

        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));

        if(p1.getIdade() < 18){
            JOptionPane.showMessageDialog(null, "Não é possível registrar um carro, pois você não possui idade suficiente.");
        }else{
            car.setMarca();
        }




    }

}
