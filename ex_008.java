public class ex_008 {
    public static void main(String[] args) {

        System.out.print("Você comprou um produto no valor de R$ 985,00 à vista, por isso o desconto será de 43%. \n");

        double compra = 985 - ((985 * 43) / 100);

        System.out.println("O total a ser pago será de R$ " + compra);
    }
}
