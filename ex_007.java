public class ex_007 {
    public static void main(String[] args) {

        System.out.print("Você comprou um produto no valor de R$ 578,00 à prazo, por isso o juros será de 37%. \n");

        double compra = ((578 * 37) / 100) + 578;

        System.out.println("O total a ser pago será de R$ " + compra);
    }
}
