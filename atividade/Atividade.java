package atividade;

//@author Victor D. Marqueto

import javax.swing.JOptionPane;

public class Atividade {

    public static void main(String[] args) {
        
        CalculaFatura fatura;
        double consumo;
         
         consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu consumo anual: "));
        
         fatura = new CalculaFatura(consumo);
         
         fatura.imprimiFatura();
    }
    
    
}
