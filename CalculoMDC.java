/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateus.calculomdc;

import java.util.Scanner;

/**
 *
 * @author Mateus Sebastião
 */
public class CalculoMDC {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a, b;
        
        // Classe Scanner, para leitura de dados do teclado:
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        a = leitura.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = leitura.nextInt();
        
        System.out.println("MDC(" + a + ", " + b + ") = " + mdc(a, b));
    }
    
    // Método estático que retorna dados do tipo inteiro:
    public static int mdc(int a, int b){
        int resto;
        
        // Algoritmo de Euclides para calcular o MDC:
        
        // Estrutura de decisão:
        if(a > b){
            // Estrutura de repetição:
            while(b != 0){
                resto = a % b;
                a = b;
                b = resto;
            }
        } 
        else{
            while(a != 0){
                resto = b % a;
                b = a;
                a = resto;
            }
            // Retorna o MDC, caso o bloco if for falso:
            return b;
        }
        // Retorna o MDC, caso o bloco if for verdadeiro:
        return a;
    }
}
