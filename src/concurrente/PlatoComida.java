/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class PlatoComida {
    private int cantidad=20;
    
    public PlatoComida(){
    }
    
    public synchronized void comer() throws InterruptedException{
        if(cantidad>0){
   System.out.println(Thread.currentThread().getName() + " Esta en el plato de comida");
        System.out.println("*comiendo*");
        cantidad= cantidad-2;
        Thread.sleep(3000);
    }else{
            System.out.println("El plato ya no tiene comida");
        }
    }
}
