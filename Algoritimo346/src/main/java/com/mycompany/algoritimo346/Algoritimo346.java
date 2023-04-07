/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo346;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo346 {

    public static void main(String[] args) {
        
        String frase,input;
        int op, x , tam;
        do{
        JOptionPane.showMessageDialog(null,"\n MENU");
        JOptionPane.showMessageDialog(null,"\n1 - Imprime o comprimento da frase ");
        JOptionPane.showMessageDialog(null,"\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
        JOptionPane.showMessageDialog(null,"\n3 - Imprime a frase espelhada");
        JOptionPane.showMessageDialog(null,"\n4 - Encerra o progama");
        
        input = JOptionPane.showInputDialog(null,"OPÇÂO: ");
        op = Integer.parseInt(input);
        
        if (op==1){
            frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
            JOptionPane.showMessageDialog(null, (frase.length()));
        }
        else {
            if(op == 2){
                frase = JOptionPane.showInputDialog(null, "Digite uma frase");
                JOptionPane.showMessageDialog(null,"Os dois primeiros caracteres: " + frase.substring(0, 1));
                JOptionPane.showMessageDialog(null,"Os dois ultimos caracteres: " + frase.substring(-2, -1));
            }
            else{
                if(op == 3){
                    frase = JOptionPane.showInputDialog("Digite uma frase");

                    for (int c = frase.length() - 1; c >= 0; c--){
                        JOptionPane.showMessageDialog(null,frase.charAt(c));
                    }
                }
                else{
                    if(op == 4){
                    JOptionPane.showMessageDialog(null, "Encerrando o Algoritimo");
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Opção indisponivel");
                    }
                }
            }
        }
        }
        while(op>=4 && op >= 0);
        
        
        
    }
}
