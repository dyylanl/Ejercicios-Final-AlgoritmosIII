package Productos;

import Excepciones.ProductoInexistenteException;
import Excepciones.StockInsuficienteException;
import java.util.ArrayList;


public class Productos {


    public ArrayList<Producto> productos = new ArrayList<Producto>();


    public void agregarProducto(String nombreDelProducto,int precio , int cantidad){

        Producto productoNuevo = new Producto(nombreDelProducto, precio, cantidad);
        this.productos.add(productoNuevo);

    }

    public int obtenerPrecioDelPedido(String nombreDelProducto, int cantidad){

        int indice = 0;

        while(this.productos.size() <= indice){

            Producto productoActual = this.productos.get(indice);

            if(productoActual.getNombreDelProducto() == nombreDelProducto){

                if(cantidad > productoActual.getStockDelProducto()){
                    throw new StockInsuficienteException();
                }
                productoActual.setStock(productoActual.getStockDelProducto()-cantidad);
                return productoActual.getPrecioDelProducto()*cantidad;

            }
            indice++;
        }
        throw new ProductoInexistenteException();
    }


}
