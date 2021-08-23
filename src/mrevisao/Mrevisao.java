/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Mrevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);// usar no console
        boolean verifica;// var boolean |true or false| 0 or 1
        int num1;//var do tipo inteiro
        short num2;// var= samlint peq int
        long num3;//var = bigint int grande
        double num4;// var = decimal, numerico com casas decimais
        float num5;// var = decimal, numerico com casas decimais menor que o double
        byte b;//num inteiro valor max 127
        String texto;//aceita tudo em formato texto
        char sexo;
        String textoCurto;
        int vet[] = {1, 2, 3}; //as posições começam em ZERO 0, {1,2,3} são os valores
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);

        System.out.println("Revisão Manhã");
        System.out.println("Informe um Número inteiro:");
        num1 = ler.nextInt();
        System.out.println("Informe um número inteiro até 127:");
        b = ler.nextByte();
        System.out.println("Informe um número inteiro médio:");
        num2 = ler.nextShort();
        System.out.println("Informe um número inteiro grande:");
        num3 = ler.nextLong();
        System.out.println("Informe um número com decimal:");
        num4 = ler.nextDouble();
        System.out.println("Informe um número decimal pequeno");
        num5 = ler.nextFloat();
        System.out.println("Inform seu nome completo:");
        texto = ler.nextLine();
        texto = texto.toUpperCase();
        System.out.println("Informe o primeiro nome da sua mãe: ");
        textoCurto = ler.nextLine();
        System.out.println("Informe o seu sexo:");
        sexo = ler.next().charAt(0);

        System.out.println("---Impressão---");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);
        System.out.println("num5" + num5);
        System.out.println("Seu nome é:" + texto);
        System.out.println("Nome de sua mãe é :" + textoCurto);
        System.out.println("Seu sexo é:" + sexo);
        verifica = num1 >= num2;
        if (verifica) {
            System.out.println("num 1 é maior que num2");
        } else {
            System.out.println("num2 é maior que num1.");
        }

        System.out.println("Vetor");
        for (int i = 0; i < vet.length; i++) {

            System.out.println("Posição: " + i + " | Valor: " + vet[i]);

        }
        System.out.println("ArrayList");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println("Posição: " + i + " | Valor: " + valores.get(i));
        }
        System.out.println("impressão de ArrayList 2");

        valores.forEach((i) -> System.out.println(i));

        System.out.println("impressão de ArraList 3");
        valores.forEach(_item -> {

            System.out.println("Valor: " + valores.toString());
        });

        
    }
}
