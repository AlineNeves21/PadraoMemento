import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pedido inválido", e.getMessage());
        }
    }
}
