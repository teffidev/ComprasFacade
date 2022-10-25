package main.facade;

import main.model.Direccion;
import main.model.Tarjeta;

import java.util.List;

public interface ICompraService {

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);


}
