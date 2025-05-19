package modelo.entidades;

import java.util.List;

public class Proovedor {

    private String empresa;
    private String idEmpresa;
    private String numeroEmpresa;
    private String correo;
    private List<String> productos;


    public Proovedor(String empresa, List<String> productos, String correo, String numeroEmpresa, String idEmpresa) {
        this.empresa = empresa;
        this.productos = productos;
        this.correo = correo;
        this.numeroEmpresa = numeroEmpresa;
        this.idEmpresa = idEmpresa;

    }
}
