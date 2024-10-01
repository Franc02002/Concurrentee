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
public class Hamster implements Runnable {

    PlatoComida plato = new PlatoComida();
    Rueda ru= new Rueda();
    Hamaca hamac= new Hamaca();
    
    public Hamster(PlatoComida p, Rueda r, Hamaca h){
        plato=p;
        ru=r;
        hamac=h;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                plato.comer();               
            } catch (InterruptedException ex) {
                Logger.getLogger(Hamster.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ru.Girar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hamster.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hamac.dormir();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hamster.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
