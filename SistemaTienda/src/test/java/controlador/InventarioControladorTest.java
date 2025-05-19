package controlador;

import modelo.entidades.Producto;
import modelo.repositorio.ProductoRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class InventarioControladorTest {

    @Mock
    private ProductoRepositorio productoRepositorio;
    @Mock
    private InventarioControlador inventarioControlador;

    @Test
    void agregarProducto() {

        //arrange
        int id = 1;
        Double precio = (Double) 3200.0;
        String lote = "1546a";
        String nombre = "mayonesa";

        //Datos Salida Esperados
        Producto productoEsperado = new Producto( 1,4200.0,"1546a","mayonesa");
        //Imitacion de los recursos externos al metodo a probar
        when(productoRepositorio.agregarProducto(any(Producto.class))).thenReturn(new Producto(1, 4200.0, "1546a", "mayonesa"));

        //Act

        Producto productoResultado = inventarioControlador.agregarProducto(id,precio,lote,nombre);

        //Assert
        Assertions.assertEquals(productoResultado,productoEsperado,"Los productos deben ser iguales");
        verify(productoRepositorio, times(1)).agregarProducto(any(Producto.class));

    }
}
