package eva1_16_sobrecarga2;
public class EVA1_16_SOBRECARGA2 {

    public static void main(String[] args) {
        
        System.out.println("Suma: "+ suma('A', 9));
        System.out.println("Suma: "+ suma(4.32442, 9.35332));
        System.out.println("Suma: "+ suma("Hola ", "Mundo"));
        suma();
    }
            //Suma (int, int)
    public static int suma(int val1, int val2){
        return val1+val2;
    }
            //Suma(double, double)
    public static double suma(double val1, double val2){
        return val1+val2;
    }
            //Suma(String, String)
    public static String suma(String val1, String val2){
        return val1+val2;
    }
                //Suma(String, String)
    public static void suma(){
        System.out.println("SUMA SIN ARGUMENTOS");
    }
}
