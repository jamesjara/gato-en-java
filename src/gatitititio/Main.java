/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gatitititio;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */

//se agrega throws IOException
    public static void main(String[] args)throws IOException {
  
//creo la matriz de 3x3 valores de 3
int tabla[][] = new int [3][3];


//columna 0, fila 0
tabla[0][0] = 3;
//columna 0, fila 1
tabla[0][1] = 2;
//columna 0, fila 3
tabla[0][2] = 3;

//columna 1, fila 0
tabla[1][0] = 4;
//columna 1, fila 1
tabla[1][1] = 5;
//columna 1, fila 3
tabla[1][2] = 6;

//columna 1, fila 0
tabla[2][0] = 7;
//columna 1, fila 1
tabla[2][1] = 8;
//columna 1, fila 3
tabla[2][2] = 9;

//Inicia el juego
System.out.println("Inicia el Juego");

//peticion de inicio del juego
System.out.println("Yo soy MR PC MASTER....");
System.out.println("PC MASTER te reta? (SI)(NO)");

//Procedimiento para leer datos
BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in)) ;

//respuesta de la pregunta 1
String reto=Leer.readLine();

//si reto es igual a SI ignorando mayus
        if (reto.equalsIgnoreCase("si")||reto.equalsIgnoreCase("si")) {
            
       //CONTINUA EL INICIO PROGRAMA PRINCIPAL  
            
       System.out.println("Reto aceptado...");
       //informacion  del juego
       System.out.println("INFORMACION DEL JUEGO");
       System.out.println("0 = ERES TU");
       System.out.println("1 = SOY YO");
       System.out.println("Para escoger un campo, \nescribe su numero!");
       System.out.println("Estas listo amigo?!(SI)");
      //respuesta de la pregunta 2
       String listo = Leer.readLine();
      //comparacion ignorando mayus
            if ( listo.equalsIgnoreCase("si")||listo.equalsIgnoreCase("si") ) {
            //empieza el juego
             //se chequea el id de ganador mas abajo
                //winnerid = 1 , gano la pc
                //winnerid = 2, gano humano
                //winnerid = 0 nadie a ganado.
               
                //resumen:
                //1) se muestra el tablero,
                //2) se pide el numero
                //3) se comprueba fila, columna y 2 diago 
                //4) si gana pc id = 1 ,y el humano es = 2
                
                //identificador de ganador
                int winnerid = 0 ;
                
                //usuario activo
                int usuario = 2;
                
                
         
                while (winnerid == 0 ) {
                 //1) se muestra el tablero,
                for (int i=0; i < tabla.length; i++) {
                for (int j=0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]+"  ");
                }
                System.out.println("");
                }
                //fin del tablero
//si es humano se va aqui        
if (usuario == 2){
                //2) se pide el numero
                //se pide la opcion
                System.out.println("TU TURNO!");
                System.out.println("introduce el numero?");
                 //resivimos el numero
                int numero = Integer.parseInt(Leer.readLine()) ;
                //fin de la opcion
         
                //2) modificacion delos campos arrays
                if (numero == 1 ){  tabla[0][0] = 0;
                usuario =1;
                }
                else{
                if (numero == 2 ){  tabla[0][1] = 0; 
                 usuario =1;}
                 else{
                if (numero == 3 ){  tabla[0][2] = 0; 
                 usuario =1;}
                else{
                if (numero == 4 ){  tabla[1][0] = 0; 
                 usuario =1;}
                 else{
                if (numero == 5 ){  tabla[1][1] = 0; 
                 usuario =1;}
                 else{
                if (numero == 6 ){  tabla[1][2] = 0;
                 usuario =1;}
                 else{
                if (numero == 7 ){  tabla[2][0] = 0;
                 usuario =1;}
                else{
                if (numero == 8 ){  tabla[2][1] = 0; 
                 usuario =1;}
                else{
                if (numero == 9 ){  tabla[2][2] = 0;
                //CAMBIO DE TURNO
               usuario =1;}
                } } } } } } }      
                        
               } 
               }
//USUARIO MAQUINA 
if (usuario == 1){
        System.out.println("TURNO DE MR PC MASTER!");

        //IA IA IA IA
        // si el 0 esta libre lo marcas, 
        // sino saca los cuadrantes libres
        // y saca a la suerte uno de ellos y lo marca
        
                  
            //leer numeros ocupados, para sacar un limite para el numero
            //aleatorio
           
           int total = 9;
           int aleatorio= 0;
            
            //hay que sacar todos los items que tengan 0, luego restar el 
            //el numero de veces que pase eso, restarle a 9 ese numero deveces
           
           if ((tabla[0][0] != 0 )||(tabla[0][0] != 1 )){ total--;}             
           if ((tabla[0][1] != 0 )||(tabla[0][1] != 1 )){ total--;}
           if ((tabla[0][2] != 0 )||(tabla[0][1] != 1 )){ total--;}
           if ((tabla[1][0] != 0 )||(tabla[1][0] != 1 )){ total--;}
           if ((tabla[1][1] != 0 )||(tabla[1][1] != 1 )){ total--;}
           if ((tabla[1][2] != 0 )||(tabla[1][2] != 1 )){ total--;}
           if ((tabla[2][0] != 0 )||(tabla[2][0] != 1 )){ total--;}
           if ((tabla[2][1] != 0 )||(tabla[2][1] != 1 )){ total--;}
           if ((tabla[2][2] != 0 )||(tabla[2][2] != 1 )){ total--;}

           total = 8 - total;
           aleatorio = (int) (Math.random()*total+1);
        
             //turno de la pc
             //2) modificacion delos campos arrays
              // busqueda correcta.

           //aqui revisa que el numero aleatorio , nunca este ya elegido
                if (aleatorio == 1 ){ 
                if ((tabla[0][0] != 0)||(tabla[0][0] != 1) ){ 
                tabla[0][0] = 1;
                usuario =2;}     
                }
                else{
                if (aleatorio == 2 ){ 
                if ((tabla[0][1] != 0)||(tabla[0][1] != 1) ){               
                tabla[0][1] = 1; 
                usuario =2;}}
                 else{
                if (aleatorio == 3 ){ 
                if ((tabla[0][2] != 0)||(tabla[0][2] != 1) ){ 
                  tabla[0][2] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 4 ){
                if ((tabla[1][0] != 0)||(tabla[1][0] != 1) ){ 
               tabla[1][0] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 5 ){   
                 if ((tabla[1][1] != 0)||(tabla[1][1] != 1) ){               
                tabla[1][1] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 6 ){
                if ((tabla[1][2] != 0)||(tabla[1][2] != 1) ){ 
                tabla[1][2] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 7 ){
               if ((tabla[2][0] != 0)||(tabla[2][0] != 1) ){    
                tabla[2][0] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 8 ){
                if ((tabla[2][1] != 0)||(tabla[2][1] != 1) ){    
                tabla[2][1] = 1; 
                usuario =2;}}
                else{
                if (aleatorio == 9 ){
                if ((tabla[2][2] != 0)||(tabla[2][2] != 1) ){    
                tabla[2][2] = 1; 
                usuario =2;}}
                 } } } } } } } }
                        
           
        //CAMBIO DE TURNO
        System.out.println("La pc jugo en.." + aleatorio);
        usuario = 2;  
               }                
               
                
              //3) se comprueba las  las columnam,filas, y 2 diago 
              //Comprobacion de las columnas
              for ( int columna = 0; columna < 3; columna++  ){
              
              if ( (tabla[columna][0] == 0) && (tabla[columna][1] == 0) && (tabla[columna][2] == 0) ) {
              // System.out.println("iguales columnas");
              // se cambia winner id
                winnerid = 2 ;
              }
              
              if ( (tabla[columna][0] == 1) && (tabla[columna][1] == 1) && (tabla[columna][2] == 1) ) {
              //System.out.println("iguales columnas");
              // se cambia winner id
                winnerid = 1 ;
              }             
            
              }
                
              //comparo de las filas
              for ( int filas = 0; filas < 3; filas++  ){
              
              if ( (tabla[0][filas] == 0) && (tabla[1][filas] == 0) && (tabla[2][filas] == 0) ) {
             // System.out.println("iguales filas");
              // se cambia winner id
                winnerid = 2 ;
              }
              
              if ( (tabla[0][filas] == 1) && (tabla[1][filas] == 1) && (tabla[2][filas] == 1) ) {
              //System.out.println("iguales filas");
              // se cambia winner id
                winnerid = 1 ;
              }
              
              }
              
                
              //compro de diagonales
              //solo existen dos diagonales
              // se cambia winner id
             //diagonal 1
               if ( (tabla[0][0] == 0) && (tabla[1][1] == 0) && (tabla[2][2] == 0) ) {
              // System.out.println("iguales diagonales 1");
                 winnerid = 2 ;
               }
             
                //diagonal 2  
               if ( (tabla[2][0] == 0) && (tabla[1][1] == 0) && (tabla[0][2] == 0) ) {
              // System.out.println("iguales diagonales 2");
                winnerid = 2 ;
               }
       
                 if ( (tabla[0][0] == 1) && (tabla[1][1] == 1) && (tabla[2][2] == 1) ) {
             //  System.out.println("iguales diagonales 1");
                winnerid = 1 ;  }
             
                //diagonal 2  
               if ( (tabla[2][0] == 1) && (tabla[1][1] == 1) && (tabla[0][2] == 1) ) {
             // System.out.println("iguales diagonales 2");
                winnerid = 1 ;
               }
          
                
                
       
                
      
                }
              //fin del ciclo
                 
    if (winnerid == 0){
             
                }
                //Se ve el id del ganador
                switch (winnerid){
                    case 1:
                        System.out.println("**--Omitiendo Ultima Jugada--**");
                          System.out.println("***---MR MASTER GANA---***");
                          break;

                    case 2:
                          System.out.println("**--Omitiendo Ultima Jugada--**");
                          System.out.println("***---EL HUMANO GANA---***");
                          break;

                    case 0:
                          System.out.println("Hubo un error");
                          break;
                                 
                }
            }
            else
            {
             //MENSAJE Y CIERRE DEL PROGRAMA
             System.out.println("Bueno chao...");
             System.exit(0);
            }
    
               
                
            
       //FIN PROGRAMA PRINCIPAL  
        }
        else
        {
       //MENSAJE Y CIERRE DEL PROGRAMA
       System.out.println("Reto no acePtado, seguro te dio miedo");
       System.exit(0);
        }



             

        // TODO code application logic here
    
}
 }
 
 
 //create by james jara arroyo , google it
 

