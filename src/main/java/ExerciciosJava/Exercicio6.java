package ExerciciosJava;

public class Exercicio6 {

    public static void main(String[] args) {
        int a = 2, b = 5 , c = 3;
        double delta = (b * b) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0)
        {
            System.out.println("Não há solução nos números reais");
        } else if (delta ==0)
        {
        System.out.println("O valor de X é:" + x1);
        }
    else {
        System.out.println("O valor de X1 = " + x1 + "e o valor de X2 =" + x2);
        }
    }



}
