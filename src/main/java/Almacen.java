
import java.util.LinkedList;
import java.util.List;

public class Almacen {

//Atributos propios
    private String nit;
    private String nombre;
    private String direccion;

//Relaciones de asociacion Uno a muchos
    private List<Producto> losProductos = new LinkedList<>();
    private List<TipoProducto> tiposProductos = new LinkedList<>();
    private List<Empleado> losEmpleados = new LinkedList<>();
    private List<Cliente> losClientes = new LinkedList<>();
    private List<Compra> lasCompras = new LinkedList<>();

    public Almacen(String nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Añadir o eliminar elementos de las listas
    public void add(Producto losProductos) {
        this.losProductos.add(losProductos);
    }

    public void remove(Producto losProductos) {
        this.losProductos.remove(losProductos);
    }

    //---------------------------------------------------
    public void add(TipoProducto tiposProductos) {
        this.tiposProductos.add(tiposProductos);
    }

    public void remove(TipoProducto tiposProductos) {
        this.tiposProductos.remove(tiposProductos);
    }

    //---------------------------------------------------
    public void add(Empleado losEmpleados) {
        this.losEmpleados.add(losEmpleados);
    }

    public void remove(Empleado losEmpleados) {
        this.losEmpleados.remove(losEmpleados);
    }

    //---------------------------------------------------
    public void add(Cliente losClientes) {
        this.losClientes.add(losClientes);
    }

    public void remove(Cliente losClientes) {
        this.losClientes.remove(losClientes);
    }

    //_--------------------------------------------------
    public void add(Compra lasCompras) {
        this.lasCompras.add(lasCompras);
    }

    public void remove(Compra lasCompras) {
        this.lasCompras.remove(lasCompras);
    }

    //-----------------------------------------------------
    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

}
