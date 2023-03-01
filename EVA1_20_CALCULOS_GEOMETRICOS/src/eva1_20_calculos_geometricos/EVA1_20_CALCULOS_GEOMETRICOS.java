package eva1_20_calculos_geometricos;
public class EVA1_20_CALCULOS_GEOMETRICOS {
    public static void main(String[] args) {
        final int x;
        x = 100;
        //x = 13;
        System.out.println("Area de un circulo rad 5: "
                +Geometria.circuloArea(5));
        System.out.println("Perimetro de un circulo rad = 5: "
                +Geometria.circuloPerimetro(5));
        System.out.println("Volumen de una esfera rad = 5: " +
                Geometria.esferaVolumen(5));   
    }
}
