package eva1_2_clases_java;


public class Persona {
    //DATPS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    // METODOS --> COMPORTAMIENTO DE LA CLASE
    // LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    // LEER --> GET
    // ESCRIBIR --> SET
    // modificador de acceso valor de retorno nombnre del metodo (argumentos){implemenmtación}
    public String getNombre(){ //GET
        return nombre;
    }
    public void setNombre(String valor){ //SET
        nombre = valor;  
    }
    
      public String getApellidos(){ //GET
        return apellido;
    }
      
    public void setApellidos(String valor){ //GET
        apellido = valor;
    }
    
    public int getEdad(){ //GET
        return edad;
    }
    public void setEdad(int valor){ //GET
        edad = valor ;
    }
    
      public char getGenero(){ //GET
        return genero;
    }
    public void setGenero(char valor){ //GET
        genero = valor ;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellido);
                        System.out.println("Genero: " + genero );
                        System.out.println("Edad: " + edad );
                        if (genero == 'h'){
                            System.out.println("Hombre");
                        } else if (genero == 'm'){
                            System.out.println("Mujer");
                        } else if (genero == 'l'){
                            System.out.println("Lesbiana");
                        } else{
                            System.out.println("Binario");
                        }


    }
}
