public class PedidoEstadoCancelado implements PedidoEstado {

    private PedidoEstadoCancelado() {};
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido cancelado";
    }
}
