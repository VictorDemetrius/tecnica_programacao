package boletim;
//// @author Victor D. Marqueto
import javax.swing.JOptionPane;

public class Boletim {
    
    double n1,n2,media;
    
    
   public Boletim(double n1,double n2)
   {
       this.n1 = n1;
       this.n2 = n2;
   }
   
   
  void imprimeBoletim ()
    {
    
        calculaMedia();
        JOptionPane.showMessageDialog(null,"Dados do Boletim\nNota 1: "+n1+"\nNota 2: "+n2+"\nMédia: "+media+"\nConceito: "+ verificaConceito());
    }

 void calculaMedia()
    {
        media = (n1+n2)/2;
    }
 
 String verificaConceito()
    {     String conceito = "";
    
        if(media>=8)
        {
            conceito = "A";
        }
        else if(media>=6)
        {
            conceito = "B";
        }
        else if(media>=4)
        {
            conceito = "C";
        }
        else
            conceito = "D";
        
        return conceito;
 
    }
 
}
