package com.tienda.reportes;

import java.util.List;

public class VentasReporte {
    private final List<Venta> ventas;
    private double totalVentas;
    private int totalProductosVendidos;

    public VentasReporte(List<Venta> ventas) {
        this.ventas = ventas;
        calcularTotales();
    }

    private void calcularTotales() {
        for (Venta venta : ventas) {
            totalVentas += venta.getTotal();
            totalProductosVendidos += venta.getCantidad();
        }
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }
}