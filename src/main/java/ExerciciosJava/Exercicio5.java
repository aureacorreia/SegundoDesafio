package ExerciciosJava;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor numerico inteiro");
        int n = input.nextInt();

        if (n < 0) {
            n = n * (-1);

        }
        System.out.println("O numero é: " + n );
        input.close();
    }

}
