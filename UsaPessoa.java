
package exercicios;

// @author Victor Demetrius

public class UsaPessoa {
    
    public static void main (String[] args){
    
        Pessoa p = new Pessoa("João", 54, 18000);
            System.out.println("Nome:"+p.nome);
            System.out.println("idade:"+p.idade);
            System.out.println("renda:"+p.renda);
            
        Pessoa p1 = new Pessoa();
            System.out.println("Nome: "+p1.nome);
            System.out.println("idade: "+p1.idade);
            System.out.println("renda: "+p1.renda);
            
    
    }
}
