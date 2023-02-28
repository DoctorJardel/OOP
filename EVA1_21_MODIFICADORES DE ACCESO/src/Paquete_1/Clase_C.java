/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete_1;

import Paquete_2.Clase_E;

/**
 *
 * @author invitado
 */
public class Clase_C {
  public int publicC;
  int defalutC;
  private int privateC;
  
  Clase_C objt = new Clase_C();
    //objt.publicC
  //objt.defaultC
 
  
  //TODAS ESTAS ESTÁN EN EL MISMO PAQUETE "C Y D"
          
  
  //Clae del paquete 2, si puede verse porque la clase es publica, entonces puede verse el public despues de importarlo
  Clase_E obje = new Clase_E();
  //obje.publicE SI puede verse porque es un public y se importó para verse en este paquete
  //obje.defaultE NO puede verse, ni importarse ya que es una clase default y no public
  //sino es public entonces no puede verse desde un paquete que sea ajeno al suyo
  
  
   public void prueba(){
    Claseb objb = new Claseb();
    //objb.publicB Esto se puede ver ya que están en el mismo paquete, no importa si están en una clase diferente
    //mientras estén en el mismo paquete se podrá ver el public y default
    //si una clase está en otro paquete(paquete_1) y quieres ver lo de otro paquete(paquete_2) solo podrás ver el public
    //no el default, y aparte para poder ver el public tienes que importarlo en el paquete que deseas 
   }
   
   //clase_F no se podría ver en este paquete_1 porque está en el paquete_2 y es un default, no un public, por eso no se 
   //puede ver
  
}
class claseD{
  public int publicD;
  int defalutD;
  private int privateD;
}
