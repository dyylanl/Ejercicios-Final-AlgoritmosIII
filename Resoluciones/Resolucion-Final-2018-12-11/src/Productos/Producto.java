package Productos;

public class Producto {


    public int precio;
    public int stock;
    public String nombreDelProducto;


    public Producto(String nombreProducto, int precio, int stock){

        this.nombreDelProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;

    }

    public int getPrecioDelProducto(){return this.precio;}

    public int getStockDelProducto(){return this.stock;}

    public String getNombreDelProducto(){return this.nombreDelProducto;}

    public void setStock(int stock){this.stock = stock;}

}
