/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo351;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo351 {

    public static void main(String[] args) {
        
        int L, num;
        
        String input;
        String nomes[] = new String[5];
        
        for (L=0;L<=4;L++){
        
            JOptionPane.showMessageDialog(null,"Nome "+ L+1 +":" + nomes[L]);
            
            input = JOptionPane.showInputDialog(null,"Digite o numero da pessoa");
            num = Integer.parseInt(input);
            
            while(num < 1 || num > 5){
            input = JOptionPane.showInputDialog(null, "Numero fora do intervalor"+"\nDigite o numero da pessoa");
            num = Integer.parseInt(input);
            
            
            JOptionPane.showMessageDialog(null,"\n"+nomes[num-1]+"\n");
            
            
            
            }
            
        
        }
        
        
        
    }
    
}
