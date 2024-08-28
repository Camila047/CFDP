package Ejercicio1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author kamy2

 */
public class NewMain {

    public static void main(String[] args) {
     Scanner ent = new Scanner (System.in);
     int a;
     
     a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
     int check = a % 2 ;

     String oddPart = "odd".repeat(check);
     String evenPart = "even".repeat(1-check);
     String result = oddPart + evenPart; 
     JOptionPane.showMessageDialog(null, "El numero es "+ result);
    /*
     THE FUNCTION REPEAT WHAT IT DOES IS TO COLLECT A STRING AND REPEAT IT.
     IN THIS CODE A STRING CALLED ODD IS CREATED AND THIS MUST BE REPEATED THE AMOUNT OF TIMES THAT GIVES AS A RESULT THE MODULE OF THE NUMBER ENTERED.
     THAT GIVES AS A RESULT THE MODULO OF THE NUMBER ENTERED, IF WE PUT THE NUMBER 13, THE MODULO 2 OF 13 IS 1
     THEREFORE ODD MUST BE REPEATED ONCE AND EVEN IS REPEATED 1 TIME MINUS 1, I.E. ZERO. 
     THEN WE ADD THE TWO STRINGS = ODD WAS REPEATED ONCE AND EVEN NONE, WHEN WE PRINT ONLY ODD COMES OUT.
     WHICH CORRESPONDS TO THE ODD NUMBERS
     */
    }
    
}
