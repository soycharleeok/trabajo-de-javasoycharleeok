
package java1bank;


public class Java1bank {

    
    public static void main(String[] args) {
        
        cuenta dolares = new cuenta ("carlos: ",1000);
        
        cuenta bolivares = new cuenta ("Paolita: ",500);
        
      dolares.ingresar(500);
        bolivares.ingresar(600);
    
    dolares.retirar(20);
    bolivares.retirar(60);
    System.out.println(dolares);
    System.out.println(bolivares);
         
    
    
    }
    
}
