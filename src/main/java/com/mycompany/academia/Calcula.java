/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author Fernanda
 */
public class Calcula {

    public static int Soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int Multiplicacao(int num1, int num2) {
        return num1*num2;
    }

    public static int Subtracao(int num1, int num2) {
        if(num1>num2){
            return num1-num2;
        }
        else if (num2>num1){
            return num2-num1;
         }
        return 0;
    }

    public static int Divisao(int num1, int num2) {
        if(num1<=0 || num2 <=0){
            return 0;
        }
        return num1/num2;
    }
}
