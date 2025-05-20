package controlador;

import modelo.entidades.Producto;
import modelo.repositorio.ProductoRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InventarioControladorTest {

    @Mock
    private ProductoRepositorio productoRepositorio;

    @InjectMocks
    private InventarioControlador inventarioControlador;

    @Test
    void agregarProducto() {
        // Arrange
        int id = 1;
        Double precio = 3200.0;
        String lote = "1546a";
        String nombre = "mayonesa";

        Producto productoEsperado = new Producto(1, precio * 1.35, lote, nombre);

        when(productoRepositorio.agregarProducto(any(Producto.class))).thenReturn(productoEsperado);

        // Act
        Producto productoResultado = inventarioControlador.agregarProducto(id, precio, lote, nombre);

        // Assert
        Assertions.assertEquals(productoEsperado, productoResultado, "Los productos deben ser iguales");
        verify(productoRepositorio, times(1)).agregarProducto(any(Producto.class));
    }
}

