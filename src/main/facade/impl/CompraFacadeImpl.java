package main.facade.impl;

import main.facade.ICompraService;
import main.model.Direccion;
import main.model.Producto;
import main.model.Tarjeta;
import main.service.AlmacenService;
import main.service.EnvioService;
import main.service.PagoService;

import java.util.Arrays;

public class CompraFacadeImpl implements ICompraService {

    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraFacadeImpl(AlmacenService almacenService, PagoService pagoService, EnvioService envioService) {
        this.almacenService = almacenService;
        this.pagoService = pagoService;
        this.envioService = envioService;
    }

    @Override
    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion) {
        Producto producto = almacenService.buscarProducto(productoId, cantidad);
        if (producto != null){
            //Si tenemos el producto, procesamos el pago
            if (pagoService.procesarPago(tarjeta, String.valueOf(producto.getValor() * cantidad))){
                envioService.procesarEnvio(Arrays.asList(producto), direccion);
            }
        }

    }
}
