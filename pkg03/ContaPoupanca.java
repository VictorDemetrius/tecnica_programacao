package exercicios14.pkg03;
//@author Victor D. Marqueto
import javax.swing.JOptionPane;
public class ContaPoupanca {
        String agencia;
        String numero;
        float saldo;
        float taxa;
        
        
        public ContaPoupanca(){}
        public ContaPoupanca(String agencia, String numero, float saldo, float taxa){
            
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = saldo;
            this.taxa = taxa;
            
            

}
        void imprimeDados(){
            JOptionPane.showMessageDialog(null,"Dados da Conta Corrente: "+
                    "\nAgência: "+agencia+
                    "\nNúmero: "+numero+
                    "\nSaldo: "+saldo+
                    "\nTaxa: "+taxa);
        
        }
        
        void depositar(float valor){
            saldo = saldo+valor;
        
        }
        
        float calcularRendimento(){
            float rendimento;
            rendimento = saldo *taxa/100;
            return rendimento;
        
        }
}
