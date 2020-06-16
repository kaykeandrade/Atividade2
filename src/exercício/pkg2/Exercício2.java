/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg2;

import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class Exercício2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter= new Scanner (System.in);
        System.out.println("Digite um número: ");
        int n1 = enter.nextInt();
        if (n1 < 3)
            System.out.println("O valor inserido é menor que 3");
        else 
            System.out.println("O valor é inválido");
    }
    
}
