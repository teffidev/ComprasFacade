package main.service;

import main.model.Producto;

import java.util.List;

public class AlmacenService {

    private List<Producto> productos;

    public AlmacenService(){}

    public AlmacenService(List<Producto> productos){
        this.productos = productos;
    }

    public Producto buscarProducto(String productoId, Integer cantidad){
        Producto producto = null;
        for (Producto p : this.productos){
            if (p.getProductoId().equals(productoId) && p.getCantidad() >= cantidad)
                producto = p;
                p.setCantidad(p.getCantidad() - cantidad);
                producto.setCantidad(cantidad);
        }
        return producto;
    }
}
