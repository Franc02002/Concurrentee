/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrente;

/**
 *
 * @author Franco
 */
public class practica1 {
    //TP 2

    //1
    /*
    public static class Cliente extends Thread{
      public void run(){
          System.out.println("soy " + Thread.currentThread().getName());
          Recurso.uso();
          try{
              Thread.sleep(1000);
          }catch(InterruptedException e){
              
          };
      };
  }  
  
  public class Recurso{
      static void uso(){
          Thread t= Thread.currentThread();
          System.out.println("en Recurso: Soy " + t.getName());
      }
  }

    
        public static void main(String[]args){
            Cliente juan= new Cliente();
            juan.setName("Juan Lopez");
            Cliente ines= new Cliente();
            ines.setName("Ines Garcia");
            juan.start();
            ines.start();
            Recurso.uso();
        }
    }
     */
    //EN ESTE CODIGO SE OBSERVA QUE TANTO INES COMO JUAN CON HILOS CON UN COMPORTAMIENTO IDENTICO
    //TANTO INES COMO JUAN INDICAN QUE QUIEN SON Y LUEGO DE UN SLEEP DE 2 SEGUNDOS DICEN QUE RECURSOS ES
    //COMO EL PROGRAMA ES CONCURRENTE, TANTO INES COMO JUAN PODRAN TENER DIALOGOS INTERCALADOS, DE ESTA MANERA
    //EXISTEN DISTINTAS SALIDAS POR PANTALLA
    //LA LINEA DE CODIGO  Thread t= Thread.currentThread(); INDICA QUE T ES EL HILO QUE ESTA SIENDO CORRIDO
    //SE DARA POR PANTALLA EL NOMBRE DE ESTE HILO CON t.getName()
    //CON Recurso.uso() ESTAMOS INDICANDO QUE EL HILO QUE ESTA CORRIENDO ES EL HILO MAIN
    //SI SE CAMBIA EL START NO SUCEDERA NADA, YA QUE LA CPU ES LA QUE DA PRIORIDAD DE EJECUCION, ESTA EN ALEATORIA
    //2
    /*
    public static class MiEjecucion extends Thread{
        public void run(){
            ir();
        }
        public void ir(){
            hacerMas();
        }
        public void hacerMas(){
            System.out.println("En la pila");
        }
    }
    
        public static void main (String[] args){
            Thread miHilo= new MiEjecucion();
            miHilo.start();
            
            System.out.println("En el main");

        }
     */
    //LA EJECUCION DE ESTE CODIGO PRIMERO INDICARA QUE ESTA EN EL MAIN Y LUEGO DIRA EN LA PILA
    //PARA QUE EL COMPORTAMIENTO DEL CODIGO SEA DISTINTO, HABRIA QUE HACER UN JOIN DE miHilo
    /*
    
    //3
    public static class ThreadEjemplo extends Thread {

        public  ThreadEjemplo(String str) {
            super(str);
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + getName());
            }
            System.out.println("Termina thread " + getName());
        }

        public static void main(String[] args) {
            new ThreadEjemplo("Maria Jose").start();
            new ThreadEjemplo("Jose Maria").start();
            System.out.println("Termina thread main");
        }
    }
     */
    //4
    //LOS HILOS JOSE MARIA Y MARIA JOSE SE IMPRIMEN DE MANERA CONCURRENTE, NO HABIENDO UN ORDEN O PRIORIDAD
    /*
        public static class ThreadEjemplo implements Runnable {

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
            System.out.println("Termina thread " + Thread.currentThread().getName());
        }
        
        public static void main(String []args){
            ThreadEjemplo ejemplo1 = new ThreadEjemplo();
            ThreadEjemplo ejemplo2 = new ThreadEjemplo();
            
            Thread uno= new Thread(ejemplo1, "Maria Jose");
            Thread dos= new Thread(ejemplo2, "Jose Maria");
            uno.start();
            dos.start();
        }
        }
     */
    //CON LA IMPLEMENTACION RUNNABLE, IMPLEMENTO Y LUEGO EN EL MAIN CREO UN OBJECTO DE ThreadEjemplo
    //LUEGO SE LO ASIGNO AL HILO CREADO, PARA LUEGO INICIARLO
    //5
    /*
    public static class MiHilo implements Runnable {

        String nombreHilo;

        MiHilo(String nombre) {
            nombreHilo = nombre;
        }
//Punto de entrada del hilo
//Los hilos comienzan a ejecutarse aquí

        public void run() {
            System.out.println("Comenzando " + nombreHilo);
            try {
                for (int contar = 0; contar < 10; contar++) {
                    Thread.sleep(400);
                    System.out.println("En " + nombreHilo + ", el recuento " + contar);
                }
            } catch (InterruptedException exc) {
                System.out.println(nombreHilo + "Interrumpido.");
            }
            System.out.println("Terminando " + nombreHilo);
        }
    }
     
        public static void main(String[] args) {
            System.out.println("Hilo principal iniciando.");
//Primero, construye un objeto unHilo.
            MiHilo mh = new MiHilo("#1");
//Luego, construye un hilo de ese objeto.
            Thread nuevoHilo = new Thread(mh);
//Finalmente, comienza la ejecución del hilo.
            nuevoHilo.start();
        try {
            nuevoHilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CONCURRENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
            for (int i = 0; i < 50; i++) {
                System.out.print(" .");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Hilo principal interrumpido.");
            }
            System.out.println("Hilo principal finalizado.");
     */
    //SI QUITAMOS EL SLEEP EL PROGRAMA SE EJECUTARA DE CORRIDO Y DEMORARA 0 SEGUNDOS, CON EL SLEEP DEMORA 4X10
    //EL MAIN TERMINA ANTES QUE EL RUN, YA QUE EL HILO PRINCIPAL TIENE PRIORIDAD, PARA CAMBIAR ESTO, DEBERIAMOS 
    //HACER UN JOIN DEL HILO LUEGO DE INICIARLO, ASEGURANDO QUE SE EJECUTE HASTA EL FINAL PARA QUE SIGA EL HILO MAIN
    //6
    /*
            public static void main(String[]args){
                Thread[] lista= new Thread[3];
                 Corredor j0 = new Corredor("juan");
                Corredor j1 = new Corredor("juanita");
                Corredor j2 = new Corredor("juancru");
                Thread juan= new Thread(j0);
                Thread juanita= new Thread(j1);
                Thread juancru= new Thread(j2);
                lista[0]= juan;
                lista[1]= juanita;
                lista[2]= juancru;
                juan.start();
                juanita.start();
                juancru.start();
               }
     */
   


        public static void main(String[] args) {
            Cliente cliente1 = new Cliente("Cliente 1", new int[]{2,2,1,5,2,3});
            Cliente cliente2 = new Cliente("Cliente 2", new int[]{1,3,5,1,1});
            Cajero cajero1 = new Cajero("Cajero 1");
// Tiempo inicial de referencia
            long initialTime = System.currentTimeMillis();
            cajero1.procesarCompra(cliente1, initialTime);
            cajero1.procesarCompra(cliente2, initialTime);
        }
    }

