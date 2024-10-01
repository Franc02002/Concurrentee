/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franco
 */
public class Auto implements Runnable{
    private String patente;
    private String modelo;
    private String marca;
    private int km;
    private Surtidor surti= new Surtidor();
    
    public Auto( String m, Surtidor s){
        marca=m;
        surti=s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*conduciendo");
            
            try {
                Thread.sleep((long) (Math.random()*10));
                surti.cargar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
