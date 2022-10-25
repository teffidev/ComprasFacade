package main;

import main.facade.ICompraService;
import main.facade.impl.CompraFacadeImpl;
import main.model.Direccion;
import main.model.Producto;
import main.model.Tarjeta;
import main.service.AlmacenService;
import main.service.EnvioService;
import main.service.PagoService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("1", 5, 1000.20,"Mouse");
        Producto producto2 = new Producto("2", 5, 3000.25,"Teclado");

        Tarjeta tarjeta = new Tarjeta(54268712, 012, "2025/07/09");

        Direccion direccion = new Direccion("Av Monroe", 860, "1428", "CABA", "Capital Federal");

        ICompraService compraService = new CompraFacadeImpl(new AlmacenService(Arrays.asList(producto1, producto2)), new PagoService(), new EnvioService());

        compraService.procesarCompra("1", 2, tarjeta, direccion);





    }


}