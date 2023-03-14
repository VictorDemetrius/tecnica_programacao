package exercicios14.pkg03;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;

public class Exercicios1403 {

    public static void main(String[] args) {
        ContaPoupanca cp;
        
        float valorDep, rendiment, saldo,taxa;
        String ag,num;
        
        ag = JOptionPane.showInputDialog("Digite o numero da agência sem o dígito");
        num = JOptionPane.showInputDialog("Digite o numero da Conta Corrente sem o dígito");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta corrente"));
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros mensal"));
        
        
        cp = new ContaPoupanca(ag,num,saldo,taxa);
        
        cp.imprimeDados();
        rendiment = cp.calcularRendimento();
        JOptionPane.showMessageDialog(null,"Seu rendimento é de: "+rendiment);
        valorDep = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado na conta corrente"));
        cp.depositar(valorDep);
        cp.imprimeDados();

        
        
    }
    
}
