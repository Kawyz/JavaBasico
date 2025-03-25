/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author kakaw
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int soma = 0;
        int totValores = 0;
        int par = 0;
        int impar = 0;
        int maiorCem = 0;
        double media;
        
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
                        
            if(n % 2 == 0 && n != 0){
               par += 1; 
            } else if (n != 0){
                impar += 1;
            }
            
            if (n > 100){
                maiorCem += 1;
            }
                    
            if (n != 0){
                totValores++;
            }
            soma += n;   
                  
        } while (n != 0);
        
        media = soma / totValores;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <br> ------------------------ <br> Somatorio vale: " + soma + 
                "<br> Total de Valores: " + totValores + 
                "<br> Total de Pares: " + par + 
                "<br> Total de Impares: " + impar +
                "<br> Acima de 100: " + maiorCem +
                "<br> Media dos valores: " + media +
                "</html>");
    }
}
