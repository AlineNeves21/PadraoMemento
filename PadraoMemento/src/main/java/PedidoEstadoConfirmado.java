public class PedidoEstadoConfirmado implements PedidoEstado {

    private PedidoEstadoConfirmado() {};
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();
    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido confirmado";
    }
}
