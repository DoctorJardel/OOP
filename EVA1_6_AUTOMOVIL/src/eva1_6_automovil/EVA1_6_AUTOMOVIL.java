package eva1_6_automovil;



public class EVA1_6_AUTOMOVIL {

   public static void main(String[] args) {
        Carro car1 = new Carro("Ford", "Expoler", "EMN-71-71", 2000, "Jardel Contreras");
        
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.calcularAdeudo());
        
        
        
   }
    
}
