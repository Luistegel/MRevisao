/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*

    Como é calculado?
    O IMC é a relação entre peso e altura e o cálculo é feito de acordo 
    com a fórmula: IMC = peso/ (altura x altura), devendo o peso estar 
    em kg e a altura em metro, e o resultado é dado em kg/m2. 
    Depois de obter o resultado, é possível verificar em que faixa o IMC 
    se encontra, podendo indicar:

    Magreza, quando o resultado é menor que 18,5 kg/m2;
    Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
    Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
    Obesidade, quando o resultado é maior que 30 kg/m2.

         */

        Scanner ler = new Scanner(System.in);
        float peso, altura, imc ;
        String nome;
        
        System.out.println("-- Calculadora IMC --");
        System.out.println("");
        System.out.println("Informe o seu nome:");
        nome = ler.nextLine();
        System.out.println("Informe o seu peso :");
        peso = ler.nextFloat();
        System.out.println("Informe a sua altura :");
        altura = ler.nextFloat();
        imc = peso / (altura * altura);
        
          System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);

      if (imc < 18.5) {
      System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);
    } else if (imc <= 24.9) {
      System.out.printf(nome + " seu IMC é: %.2f, e define Normal.", imc);
    } else if (imc <= 30) {
      System.out.printf(nome + " seu IMC é: %.2f, e define Sobrepeso.", imc);
    } else {
      System.out.printf(nome + " seu IMC é: %2.f, e define Obesidade.", imc);
    }

        
        
    }
}
