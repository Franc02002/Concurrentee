/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class HiloSumador extends Thread{
    
    private int[] num;
    private int principio;
    private int fin;
    private int sumaParcial;
    
    
    public HiloSumador(int prin, int fi,int[] n){
        this.num=n;
        this.principio=prin;
        this.fin=fi;
        this.sumaParcial=0;
    }

   
    public void run() {
        int suma=0;
        for (int i = principio-1; i < fin; i++) {
            suma+= num[i];
        }
        
        this.sumaParcial= suma;
    }
    public int getSumaParcial(){
        return sumaParcial;
    }
   
    
}
