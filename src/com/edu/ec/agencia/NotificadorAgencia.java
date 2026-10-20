package com.edu.ec.agencia;

public class NotificadorAgencia {
    public void enviarNotificacion(String correo,String asunto,String cuerpo){
        System.out.println("Enviando correo a: "+correo);
        System.out.println("Asunto: "+asunto);
        System.out.println("Cuerpo: "+cuerpo);
        System.out.println("Correo enviado exitosamente");
    }
}
