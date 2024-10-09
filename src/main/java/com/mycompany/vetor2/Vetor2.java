/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor2;
import javax.swing.JOptionPane;
/**
 *
 * @author marce
 */
public class Vetor2 {

    public static void main(String[] args) {
        //criação da variavel nomes com 10 posições
        String[]nomes = new String[10];
        
        //criação variavel de controle
        int i;
        
        for(i=0;i<10;i++){
            //recebendo valores para cada variavel criada
            nomes[i]=JOptionPane.showInputDialog("digite o "+(i+1)+"nome::");
        }
        for(i=0;i<10;i++){
            //apresentanto
            System.out.println((i+1)+"nome::"+nomes[i]);
        }
        
    }
}
