/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class Hamaca {
    
      
    public synchronized void dormir() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " Ha entrado a la hamaca");
        System.out.println("*Durmiendo*");
        Thread.sleep(7000);
    }
}
