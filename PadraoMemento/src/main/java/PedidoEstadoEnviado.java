public class PedidoEstadoEnviado implements PedidoEstado {

    private PedidoEstadoEnviado() {};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido enviado";
    }
}
