package ExerciciosJava;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int celsius = 10;

        for (int contador  = 1; contador  < 9; contador ++) {

            int f = (9 * celsius + 160)/5;

            System.out.println(celsius + "celsius" + "temperatura em fahrenheit:" + f);

            celsius = celsius + 10;
        }
    }



}
