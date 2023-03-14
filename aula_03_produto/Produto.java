package aula_03_produto;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;


public class Produto {
    
    String marca;
    float valor;
    
    public Produto(String marca,float valor)
    {
        this.marca = marca;
        this.valor = valor;    
    }
    
    void imprimeDados()
    {
        
        JOptionPane.showMessageDialog(null,"Dados do Produto \nMarca: "+marca+"\nValor: "+valor);
    
    }
    
    float calcularImposto(float p)
    {
        return (valor*p)/100;
    }
    
}
