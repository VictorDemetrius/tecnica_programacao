package aula_03_triangulo;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;

public class Aula_03_Triangulo {

    
    public static void main(String[] args) {
        Triangulo t;
        float base, alt, area;
        
        base =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        alt =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        
        t = new Triangulo(base,alt);
        area = t.calculaArea();
        t.imprimeDados();
        

        
        
        
        
        
    }
    
}
