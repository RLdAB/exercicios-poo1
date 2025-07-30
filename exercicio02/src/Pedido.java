import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome() +
                    " - R$ " + String.format("%.2f", item.getSubtotal()));
        }
        System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
    }
}
