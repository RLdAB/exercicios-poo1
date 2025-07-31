public class TestarCompras {
    public static void main(String[] args) {
        CaixaDeCompras caixa = new CaixaDeCompras();

        // Cenário 1: Total menor que 100
        double total1 = caixa.calcularTotalComDesconto(20.0, 30.0, 40.0);
        System.out.printf("Compra 1 (total < 100): R$ %.2f%n", total1);

        // Cenário 2: Total igual a 100
        double total2 = caixa.calcularTotalComDesconto(40.0, 30.0, 30.0);
        System.out.printf("Compra 2 (total = 100): R$ %.2f%n", total2);

        // Cenário 3: Total maior que 100
        double total3 = caixa.calcularTotalComDesconto(50.0, 60.0, 10.0);
        System.out.printf("Compra 3 (total > 100): R$ %.2f%n", total3);
    }
}
