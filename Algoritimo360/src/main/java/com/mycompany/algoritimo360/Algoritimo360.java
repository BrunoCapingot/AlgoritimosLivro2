/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo360;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo360 {

    public static void main(String[] args) {
        
        int utilDia[] = new int[12];
        int data,i,dia,mes;
        String signo[] = new String[12];
        String input;
        for (i=0;i<12;i++){
        
            signo[i] = JOptionPane.showInputDialog(null,"Digite um signo");
            input = JOptionPane.showInputDialog(null,"Digite o ulimo dia");
            utilDia[i] = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog(null,"Digite uma data no fomarto ddmm para continuar ou 9999 para encerrar o progama");
        data = Integer.parseInt(input);
        
        while(data != 9999){
        
            dia = data/100 ;
            mes = data%100;
            mes--;
            if(dia>utilDia[mes]){
            mes = (mes+1)%12;
            }
            
            input = JOptionPane.showInputDialog(null, "\nSigno: "+signo[mes]+"\n" + "\nDigite uma data no fomarto ddmm ou 9999 para encerrar o progama");
            
        }
        
        
    }
}
