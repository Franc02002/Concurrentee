/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

import java.util.Random;

/**
 *
 * @author Franco
 */
public class MainEjercicio6 {

    public static void main(String[] args) throws InterruptedException {
        int[] numeros = new int[50000];
        int sumaTotal=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }
        HiloSumador h1 = new HiloSumador(1, 10000, numeros);
        HiloSumador h2 = new HiloSumador(10000, 20000, numeros);
        HiloSumador h3 = new HiloSumador(20000, 30000, numeros);
        HiloSumador h4 = new HiloSumador(30000, 40000, numeros);
        HiloSumador h5 = new HiloSumador(40000, 50000, numeros);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        h1.join();
        h2.join();
        h3.join();
        h4.join();
        h5.join();
        
        
        sumaTotal= h1.getSumaParcial()+h2.getSumaParcial()+h3.getSumaParcial()+h4.getSumaParcial()+h5.getSumaParcial();
        System.out.println(sumaTotal);
    }

}
