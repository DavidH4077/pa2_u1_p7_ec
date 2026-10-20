import com.edu.ec.agencia.AgenciaService;
import com.edu.ec.agencia.VentaVehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         VentaVehiculo venta = new VentaVehiculo("Daniel Lopez", "Toyota Tacoma", 80000.0, 2024, "Rojo", "PDW-0123", "DaniL132@gmail.com");
        AgenciaService agencia = new AgenciaService();
        agencia.procesarVenta(venta);

        venta = null;// El objeto sea elegible por el garbage collector
        agencia.procesarVenta(venta);
        agencia = null;// El objeto sea elegible por el GC

    }
}
