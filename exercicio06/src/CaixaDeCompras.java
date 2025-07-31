public class CaixaDeCompras {

    // Método que calcula o total com possível desconto
    public double calcularTotalComDesconto(double valor1, double valor2, double valor3) {
        double total = valor1 + valor2 + valor3;

        if (total > 100.0) {
            total *= 0.90; // Aplica 10% de desconto
        }

        return total;
    }
}
