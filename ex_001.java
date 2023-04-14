import java.util.Scanner;

class ex_001 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um valor :");
        int n1 = s.nextInt();

        System.out.print("Informe mais um valor: ");
        int n2 = s.nextInt();

        int n3 = 4;
        int n4 = 7;

        if (n1 % 2 == 0){
            System.out.println("O numero " + n1 + " é par!");
        }
        else{
            System.out.println("O numero " + n1 + " é ímpar!");
        }

        if (n2 % 2 == 1){
            System.out.println("O numero " + n2 + " é ímpar!");
        }
        else{
            System.out.println("O numero " + n2 + " é par!");
        }

        if (n3 % 2 == 0){
            System.out.println("O numero " + n3 + " é par!");
        }
        else{
            System.out.println("O numero " + n3 + " é ímpar!");
        }

        if (n4 % 2 == 1){
            System.out.println("O numero " + n4 + " é ímpar!");
        }
        else{
            System.out.println("O numero " + n4 + " é par!");
        }

    }
}

