/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1Concurrente;

/**
 *
 * @author Franco
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;

    
    Cliente(String nombre, int[]carroComp){
        this.nombre=nombre;
        carroCompra= carroComp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
    
    
}
