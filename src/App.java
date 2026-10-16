import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan Perez", "Laptop", 1250, "juan@gmail.com");// crear manualmente el objeto de la
                                                                                   // clase Pedido
        PedidoService pedidoService = new PedidoService();// crear manualmente el objeto de la clase PedidoService
        pedido = null;// El objeto sea elegible por el garbage collector
        pedidoService.realizar(pedido);
        pedidoService = null;// El objeto sea elegible por el GC

    }
}
