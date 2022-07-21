public class PedidoEstadoDevolvido implements PedidoEstado {

    private PedidoEstadoDevolvido() {};
    private static PedidoEstadoDevolvido instance = new PedidoEstadoDevolvido();
    public static PedidoEstadoDevolvido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido devolvido";
    }
}
