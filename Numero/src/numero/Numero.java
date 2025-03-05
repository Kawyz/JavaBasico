/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author kakaw
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int n;
        int s = 0;
        String resp;
        
        do {
            System.out.println("Digite um numero: ");       
            n = tec.nextInt();
            s += n;
            System.out.println("Quer continuar? [s/n] ");
            resp = tec.next();
        } while (resp.equals("s"));
        
        System.out.println("A soma de todos os valores e " + s);        
    }
    
}
