/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author Fernanda
 */
import java.util.Scanner;

public class Calculos{

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Pressione \n (1) : Somar os dois números | \n (2) : Multiplicar os dois números | \n (3) : Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero) | \n (4) : Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por zero)");
        int index = input.nextInt();
        System.out.println("Digite o primeiro número");
        int num1= input.nextInt();
        System.out.println("Digite o segundo número");
        int num2= input.nextInt();
        switch (index) {
            case 1: System.out.println(Calcula.Soma(num1,num2) ); break;
            case 2: System.out.println(Calcula.Multiplicacao(num1, num2));break;
            case 3: System.out.println(Calcula.Subtracao(num1, num2));break;
            case 4: System.out.println(Calcula.Divisao(num1, num2));
        }
    }
}
