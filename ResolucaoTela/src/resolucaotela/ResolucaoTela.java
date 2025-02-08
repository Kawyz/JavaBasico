/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author kakaw
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        
        GraphicsDevice resolucao = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = (int) resolucao.getDisplayMode().getWidth();
        int height = (int) resolucao.getDisplayMode().getHeight();
                
        System.out.println("A resolucao da tela e: " + width + "x" + height);
    }
    
}
