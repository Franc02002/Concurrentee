/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1Concurrente;

/**
 *
 * @author Franco
 */
public class Cajero {

    private String nombre;
// Agregar Constructor, y métodos de acceso
    
    Cajero(String n){
        nombre=n;
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        int acum =0; 
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000
                + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            int tie  = this.esperarXSegundos(i);
            
                   acum+= this.esperarXSegundos(i);
            System.out.println("Procesado el producto " + (i + 1)
                    + "->Tiempo: " + tie + "seg");
        }
        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: "
                + acum + "seg");
    }
    
    public  int esperarXSegundos(int i){
        int valor=0;
        if(i==0 ){
            valor= 1;
        }else{
            valor = (2* i) + 1;
        }
        return valor;
    }
}


