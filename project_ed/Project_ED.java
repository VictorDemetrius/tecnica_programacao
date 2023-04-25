package project_ed;
import javax.swing.JOptionPane;

// @author Victor D. Marqueto
 
public class Project_ED {

    public static void main(String[] args) throws Exception {
         
          Vetor vetor = new Vetor(5);
          
          try{
          vetor.adiciona("Elemento1");
          vetor.adiciona("Elemento2");
          }catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, e);
            }
          
          JOptionPane.showMessageDialog(null, vetor.toString());
          
          JOptionPane.showMessageDialog(null, vetor.busca(0));
    }
    
}
