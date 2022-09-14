
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Compra {

    //Relaciones de asociacion uno a uno
    private java.time.LocalDateTime fecha;
    private Empleado empleado;
    private Cliente cliente;

    //Relacion de asociacion uno a muchos.
    private List< DetalleCompra> detallesCompras = new LinkedList<>();

    public Compra(LocalDateTime fecha, Empleado empleado) {
        this.fecha = fecha;
        this.empleado = empleado;

    }

    //----------------Agregar o quitar elementos a las listas
    public void add(DetalleCompra detallesCompras) {
        this.detallesCompras.add(detallesCompras);
    }

    public void remove(DetalleCompra detallesCompras) {
        this.detallesCompras.remove(detallesCompras);
    }

    //-------------------------------------------------------------
    public LocalDateTime getFecha() {
        return fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
