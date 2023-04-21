import java.util.Scanner;

public class ex_005 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = 15;

        System.out.println("Digite uma nome para o seu usuário: ");
        String nome = s.nextLine();

        System.out.println("Bem vindo " + nome + ", seu usuário é o " + num + "° a se cadastrar em nosso site.");
    }
}
