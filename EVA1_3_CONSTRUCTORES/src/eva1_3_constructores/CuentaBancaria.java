
package eva1_3_constructores;

public class CuentaBancaria {
     private double saldo;
     private String numcuenta;
     private String numCliente;
     
     //CONSTRUCTOR:
     
     // MODIFICADOR DE ACCESSO NOMBRE DE LA CLASE (ARGUMENTOS)
     
     public CuentaBancaria(){ //CONSTRUCTOR DEFAULT
         numcuenta = "null";
         saldo = 0;
         numCliente = "null";
     }
      public CuentaBancaria(String ncuenta, double cant, String ncliente){
          numcuenta=ncuenta;
          saldo = cant;
          numCliente = ncliente;
      }       
             
             
     //Métodos get y set
     public String getnocuenta(){
         return numcuenta;
     }
     
     public double getsaldo(){
         return saldo;
     }
     public String getnomCliente(){
         return numCliente;
     }
     
     public void setnocuenta(String valor){
         numcuenta = valor;
     }
     
     public void setsaldo(double valor){
         saldo = valor;
     }
     
     public void setnomCliente(String valor){
         numCliente = valor;
     }
     
}
