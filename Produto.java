package exercicios;

// @author Victor D. Marqueto

public class Produto {
    
    String marca,fabricante,cod_barras;
    float preco;
    
    
    
    public Produto(){
            
System.out.print("Objeto construido \n");

  }
    
   public Produto(String m, String f, String c, float p){
       
       marca = m;
       fabricante = f;
       cod_barras = c;
       preco = p;
       
   }
}
