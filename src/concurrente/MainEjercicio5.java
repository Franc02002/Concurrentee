/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class MainEjercicio5 {

    public static void main(String []args){
    Surtidor surt = new Surtidor();

    Auto a1 = new Auto("ferrari", surt);
    Auto a2 = new Auto("lamborgini", surt);
    Auto a3 = new Auto("fiat", surt);
    Auto a4 = new Auto("chevrolet", surt);
    Auto a5 = new Auto("jeep", surt);

    Thread h1 = new Thread(a1,"ferrari");
    Thread h2 = new Thread(a2,"lamborgini");
    Thread h3 = new Thread(a3,"fiat");
    Thread h4 = new Thread(a4,"chevrolet");
    Thread h5 = new Thread(a5,"jeep");
    
    h1.start();
    h2.start();
    h3.start();
    h4.start();
    h5.start();
    }
}
