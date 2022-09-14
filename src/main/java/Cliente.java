
public class Cliente extends Persona {
//Atributos propios 
    private String telefono;
    private String correo;
    private long puntos;

    public Cliente(String telefono, String correo, long puntos, String identificacion, String nombres, String apellidos) {
        super(identificacion, nombres, apellidos);
        this.telefono = telefono;
        this.correo = correo;
        this.puntos = puntos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public long getPuntos() {
        return puntos;
    }

}
