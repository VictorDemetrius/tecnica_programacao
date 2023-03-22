package atividade;

//@author Victor D. Marqueto

import javax.swing.JOptionPane;

public class CalculaFatura {
    
    double consumo,fatura, fornecimento,icms,cofins,pispasesp,icmscofins,icmspispases;
    
    
    
    public CalculaFatura(double consumo)
    {
        this.consumo = consumo;
    }
    
    double calFornecimento()
    {
        fornecimento = consumo  * 0.28172;
        return fornecimento;
    }
    
    double calIcms()
    {
        if(consumo <=200)
        
            icms = consumo * 0.316363;
        
        else
            icms = consumo * 0.333333;
        
        return icms;
    }
    
     double calCofins()
    {
        if(consumo <=200)
        
            cofins = consumo * 0.0614722;
        
        else
            cofins = consumo * 0.0730751;
        
        return cofins;
    }
     
     double calPispasesp()
     {
         if(consumo <=200)
        
            pispasesp = consumo  * 0.013346;
        
        else
            pispasesp = consumo * 0.0158651;
         
         return pispasesp;
     
     }
     
     double calIcmscofins()
     {
         if(consumo <=200)
        
            icmscofins = fornecimento * 0.0614722 * 0.316363;
        
        else
            icmscofins = fornecimento * 0.0730751 * 0.333333;
     
         return icmscofins;
     }
     
     double calIcmspispases()
     {
         if(consumo <=200)
        
            icmspispases = fornecimento * 0.013346 * 0.316363;
        
        else
            icmspispases = fornecimento * 0.0158651 * 0.333333;
         
         return icmspispases;
     
     }
     
     double calFatura()
     {
         fatura = fornecimento + icms + cofins + pispasesp + icmscofins + icmspispases;
         return fatura;
     }
     
     void imprimiFatura()
     {
        JOptionPane.showMessageDialog(null,"Dados da Fatura \nConsumo: "+consumo+"\nICMS: "+calIcms()+"\nCOFINS: "+calCofins()+"\nPIS/PASESP: "+calPispasesp()+"\nICMS/COFINS: "+calIcmscofins()+"\nICMS/PIS/PASESP: "+calIcmspispases()+"\nTotal da Fatura: "+calFatura());
     }
}
