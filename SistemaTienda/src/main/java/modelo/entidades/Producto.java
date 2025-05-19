package modelo.entidades;

import java.util.Objects;

public class Producto {

    private int id;
    private String nombre;
    private String lote;
    private Double precio;

    public Producto(int id, Double precio, String lote, String nombre) {
        this.id = id;
        this.precio = precio;
        this.lote = lote;
        this.nombre = nombre;
    }

    // Sobrescritura de equals() y hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return id == producto.id &&
                Objects.equals(precio, producto.precio) &&
                Objects.equals(lote, producto.lote) &&
                Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, precio, lote, nombre);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
