/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1Concurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Corredor implements Runnable {

    String nombre;
    double distanciaReco;

    Corredor(String nombre) {
        this.nombre = nombre;
        distanciaReco = 0;
    }

    public void run() {

        while (distanciaReco < 101) {
            try {
                distanciaReco += (int) (Math.random() * ((10 - 1) + 1)) + 1;
                System.out.println("El corredor " + nombre + " recorrio " + distanciaReco + " pasos");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("El corredor no ha descansado el tiempo reglamentario, fue descalificado");
            }
        }
        System.out.println("El corredor " + nombre + " termino la carrera");
    }

}
