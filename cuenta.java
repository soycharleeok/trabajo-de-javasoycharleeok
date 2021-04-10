
package java1bank;


public class cuenta {
    
     final String titular ;
    private double importe ;
    
    
    public cuenta (String Titular, double Importe ){
    
      this.titular = Titular ;
        
        this.importe = Importe ;
    }
     public void ingresar(double Importe){
     if(Importe>0){
      this.importe += Importe ;
      
     }
     }
     public void retirar(double Importe){
     if(this.importe - Importe<0) {
     this.importe=0;
     } else {
     this.importe -= Importe ;
     }
     }
     
    @Override
     public String toString (){
     
       return "El titular " +titular + "tiene un saldo de : " + importe ;
        
}
}