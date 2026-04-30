
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alber
 */
public class Do_Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        
        int Año_act,Año_nac,Edad;
        int n=1;
        
        do {
            System.out.print("Teclee el año actual: ");
            Año_act = scanner.nextInt();
            
            System.out.print("Teclee el año de nacimiento: ");
            Año_nac = scanner.nextInt();
            
            Edad = Año_act - Año_nac;
            
            System.out.println("La edad es de: "+Edad);
            
            n = n+1;
            
        }while (n<=30);
        
        scanner.close();
    }
    
}
