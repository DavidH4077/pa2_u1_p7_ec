package com.edu.ec.agencia;

public class AgenciaService {
   public void procesarVenta(VentaVehiculo venta){
    double precioTotal=venta.getPrecio()*1.15;
    
    System.out.println("Procesando venta en la agencia de vehiculos.....");
    System.out.println("Venta registrada para el comprador: "+venta.getComprador());
    System.out.println("Vehiculo: "+venta.getVehiculo());
    System.out.println("Precio: $"+venta.getPrecio());
    System.out.println("Precio Total: $"+precioTotal);
    System.out.println("Correo del comprador: "+venta.getCorreo());
    System.out.println("Venta procesada exitosamente!!!");

        NotificadorAgencia notificador = new NotificadorAgencia();
        String asunto = "Confirmación de compra de vehículo";
        String cuerpo = "Estimado/a "+venta.getComprador()+
                "\nGracias por su compra del vehículo: "+venta.getVehiculo() +" ( "+ venta.getAño()+" - "+venta.getColor()+" - "+venta.getPlaca()+")"+
                " Precio: $"+venta.getPrecio() +" Precio Total: $"+precioTotal+" ha sido procesada exitosamente."+
                "\nAtentamente, Agencia de Vehículos JDHF";
        notificador.enviarNotificacion(venta.getCorreo(), asunto, cuerpo);

}
}
