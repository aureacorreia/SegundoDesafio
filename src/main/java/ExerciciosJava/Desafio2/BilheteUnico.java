package ExerciciosJava.Desafio2;


    public class BilheteUnico extends Bilhete{

    private double saldo;
    private ExerciciosJava.Desafio2.Usuario usuario;


    public BilheteUnico(String codigoDoBilhete, Usuario usuario) {
        super(codigoDoBilhete, usuario);


    }

    public void RecarregarBilhete(double valor) {
        saldo = valor + saldo;
        // saldo recebe o valor mais o saldo anterior



    }
    public void pagarPassagem(double valor) {
        saldo = saldo - 5;


    }

    public void pesquisarBilhetePorCpf() {




    }

    @Override
    public String toString() {
        String dados = "";
        dados += "nome do usuario : " + this.usuario.getNome();
        return dados;

    }
}
