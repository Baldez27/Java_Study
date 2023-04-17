import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valorMaior = 0;
        double valorMenor = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Infome seu sexo (M/F): ");
            String t = s.nextLine();
            System.out.println("Informe a sua altura: " );
            double a = s.nextDouble();

            if(a > valorMaior && a!=0) {
                valorMaior = a;

            }
            if(a < valorMenor && a!=0) {
                valorMenor = a;
            }

        }


        System.out.println("Maior valor: "+ valorMaior);
        System.out.println("Menor valor: "+ valorMenor);
    }
}


