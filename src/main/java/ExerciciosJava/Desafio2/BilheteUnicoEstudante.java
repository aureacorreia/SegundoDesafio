package ExerciciosJava.Desafio2;

public class BilheteUnicoEstudante extends Bilhete {

    private int cota =0;

    public BilheteUnicoEstudante(String codigoDoBilhete, Usuario usuario) {
        super(codigoDoBilhete, usuario);

    }



    public void recarregarBilhete() {
        cota += 48;
    }


    public void pagarPassagem() {
        cota -= 1;
    }
}

