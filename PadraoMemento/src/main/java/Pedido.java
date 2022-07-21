import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private PedidoEstado estado;
    private List<PedidoEstado> memento = new ArrayList<PedidoEstado>();

    public PedidoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Pedido inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PedidoEstado> getEstados() {
        return this.memento;
    }
}
