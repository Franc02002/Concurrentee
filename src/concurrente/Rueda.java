/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class Rueda {
    
    public synchronized void Girar() throws InterruptedException{
      System.out.println(Thread.currentThread().getName() + " Ha entrado a la rueda");
        System.out.println("*girando*");
        Thread.sleep(6000);
    }
}
