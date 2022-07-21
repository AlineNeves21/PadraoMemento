public class PedidoEstadoTrocado implements PedidoEstado {

    private PedidoEstadoTrocado() {};
    private static PedidoEstadoTrocado instance = new PedidoEstadoTrocado();
    public static PedidoEstadoTrocado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido trocado";
    }
}
