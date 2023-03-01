package eva1_18_static;
public class EVA1_18_STATIC {

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("pi "+ Math.PI);
        System.out.println(Math.round(Math.random()*70));
    }
    
}
class Prueba{
    public void mensaje(){
        System.out.println(":)");
    }
    public static void mensajeEstatico(){
        System.out.println("Estatico");
    }
}
class siguiente{
}