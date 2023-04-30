import java.util.Scanner;

public class ex_006 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Escreva a altura da parede em (M): ");
        double alturap = s.nextDouble();

        System.out.println("Escreva a largura da parede em (M): ");
        double largurap = s.nextDouble();

        System.out.println("Escreva a altura da do azulejo em (CM): ");
        double alturaa = s.nextDouble();

        System.out.println("Escreva a altura da azulejo em (CM): ");
        double larguraa = s.nextDouble();

        double n1 = alturaa / 100;
        double n2 = alturaa / 100;

        double calculo = (alturap * largurap) / (n1 * n2);

        System.out.println("O total de azulejos que serão utilizados serão: " + calculo);

    }
}
