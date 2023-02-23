package eva1_15_sobrecarga;

public class EVA1_15_SOBRECARGA {

    public static void main(String[] args) {
        
        /*sobre carga de metodos son metodos con el mismo nombre y con diferente firma para que puedan
        hacer algo diferente*/
        System.out.println("HELLO WORLD");
        System.out.println(100);
        System.out.println(true);
        System.out.println(args);
        
    }
    public static void Algo(){
        
    }
    public static void Algo(int x){/*está mal porque no puedes tener 2 metodos con el mismo nombre y con firma igual,
       pero al agregarle el (int x) le estas cambiando la firma y puedes tener un metodo con el mismo metodo, ya que estará
        haciendo algo diferente*/
        
        
    }
    
}
