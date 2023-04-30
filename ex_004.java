import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {

        float nota;
        float media;
        float valorMenor;
        float valorMaior;
        float soma;

        Scanner s = new Scanner(System.in);

        System.out.println("Infome sua nome: ");
        String nome = s.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe a sua nota de matemática : " );
            nota = s.nextFloat();
            soma = soma + nota;


            if(nota > valorMaior ) {
                valorMaior = nota;
            }
            if(nota < valorMenor ) {
                valorMenor = nota;
            }

        }

        media = soma / 5;

        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota: " + valorMaior);
        System.out.println("Menor nota: " + valorMenor);


    }
}
