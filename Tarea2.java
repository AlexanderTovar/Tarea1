package Tareas;

import java.util.Scanner;

public class Tarea2{

  public static void main(String args[]){

   Scanner texto = new Scanner(System.in);
   String datos = "";
   
   System.out.print("Escribe de manera ordenada tu Nombre Profesion País : ");
   datos = texto.nextLine();
   
   String datosM = datos.toUpperCase();
   String cadena[] = datosM.split(" ");

   System.out.println("Nombre: " + cadena[0]);
   System.out.println("Profesión: " + cadena[1]);
   System.out.println("Pais: " + cadena[2]);

 }
}
