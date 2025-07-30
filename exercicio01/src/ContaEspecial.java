public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial, limite);
    }

    // Sobrescrevendo o método sacar para permitir uso do limite
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }

        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado (Conta Especial). Saldo atual: R$" + saldo);
            return true;
        } else {
            System.out.println("Limite excedido! Saque não autorizado.");
            return false;
        }
    }
}

