package main.model;

public class Tarjeta {

    private Integer numerosFrente;
    private Integer codSeguridad;
    private String fechaVencimiento;

    public Tarjeta (){}

    public Tarjeta(Integer numerosFrente, Integer codSeguridad, String fechaVencimiento) {
        this.numerosFrente = numerosFrente;
        this.codSeguridad = codSeguridad;
        this.fechaVencimiento = fechaVencimiento;
    }


    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(Integer numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public Integer getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(Integer codSeguridad) {
        this.codSeguridad = codSeguridad;
    }
}
