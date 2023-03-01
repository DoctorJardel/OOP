package eva1_17_sobrecarga_areas;
public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        System.out.println("Area: "+ area(5));
        System.out.println("Area: "+ area(5, 5));
        System.out.println("Area: "+ area(5, 5, 5));
    }
    
            //Circulo(radio)
    public static double area(double radio){
        return Math.PI*radio*radio;
    }
            //Triangulo(base, altura)
    public static double area(double base, double altura){
        return (base*altura)/2.0;
    }
          //Triangulo(altura, base mayor, base menor)
    public static double area(double height, double baseMax, double baseMin){
        return height*(baseMax+baseMin)/2.0;
    }
}
