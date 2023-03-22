package ExerciciosJava.Sprint2;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Aurea lavinia");
        p1.setIdade(17);

        p1.fazAniversario();   //18
        p1.fazAniversario();   //19
        p1.fazAniversario();   //20
        p1.fazAniversario();   //21

        System.out.println("Nome da pessoa:" + p1.getNome());
        System.out.println("Idade da pessoa:" + p1.getIdade());

    }


}

