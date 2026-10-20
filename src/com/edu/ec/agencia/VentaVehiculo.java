package com.edu.ec.agencia;

public class VentaVehiculo {
    private String comprador;
    private String vehiculo;
    private double precio;
    private int año;
    private String color;
    private String placa;
    private String correo;
    
    public VentaVehiculo(String comprador, String vehiculo, double precio, int año, String color, String placa,
            String correo) {
        this.comprador = comprador;
        this.vehiculo = vehiculo;
        this.precio = precio;
        this.año = año;
        this.color = color;
        this.placa = placa;
        this.correo = correo;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
   
   
    
}
