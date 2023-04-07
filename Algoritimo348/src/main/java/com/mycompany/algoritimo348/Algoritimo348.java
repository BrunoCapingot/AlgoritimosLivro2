/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo348;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo348 {

    public static void main(String[] args) {
        int L = 0;
        
        String nome[] = new String[5];
        float prl[]= new float[5];
        float pr2[]= new float[5];
        float media[] = new float[5];
        
        for(L=0; L<=4; L++){
            nome[L] = JOptionPane.showInputDialog(null,"Digite uma frase");
            prl[L] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite 1° Nota"));
            pr2[L] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite 2° Nota"));
            media[L] = (prl[L] + pr2[L])/2; 
            
        }
            for( L = 0; L <= 4 ; L++){
                JOptionPane.showMessageDialog(null,"" +L+ "- "+ nome[L] );
                JOptionPane.showMessageDialog(null,""+ prl+ "\t"+ pr2 +"- "+ media[L] );
            }
    }
}
