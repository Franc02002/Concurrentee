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
public class Sanador implements Runnable{
   
    
    private Energia ener= new Energia();
    
   public Sanador(Energia en){
       ener= en;
   }

    
    public void run() {
        while(ener.getEnergia()>0){
            try {
                ener.revitaliza();
                Thread.sleep(500);
                if(ener.getEnergia()<1){
                    System.out.println("La energia ha desaparecido");
                }

                
            } catch (InterruptedException ex) {
               
            }
        }
    }
}

