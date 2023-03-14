package aula_03_produto;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;
public class Aula_03_Produto {

        public static void main(String[] args) {
            
            Produto prod;
            
            String marca;
            float valor, valorImpos, porcent;
            
            marca = JOptionPane.showInputDialog("Digite a marca do produto ");
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto "));
            
            prod = new Produto (marca, valor);
            
            prod.imprimeDados();
            
            porcent = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do imposto "));
            valorImpos = prod.calcularImposto(porcent);
            JOptionPane.showMessageDialog(null,"O valor de imposto a ser pago é de: "+valorImpos);
    }
    
}
