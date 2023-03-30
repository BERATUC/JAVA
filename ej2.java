/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;
import java.util.Scanner;

import java.lang.System;

/**
 * 
 
 * @author BERA
 */
public class ej2 {
    
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombre;
        System.out.print("Introduzca su nombre: ");
        nombre = lectura.nextLine(); //asigna a la variable nombre el Nombre introducido por teclado  

        System.out.println(nombre);
        
        
        System.out.println(nombre.toUpperCase());     
        limp();
        
        
        
    }
    public static void limp(String[] args) {
        // Limpiar la consola
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
