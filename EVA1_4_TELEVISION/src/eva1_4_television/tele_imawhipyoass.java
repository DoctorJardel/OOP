
package eva1_4_television;


public class tele_imawhipyoass {
    //Atributos: estado
    private boolean power;
    private int volumen;
    private int canal; 
    //Metodos: comportamiento
    //El constructor inicializa, es el punto de partida de nuestros datos o estado de arranque
    //Constructor: el construcor debe de ser publico, sin valor de retorno y sin void
    //El constructor debe de llarmarse igual que la public class
    
    public tele_imawhipyoass(){//constructor default
    power = false; //apagado
    volumen = 0;
    canal = 5;

}
    //void es usar el metodo pero no te va a devolver nada a ti
            public void cambiarPower(){//escribir dentro de los parentesis es por si "cambiarpower" necesita un valor externo
                if (power == false){ //significa que inicia en apagado
                power = true;//Encendemos la TV
                    System.out.println("TELEVISIÓN ENCENDIDA");
                }else{
                    power = false;
                    System.out.println("TELEVISIÓN APAGADA");
                }
            }
            
            public void subirVolumen(){
                if(power == true){
                    if (volumen < 100){
                volumen = volumen + 1;
                System.out.println("Volumen: " + volumen);
                }
                }
                }
            public void bajarVolumen(){
                if (power == true){
                    if (volumen > 0){
                volumen = volumen - 1;
                System.out.println("Volumen: " + volumen);
                    }
            }
            
         }
            
            
            public void subircanal(){
                if(power == true){
                    if(canal < 100){
                    canal = canal + 1;
                }else{
                        canal = 0;
                    }
                    System.out.println("Canal: " + canal);
                }
                }
            
            public void bajarcanal(){
                if(power == true){
                    if(canal > 0){
                    canal = canal - 1;
                }
                    else{
                        canal = 100;
                    }
                    System.out.println("Canal: " + canal);
                }
                
            }
}


    

    
    

