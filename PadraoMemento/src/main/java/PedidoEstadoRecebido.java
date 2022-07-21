public class PedidoEstadoRecebido implements PedidoEstado {

    private PedidoEstadoRecebido() {};
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();
    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido recebido";
    }
}
