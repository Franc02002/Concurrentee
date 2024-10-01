/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
//EJERCICIO 1
public class MainEjercicio1 {
    
    public static void main(String[] args) {
        VerificarCuenta vc = new VerificarCuenta();
        //CADA HILO 'CLIENTE' TENDRA EL MISMO OBJETO VERIFICARCUENTA, QUE A SU VEZ, ESTE OBJETO COMPARTE EL OBJETO CUENTABANCO CON EL QUE REALIZA LAS OPERACIONES
        
        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");
        Luis.start();
        Manuel.start();
    }
    
    //SE PUSO UN synchronized EN EL METODO DE VerificarCuenta para evitar que la atomicidad se pierda al momento de realizar
    //LAS TRANSACCIONES, DE ESTA MANERA SE VULVE ATOMICO Y LAS OPERACIONES SE REALIZAN DE MANERA AISLADA A OTRAS.

    
}
