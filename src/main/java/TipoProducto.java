
public class TipoProducto {

    private String nombre;
    private double porcentajeIva;

    public TipoProducto(String nombre, double porcentajeIva) {
        this.nombre = nombre;
        this.porcentajeIva = porcentajeIva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

}
