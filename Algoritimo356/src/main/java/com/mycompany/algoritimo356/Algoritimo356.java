/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo356;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo356 {

    public static void main(String[] args) {
        
        
        int L,c,t;
        int media[] = new int[15];
        
        String nomes[] = new String[15];
        String sit[] = new String[15];
        String input;
        float prl[] = new float[15];
        float pr2[] = new float[15];
        double value;
        
        for (L=0;L<=14;L++){
            nomes[L] = JOptionPane.showInputDialog(null,"\nNomes com ate 30 caracteres \n \n Digite "+L+1+"nome: ");
        }
        
        t = nomes.length;
        for (c=1;c<=t;c++)
        {nomes[L] = nomes[L] + " ";}
        
        input = JOptionPane.showInputDialog(null,"Insira primeira nota");
        prl[L] = Float.parseFloat(input);
        input = JOptionPane.showInputDialog(null,"Insira segunda nota");
        pr2[L] = Float.parseFloat(input);
        
        value = (prl[L]+pr2[L])/2+0.0001;
        media[L]=(int)value;
        
        if (media[L] >=5){
        sit[L] = "Ap";
        }
        else{
        sit[L] = "RP";
        }
        
        JOptionPane.showMessageDialog(null,"\n\n\n\t\t\t Relação Final\n");
        for (L=0;L<=14;L++){
        
        JOptionPane.showMessageDialog(null,"\n"+L+1+"- "+nomes[L]+",\t"+prl[L]+",\t"+pr2[L]+",\t"+media[L]+",\t"+sit[L]+"\n");
        
        
        }
        
        
        
    }
}
