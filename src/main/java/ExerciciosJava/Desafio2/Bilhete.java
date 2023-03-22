package ExerciciosJava.Desafio2;

public class Bilhete {

    protected String CodigoDoBilhete;

    protected String Usuario;

    double saldo;
    public int cota = 48;



    protected Usuario usuario;


    public Bilhete(String codigoDoBilhete,Usuario usuario) {
        this.CodigoDoBilhete = codigoDoBilhete;
        this.usuario = usuario;
    }

    public void PagarPassagem(double saldo){
        saldo = saldo - 5;

    }

    public void RecarregarBilhete(double guardarValor){
        saldo = saldo + cota;
    }

    public void pesquisarBilhetePorCPF(){

        String dados = "";

        dados += "Nome do usuario: " + this.Usuario;
        dados += "Número do telefone" + this.Usuario;
        dados += "Email do usuario" + this.Usuario;
        dados += "Cpf do usuario" + this.Usuario;
        dados += "Saldo do bilhete" + this.Usuario;



    }


    public String getCodigoDoBilhete() {
        return getCodigoDoBilhete();
    }

}
