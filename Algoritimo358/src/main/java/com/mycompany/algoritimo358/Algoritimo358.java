/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo358;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo358 {

    public static void main(String[] args) {
        
        
        double preCoCompra[] = new double[100];
        double preCoVenda[] = new double[100];
        double lucro;
        
        int totLucroMenor10=0;
        int totLucroMenor20=0;
        int totLucroMaior20=0;
        int A = 0;
        
        for(A=0;A<100;A++){
            lucro =  preCoVenda[A] - preCoCompra[A];
            
            if(lucro<10.0){
                totLucroMenor10++;
            }
            else{
                if(lucro<=20.0){
                totLucroMenor20++;
                }
                else{
                totLucroMaior20++;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,"\ntotal de mercadorias com lucro < 10%: "+totLucroMenor10 + 
                "\ntotal de mercadorias com 10% <= lucro <=20%:  "+totLucroMenor20 +  
                "\ntotal de mercadorias com lucro > 20%: "+totLucroMaior20 +"\n" );
        
        
    }
}
