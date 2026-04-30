
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alber
 */
public class Do_AreaR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int base,altura,area;
        int n=1;
        
        do {
            System.out.print("Teclee la base del rectángulo: ");
            base = scanner.nextInt();
            
            System.out.print("Teclee la altura del rectángulo: ");
            altura = scanner.nextInt();
            
            area = base*altura;
            
            System.out.println("El area del rectángulo es: "+area);
            
            n = n+1;
            
        }while (n<=50);
        
        scanner.close();
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

