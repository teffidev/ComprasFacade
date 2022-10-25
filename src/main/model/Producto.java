package main.model;

public class Producto {

    private String productoId;
    private Integer cantidad;
    private Double valor;
    private String nombre;


    public Producto(){}


    public Producto(String productoId, Integer cantidad, Double valor, String nombre) {
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.valor = valor;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}
