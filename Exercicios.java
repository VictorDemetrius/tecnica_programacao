package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Exercicios {
//@author: Victor D. Marqueto
    public static void main(String[] args) {
        
        String text1, text2;
        int num1, num2;
        float moeda1, moeda2;
            
        System.out.println("Entrada de dado");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        text1 = entrada.nextLine();
        System.out.println("Digite um numero inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite um valor monetário: ");
        moeda1 = entrada.nextFloat();
        
        System.out.println("Nome digitado: "+text1+". Número digitado: "+num1+". Valor digitado: "+moeda1+".");
        
        
        text2 = JOptionPane.showInputDialog("Digite um nome: ");
        
        num2 = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero inteiro: "));
        
        moeda2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor monetário: "));
        
        JOptionPane.showMessageDialog(null,"Nome digitado: "+text2+". Número digitado: "+num2+". Valor digitado: "+moeda2+"." );
        
        
        
        
        
        
    }
    
}
