package controlador;

import modelo.entidades.Producto;
import modelo.repositorio.ProductoRepositorio;

public class InventarioControlador {

    private ProductoRepositorio productoRepositorio;

    private static final float porcentaje=1.35f;

    public Producto agregarProducto(int id, Double precio, String lote, String nombre){

        if (precio == null || nombre.isBlank() || lote.isBlank() ){
            throw new IllegalArgumentException("los datos no pueden estar vacios");
        }

        Producto producto = new Producto(id,precio,lote, nombre);

        producto.setPrecio(producto.getPrecio() * porcentaje);

        return productoRepositorio.agregarProducto(producto);
    }

    public  Producto eliminarProducto(Producto producto) {





        return null;
    }

    public Producto obtenerProducto(int id){
        return null;
    }

}
