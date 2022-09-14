
public class DetalleCompra {

    //atributos propios
    private long cantidad;
    private double costoCompra;
    private double valorIva;

    //Relaciones de asociación uno a uno.
    private Producto producto;

    public DetalleCompra(long cantidad, double costoCompra, double valorIva, Producto producto) {
        this.cantidad = cantidad;
        this.costoCompra = costoCompra;
        this.valorIva = valorIva;
        this.producto = producto;
    }

    public long getCantidad() {
        return cantidad;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public double getValorIva() {
        return valorIva;
    }

    public Producto getProducto() {
        return producto;
    }

}
