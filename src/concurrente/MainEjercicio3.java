/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class MainEjercicio3 {
    
    public static void main(String[]args){
        PlatoComida plato= new PlatoComida();
        Rueda ru= new Rueda();
        Hamaca hamac= new Hamaca();
        Hamster p1= new Hamster(plato,ru,hamac);
        Hamster p2= new Hamster(plato,ru,hamac);
        Hamster p3= new Hamster(plato,ru,hamac);
        Thread h1= new Thread(p1,"mauri");
        Thread h2= new Thread(p1,"pato");
        Thread h3= new Thread(p1,"kako");
        h1.start();
        h2.start();
        h3.start();
    }
}
