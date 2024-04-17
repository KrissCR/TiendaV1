/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.reportes;

/**
 *
 * @author jimen
 */
class Venta {
private final int id;
    private final String producto;
    private final int cantidad;
    private final double precio;
    private double total;

    public Venta(int id, String producto, int cantidad, double precio) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = this.cantidad * this.precio;
    }

    public int getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return total;
    }
}