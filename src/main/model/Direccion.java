package main.model;

public class Direccion {

    private String calle;
    private Integer nro;
    private String codigoPostal;
    private String barrio;
    private String ciudad;



    public Direccion (){}


    public Direccion(String calle, Integer nro, String codigoPostal, String barrio, String ciudad) {
        this.calle = calle;
        this.nro = nro;
        this.codigoPostal = codigoPostal;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
