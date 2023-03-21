package empresa;
// @author Victor D. Marqueto
import javax.swing.JOptionPane;

public class Empresa {
    

    public static void main(String[] args) {
        
        double consumo, fatura, fornecimento,icms,cofins,pispasesp,icmscofins,icmspispases;
        
        consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu consumo anual: "));
        
        fornecimento = consumo * 0.28172;
                
        if(consumo <=200)
        {
            icms = fornecimento * 0.316363;
            cofins = fornecimento * 0.0614722;
            pispasesp = fornecimento * 0.013346;
            icmscofins = fornecimento * 0.0614722 * 0.316363;
            icmspispases = fornecimento * 0.013346 * 0.316363;
            
            fatura = fornecimento + icms + cofins + pispasesp + icmscofins + icmspispases;
            
            JOptionPane.showMessageDialog(null,"Dados da Fatura \nConsumo: "+consumo+"\nICMS: "+icms+"\nCOFINS: "+cofins+"\nPIS/PASESP: "+pispasesp+"\nICMS/COFINS: "+icmscofins+"\nICMS/PIS/PASESP: "+icmspispases+"\nTotal da Fatura: "+fatura);
        }
        else
        {
            
            icms = fornecimento * 0.333333;
            cofins = fornecimento * 0.0730751;
            pispasesp = fornecimento * 0.0158651;
            icmscofins = fornecimento * 0.0730751 * 0.333333;
            icmspispases = fornecimento * 0.0158651 * 0.333333;
            
            fatura = fornecimento + icms + cofins + pispasesp + icmscofins + icmspispases;
            
            JOptionPane.showMessageDialog(null,"Dados da Fatura \nConsumo: "+consumo+"\nICMS: "+icms+"\nCOFINS: "+cofins+"\nPIS/PASESP: "+pispasesp+"\nICMS/COFINS: "+icmscofins+"\nICMS/PIS/PASESP: "+icmspispases+"\nTotal da Fatura: "+fatura);
        
        
        }
        
        
    }
    
}
