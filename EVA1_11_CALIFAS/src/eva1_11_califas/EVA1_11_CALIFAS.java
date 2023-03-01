package eva1_11_califas;
public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
        System.out.println(transformarCalif(80));
        
    }
    public static String transformarCalif(int puntuacion){
        String a;
        if(puntuacion<0 || puntuacion>100)
            a = "Calificacion invalida";
        else if(puntuacion > 90 && puntuacion <=100)
            a = "A";
        else if(puntuacion > 80 && puntuacion <=90)
            a = "B";
        else if(puntuacion > 70 && puntuacion <=80)
            a = "C";
        else
            a = "D";
        
        return a;
    }
}
