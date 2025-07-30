public class Main {
    public static void main(String[] args) {
        // Conta normal
        ContaBancaria conta1 = new ContaBancaria(123, 500.0, 0.0);
        // Conta especial com limite de R$ 300
        ContaEspecial conta2 = new ContaEspecial(456, 500.0, 300.0);

        System.out.println(">>> Testando Conta Bancária Comum");
        conta1.consultarSaldo();
        conta1.sacar(200);
        conta1.sacar(400); // deve falhar
        conta1.depositar(100);
        conta1.consultarSaldo();

        System.out.println("\n>>> Testando Conta Especial");
        conta2.consultarSaldo();
        conta2.sacar(700); // usa o limite, deve funcionar
        conta2.sacar(200); // extrapola o limite, deve falhar
        conta2.depositar(300);
        conta2.consultarSaldo();
    }
}

