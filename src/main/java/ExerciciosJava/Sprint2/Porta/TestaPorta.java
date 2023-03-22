
import ExerciciosJava.Sprint2.Porta;

public class TestaPorta {

    public static void main(String[] args) {

        Porta pt1 = new Porta();

        System.out.println("A porta está:" + pt1.estaAberta());

        // valores das dimensões
       pt1.dimensaoX = 2;
       pt1.dimensaoY = 3.2;
       pt1.dimensaoZ = 2.2;

       // condiçao da porta
        pt1.estaAberta();

        System.out.println("O valor da dimensão X é:" + pt1.dimensaoX);
        System.out.println("O valor da dimensão Y é:" + pt1.dimensaoY);
        System.out.println("O valor da dimensão Z é:" + pt1.dimensaoZ);

        // comando pintar a porta
        pt1.pintar("rosa");
        System.out.println("A cor da porta é:" + pt1.cor);

        int QuantasPortasEstaoAbertas;



    }



}
