package exercicios;
import javax.swing.JOptionPane;
// @author Victor D. Marqueto
 
public class Paciente {
    String nome, rg, endereco,telefone, dataNascimento,profissao;
 
public Paciente(){
            
System.out.print("Objeto construido \n");

  }

public Paciente(String n,String r,String e,String t,String d, String p){ 

        nome = n;
        rg = r;
        endereco = e;
        telefone = t;
        dataNascimento = d;
        profissao = p;
    }
}
