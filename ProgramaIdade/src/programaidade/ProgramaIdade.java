/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author kakaw
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Em que ano voce nasceu?");
        int nasc = tec.nextInt();
        int i = 2025 - nasc;
        System.out.println("Sua idade e " + i);
        
        if (i >= 18){
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }
    
}
