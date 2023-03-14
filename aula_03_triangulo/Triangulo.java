package aula_03_triangulo;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;

public class Triangulo {
    
    float base, altura;
    
    
    public Triangulo(float b, float alt)
    {
        this.base = b;
        this.altura = alt;
        
        
        
    }
    
    float calculaArea()
    {
        float a;
        a = (base * altura)/2;
        return a;
    }
    
    void imprimeDados()
    {
        JOptionPane.showMessageDialog(null,"A área do triangulo é de: "+calculaArea());
    
    }
           
}
