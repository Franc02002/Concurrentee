/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class Surtidor {

    private int combustibleDisponible = 100;

    public synchronized void cargar() throws InterruptedException {
        if (combustibleDisponible > 0) {
            System.out.println("El surtidor dispone de " + combustibleDisponible + "Litros");
            System.out.println("El " + Thread.currentThread().getName() + " Ha parado y esta cargando combustible");
            combustibleDisponible = combustibleDisponible - 5;
            Thread.sleep(2000);
            System.out.println("El " + Thread.currentThread().getName() + "Ha salido del surtidor");
            System.out.println("----------------------------------------------------------------------------");

        } else {
            System.out.println("El surtidor no dispone de mas combustible, vuelva luego");
        }
    }

}
