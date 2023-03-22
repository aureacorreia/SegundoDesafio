package ExerciciosJava;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor inteiro");
        int valor = input.nextInt();
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        while (valor >= 0) {
            if (valor >= maiorValor) {

                maiorValor = valor;
            }

            if (valor <= menorValor) {

                menorValor = valor;
            }
            System.out.println("Insira o valor inteiro");
            valor = input.nextInt();
        }
        System.out.println("Maior valor informado:" + maiorValor + "Menor valor informado:"+ menorValor);
    }
}