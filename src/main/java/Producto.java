
public class Producto {

    //Atributos propios
    private long codigo;
    private String nombre;
    private double costo;

    //Relacion de asociacion uno a uno
    private TipoProducto tipoProducto;

    public Producto(long codigo, String nombre, double costo, TipoProducto tipoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.tipoProducto = tipoProducto;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

}
