/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kamy2Múltiplo de 100.
Diseñar un programa que tome como entrada un número entero y diga si es múltiplo de 100 o no.
• Descripción de entrada: Un número entero.
• Descripción de salida: multiple of 100 o not multiple of 100, según sea el caso.
• Ejemplo de entrada:
12600
• Ejemplo de salida:
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a;
     
     a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
     if(a/100 == 0 ){
         JOptionPane.showMessageDialog(null,"El numero " + a + "es multiplo de 100");
     }
     else{
                  JOptionPane.showMessageDialog(null,"El numero " + a + " NO es multiplo de 100");

     }
    }
    
}
