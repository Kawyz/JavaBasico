/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author kakaw
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = tec.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = tec.nextFloat();
        System.out.format("A nota de %s e %.1f \n", nome , nota);
    }
    
}
