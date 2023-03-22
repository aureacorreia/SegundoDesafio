package ExerciciosJava;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor maior");
        int a = input.nextInt();

        System.out.println("Insira o valor menor");
        int b = input.nextInt();

        int diferenca = (a - b);

        System.out.println("A diferença entre o maior e menor valor é:" + diferenca);

        input.close();
    }
}


