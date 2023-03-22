package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3{
 public static void main(String[]args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Insira o valor numerico inteiro");

      int nv = input.nextInt();

      int ns = (nv + 1 );
      int na = (nv - 1 );

      System.out.println("o numero antecessor é:" + na );
      System.out.println("o numero sucessor é:" + ns);

      input.close();
     }
}
