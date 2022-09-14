
public class Empleado extends Persona {
//atributos propios

    private String usuario;
    private String Contraseña;

    public Empleado(String usuario, String Contraseña, String identificacion, String nombres, String apellidos) {
        super(identificacion, nombres, apellidos);
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

}
