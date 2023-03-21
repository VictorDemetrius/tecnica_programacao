package boletim;
//// @author Victor D. Marqueto
import javax.swing.JOptionPane;
public class TesteBoletim {

    public static void main(String[] args) {
        double nota1, nota2;
        Boletim aluno;
        
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

        aluno = new Boletim (nota1,nota2);
        aluno.imprimeBoletim();
        
    }
    
}
