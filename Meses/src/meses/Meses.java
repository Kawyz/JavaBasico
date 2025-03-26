/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meses;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author kakaw
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.println("Em que ano estamos");
        int anoAtual = tec.nextInt();
                
        if (Year.of(anoAtual).isLeap()){
            System.out.println("E bissexto");
            tot[1] = 29;
        } else {
            System.out.println("O ano nao e bissexto");
        }
        
        for (int i = 0; i < mes.length; i++){
            System.out.println(mes[i] + " tem " + tot[i] + " dias ao todo");
        }
    }
    
}
