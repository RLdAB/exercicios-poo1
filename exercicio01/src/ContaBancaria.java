public class ContaBancaria {
    private int numero;
    protected double saldo;  // protegido para permitir acesso pela subclasse
    protected double limite; // limite de saque (0 na classe base)

    public ContaBancaria(int numero, double saldoInicial, double limite) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo restante: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    public void consultarSaldo() {
        System.out.println("Conta Nº " + numero + " | Saldo: R$" + saldo);
    }
}
