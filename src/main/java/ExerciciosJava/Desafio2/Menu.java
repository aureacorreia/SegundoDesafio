package ExerciciosJava.Desafio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ExerciciosJava.Desafio.funcaoExibirMenu.menu;

public class Menu {
    Scanner input = new Scanner(System.in);

    static List<Usuario>usuarios = new ArrayList<Usuario>();
    static List<Bilhete>bilhetes = new ArrayList<Bilhete>();

    public void menu() {

        int posicao = 0;
        String[] nomes = new String[20];
         String[] telefones = new String[20];
        String[] emails = new String[20];
         String[] cpfs = new String[20];
         BilheteUnico b2;


        int opcoes = 0;
        String codigoDoBilhete;
        int guardarTipoDeBilhete;
        int saldo;
        String guardarCodigo;

        System.out.println("---MENU PRINCIPAL---");
        System.out.println(" 1= Cadastrar UsuÃ¡rio ");
        System.out.println(" 2= Cadastrar Bilhete ");
        System.out.println(" 3= Recarregar Bilhete ");
        System.out.println(" 4= Pagar Passagem");
        System.out.println(" 5= Listar Bilhetes");
        System.out.println(" 6= Pesquisar Bilhete Por CPF");
        System.out.println(" 99 Para Sair");

        do { opcoes = input.nextInt();

            switch (opcoes) {

                case 1: {
                    System.out.println(" 1= Cadastrar novo Usuario");
                    input.nextLine();

                    System.out.println(" Informe o Nome : " );
                    String nome = input.nextLine();

                    System.out.println(" Informe o email : ");
                    String email = input.nextLine();

                    System.out.println(" Informe o Telefone ; ");
                    String telefone = input.nextLine();

                    System.out.println(" Informe o CPF : ");
                   input.nextLine();
                    Usuario p1 = new Usuario(nome,cpfs,telefone, email);
                    usuarios.add(p1);

                    break;

                } case 2:
                    System.out.println(" 2= Cadastrar Bilhete ");
                    System.out.println("insira seu cpf");
                    cpfs = new String[]{input.nextLine()};
                    Usuario p1 = null;
                    boolean achou = false;
                    for (Usuario p:usuarios){
                        if (cpfs.equals(p.getCpf())){
                            p1 = p;
                            achou = true;

                        }
                    }
                    if (!achou) {
                        System.out.println("cpf não encontrado, tente novamente");


                    }else {
                        System.out.println(" forneça o código do bilhete: ");
                        codigoDoBilhete = input.nextLine();
                        System.out.println("qual o tipo de Bilhete?");
                        System.out.println("1 = bilhete único estudante");
                        System.out.println("2 = bilhete único comum");


                        guardarTipoDeBilhete = input.nextInt();
                        Bilhete b1;
                        if (guardarTipoDeBilhete == 1) {
                            b1 = new BilheteUnicoEstudante(codigoDoBilhete,p1);

                        }else {
                            b1 = new BilheteUnico(codigoDoBilhete,p1);
                        }
                        bilhetes.add(b1);

                    }

                    break;


                case 3:

                    System.out.println(" Insira o codigo do bilhete ");
                    input.nextLine();
                    guardarCodigo = input.nextLine();

                    Bilhete guardarBilhete = null;
                    boolean achouBilhete = false;
                    for (Bilhete b : bilhetes) {


                        if (b.getCodigoDoBilhete().equals(guardarCodigo)){
                            guardarBilhete = b;
                            achouBilhete = true;

                        }
                    }

                    if (achouBilhete) {
                        System.out.println("codigo invalido. tente novamente");
                    } else {

                        if (guardarBilhete instanceof BilheteUnicoEstudante) {

                        }else {
                            System.out.println("informe o valor que deseja recarregar");

                            double guardarValor = input.nextDouble();
                            guardarBilhete.RecarregarBilhete(guardarValor);
                        }

                    }

                    break;

                case 4:
                    System.out.println(" 4= Pagar Passagem");
                    input.nextLine();

                    break;

                case 5:
                    System.out.println(" 5= Listar Bilhetes");
                    input.nextLine();

                    // USEI O FOREACH. foreach Ã© uma versao mais simplificada do fori
                    System.out.println("Aqui Esta a Sua Lista De Bilhetes");
                    for (Bilhete bilhete: bilhetes
                    ) {
                        System.out.println(bilhete);

                    }

                    break;

                case 6:
                    System.out.println(" 6= Pesquisar Bilhete Por CPF");
                    input.nextLine();

                    break;
            }




        } while (opcoes != 99);

    }



}

