/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franco
 */
public class teoria {
     public static void main(String[]args){
        //PRIMER EJEMPLO HECHO CON UNA CLASE EXTENDIDA DE HILO, NO ES LO RECOMENDABLE
        //PRIMERO LO INSTANCIO 
        HiloUnoPrueba c= new HiloUnoPrueba();
        //CON RUN INDICO QUE EL HILO ESTA LISTO PARA LANCAZARSE
       
        
        //PUEDO VER EL ESTADO
        System.out.println(c.getState());
        
        //SEGUNDO EJEMPLO HECHO CON EXTENDS RUNABLE, LO RECOMENDABLE PARA TRABAJAR CON HILOS
        
        //C ES UN HILO QUE ESTA ASOCIADO CON HILODOSPRUEBA, SIENDO HILODOSPRUEBA UNA IMPLEMENTACION DE RUNNABLE
        Thread d = new Thread(new HiloDosPrueba());
        
        //LUEGO DE 3 INTENTOS POR MAS QUE D ESTE INICADO ANTES DE C, EN EL OUTPUT VEO PRIMERO C
        d.start();
         c.start();
        
        //UN HILO HEREDADO DE THREAD TIENE EL METODO .ISINTERRUMPED
        //Este metodo puede ser redefinido en la clase HiloUnoPrueba, para dar el mesaje que querramos
        c.isInterrupted();
        
        try {
            //Metodo que manda a dormir un hilo y puede arrojar una interrumped exception
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            /*
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        */}
        c.interrupt();
        //IsInterrupted solo consulta si el hilo esta interrumpido, en cambio Interrupt interrumpe el hilo
            //Interrupted limpia el estado booleano, por lo tanto si se pone en true luego de mostrarlo volvera a ser false y repetir el ciclo
       
            try {
            
            
            //El hilo del join se ejecuta en su totalidad y el main o lugar desde donde fue invocado, se quedara 
            //a la espera de la terminacion, para seguir ejecutando
            //Tambien puede arrojar una excepcion, por ende manejar con try/catch
            c.join();
        } catch (InterruptedException ex) {
            /*
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            */
        }
        
          //Si el codigo del hilo llamado a join es demasiado extenso o lento, podre utilizar
          //un join que tenga un tiempo de espera, de modo que si no termina en ese tiempo 
          //volvera a la ejecucion de las sigueintes lineales
          
          
          //En este ejemplo utilizo un bucle while que mientras el hilo siga vivo pero pase el tiempo
          // de espera, enviara un mensaje que aun no a terminado, hasta que el hilo este muerto/termine
          while(c.isAlive()){
              System.out.println("Todavia no he terminado ");
              /*
              c.join(1000);
              */
              //Estas 2 lineales le asigna a status si en el tiempo dado para el join pudo concluir el hilo
             /*
              boolean status = c.join(Duration.ofSeconds(10));
              
              System.out.println(status);
              */
        }
           //PROBLEMAS DE MEMORIA
           //Puede exisitir Corrupcion de memoria, debido a que el acceso a un hilo y una tarea puede ser interrumpido
          //Por otro y no llegar a completarse
          //Sucede cuando tengo una variable compartida, que varios hilos la quieren utilizar
        
           //IMPORTANTE CONTROL DE CONCURRENCIA
           //Para resolver esto utilizo synchronized
           //Este ejemplo es un metodo que sea concurrido por varios hilos pero de forma sincronizada,
           // con el synchornized me aseguro Que sea concurrido 1 hilo a la vez, y que al terminar ingrese otro de manera automatica
         /*
           public synchronized void ping(){
         */   
           }
           //Siempre devuelvo algo ,para que el hilo salgo, sino se quedara permanentemente en el metodo
           // y el resto de hilos no ingresaran nunca
     
     
           //Tambien puedo indicar regiones de codigo que sean sincronizados
           //BLOQUE SINCRONIZADO
           //LOCK: MECANICOS DE CONTROL DE CONCURRENCIA QUE ASEGURA QUE EL ACCESO A UN RECURSO COMPARTIDO ES SEGURO 
           //MONITOR: EL METODO/CODIGO QUE DESEO QUE SE UTILIZE DE FORMA SINCRONIZADA
            //CADA INSTANCIA DE LA CLASE TENDRA SU PROPIO MONITOR POR LO TANTO SIEMPRE QUE QUIERO
            //QUE VARIOS HILOS ACTUEN EN EL MISMO MONITOR, DEBO REFERENCIARLO DE MANERA CORRECTA (NO SIEMPRE THIS)
     
           //LA VENTAJA DEL BLOQUE, ES QUE DENTRO DEL METODO PUEDO TENER COSAS SINCRONIZADAS Y OTRAS QUE NO 
            /*
            synchronized(//Identificador del objeto que queremos usar como MONITOR){
                   //..LINEAS DE CODIGO QUE SE EJECUTARAN DE FORMA SINCRONIZADA
              */      
              
              //IMPORTANTE /CASOS DE DEADLOCK/
     
              //SUCEDE CUANDO EXISTE MENOS RECURSOS DE LA CANTIDAD DE HILOS DISPONIBLES
              //DE MODO QUE UN HILO NECESITA DE 2 RECURSOS PARA FUNCIONAR, PERO SI CADA HILO AGARRA UN RECURSOS
              //EL PROGRAMA SE COLGARA YA QUE LOS HILOS AGARRARON 1 SOLO RECURSOS Y NUNCA PODRAN FUNCIONAR NI DEJAR 
              //DE USARLO
     
              //PARA ESTO PUEDO HACER QUE LOS TIEMPOS DEL .SLEEP SEAN UN RANDOM ENTRE VALORES UN POCO DISTANTAS
              //DE MODO QUE PUEDE NO COLGARSE, PERO EN CIERTO MOMENTO DE IGUAL MANERA PODRA HACERLO
     
        }
    


