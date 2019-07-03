package Tienda;

import Cupones.Cupon;
import Envios.Envio;
import Productos.Productos;


public class TiendaOnline {



    private String nombre;
    private Productos productos = new Productos();
    private Cupon cupon;
    private Envio envio;



    public TiendaOnline(String nombre){

        this.nombre = nombre;

    }


    public double obtenerPrecioDelPedido(String nombreDelProducto, int cantidadDeProductos){

        int precio;
        precio = this.productos.obtenerPrecioDelPedido(nombreDelProducto,cantidadDeProductos);
        return cobrarPedido(precio);

    }


    public void setCupon(Cupon cupon){ this.cupon = cupon; }


    public void setEnvio(Envio envio){ this.envio = envio; }


    public double cobrarPedido(int precioProducto){

        double precioFinal;

        precioFinal = precioProducto * this.cupon.obtenerDescuento() * this.envio.obtenerCostoEnvio();

        return precioFinal;
    }


}
