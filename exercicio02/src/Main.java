public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 59.90);
        Produto p2 = new Produto("Calça Jeans", 120.00);

        ItemPedido item1 = new ItemPedido(p1, 2);
        ItemPedido item2 = new ItemPedido(p2, 1);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.exibirResumo();
    }
}
