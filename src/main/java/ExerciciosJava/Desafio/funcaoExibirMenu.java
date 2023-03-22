package ExerciciosJava.Desafio;

import java.util.Objects;
import java.util.Scanner;

public class funcaoExibirMenu {

    static Scanner input = new Scanner(System.in);

    public static void menu() {

        System.out.println("Menu Principal ");
        System.out.println("1 = Cadastrar novo Contato na Agenda");
        System.out.println("2 = Excluir Contato da Agenda");
        System.out.println("3 = Listar contatos da Agenda");
        System.out.println("4 = Limpar todos os Contatos");
        System.out.println("99 = Sair");
    }

    static String[] nomes = new String[20];
    static String[] telefones = new String[20];

    static int posicao = 0;

    public static void CadastrarContato(String Nome, String telefone) {
        nomes[posicao] = Nome;
        telefones[posicao] = telefone;
    }

    public static void listarContatosDaAgenda() {
    }

    public static void main(String[] args) {
        int opcoes;
        String nome, telefone;
        do {
            menu();
            opcoes = input.nextInt();
            switch (opcoes) {
                case 1:
                    input.nextLine();
                    System.out.println("Insira o nome:");
                    nome = input.nextLine();
                    System.out.println("Insira o telefone:");
                    telefone = input.nextLine();
                    CadastrarContato(nome, telefone);
                    posicao++;
                    break;
                case 2:
                    System.out.println("Qual contato deseja excluir ?");
                    nome = input.nextLine();
                    for (int i = 0; i < 20; i++) {
                        if (nome.equals(nomes[i])){
                            nomes[i] = null;
                            telefones[i] = null;
                        }
                    }

                    break;
                case 3:
                    System.out.println("Listar contatos:");
                    input.nextLine();

                    for (int i = 0; i <20 ; i++) {
                        if (nomes[i] != null) {
                            System.out.println("Os contatos listados são" + nomes[i] + telefones[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Limpar todos os contatos");
                    input.nextLine();

                    System.out.println("Lista de contados limpa");
                    for (int i = 0; i < 20; i++) {
                        nomes[i] = null;
                        telefones[i] = null;
                    }
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        } while (opcoes != 99);


    }
}