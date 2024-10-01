/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3Concurrente;

/**
 *
 * @author Franco
 */
public class MainEjercicio2 {

    public static void main(String[] args) {
        Energia energ = new Energia();
        criaturaOscura c = new criaturaOscura(energ);
        Sanador s = new Sanador(energ);
        Thread H1 = new Thread(c, "criatura oscura");
        Thread H2 = new Thread(s, "sanador");
        H1.start();
        H2.start();
    }

}
