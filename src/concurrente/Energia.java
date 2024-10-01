/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3Concurrente;

/**
 *
 * @author Franco
 */
public class Energia {
    private int cantidad= 10;
    
    public Energia(){
        
    }
     public synchronized void sacaEnergiaa(){
        cantidad= cantidad-3;
        System.out.println("La criatura ha drenado, la energia actual es : " + cantidad);
    }
     
      public synchronized void revitaliza(){
        cantidad= cantidad+3;
        System.out.println("El sanador ha curado, la energia actual es : " + cantidad);
    }
    
    public int getEnergia(){
        return cantidad;
    }
    
   
}
