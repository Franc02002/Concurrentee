/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3Concurrente;

import java.util.logging.Level;

/**
 *
 * @author Franco
 */
public class criaturaOscura implements Runnable {
    
    private Energia ener= new Energia();
    
    public criaturaOscura(Energia en){
        ener= en;
    }

    @Override
    public void run() {
        while(ener.getEnergia()>0){
            try {
                ener.sacaEnergiaa();
                Thread.sleep(500);
                if(ener.getEnergia()<1){
                    System.out.println("La energia ha desaparecido");
                }

                
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
