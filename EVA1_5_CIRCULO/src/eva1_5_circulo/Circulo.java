package eva1_5_circulo;
public class Circulo {
    //Atributos
    private double area;
    private double perimetro;
    private double radio;
    private double pi;
    //Al poner el valor manualmente de pi no tienes que importar el math
    
    //Metodos
    
    
    public Circulo(){ //Constructor
        area = 0;
        perimetro = 0;
        radio = 0;
        pi = 3.1415;
    }
    
    public Circulo(double radi){ //Constructor
        area = 0;
        perimetro = 0;
        radio = radi;
        pi = 3.1415;
    }
    
    public void setRadio(double radi){
        radio = radi;
    }
    public double CalcularArea(){
        area = pi*(radio*radio);
        return area;
    }
    public double CalcularPerimetro(){
        perimetro = pi*(2*radio);
        return perimetro;
    }
    
    public void Imprimir(){
        System.out.println("EL area del ciruclo con radio de:  "+radio+" es de: "+ area);
        
        System.out.println("EL perimetro de un circulo con un radio de: "+radio+" es  de: "+ perimetro);
    }
}
