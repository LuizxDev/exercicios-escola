package Exercicios.atvd;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Carro car = new Carro();
        Pessoa p1 = new Pessoa();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        p1.setNome(JOptionPane.showInputDialog("Digite seu nome"));

        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));

        if(p1.getIdade() < 18){
            JOptionPane.showMessageDialog(null, "Não é possível registrar um carro, pois você não possui idade suficiente.");
        }else{
            car.setMarca(JOptionPane.showInputDialog("Digite a marca do seu carro"));
            car.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
            car.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
        }

        JOptionPane.showMessageDialog(null, "--Seus dados-- \nNome: " + p1.getNome() + "\nIdade: " + p1.getIdade()
        + "\n--Dados do Carro-- \nMarca: " + car.getMarca() + "\nModelo: "
        + car.getModelo() + "\nAno: "
        + car.getAno() + "\nData do Registro: " + format.format(new Date()));




    }

}
