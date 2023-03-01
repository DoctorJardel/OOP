package eva1_6_automovil;


public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int año;
    private String dueño_s;
    
    //Constructores
    public Carro(){
        
    }
    public Carro(String brand, String model, String plates, int year, String owner){
        marca = brand;
        modelo = model;
        placa = plates;
        año = year;
        dueño_s = owner;
    }
    
    
    //Metodos
    
        //SETS
    public void setBrand(String valor){
        marca = valor;
    }
    public void setModel(String model){
        modelo = model;
    }
    public void setPlates(String valor){
        placa = valor;
    }
    public void setBrand(int valor){
        año = valor;
    }
    public void setOwner(String valor){
        dueño_s = valor;
    }
    
        //GETS
    public String getBrand(){
        return marca;
    }
    public String getModel(){
        return marca;
    }
    public String getPlates(){
        return marca;
    }
    public int getYear(){
        return año;
    }
    public String getOwner(){
        return dueño_s;
    }
    
    
    public int calcularAdeudo(){
        int adeudo = 0;
        if(año <= 2000)
            adeudo = 1500;
        else if(año >=2001 && año <=2005)
            adeudo = 2000;
        else if(año >=2006 && año <=2010)
            adeudo = 2500;
        else if(año >=2011 && año <=2015)
            adeudo = 3000;
        else
            adeudo = 4000;
        
        
        return adeudo;
    }
}
