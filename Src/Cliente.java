public class Cliente extends Persona {
    private String numeroUsuario;
    private String identificacion;

    public Cliente(int numero, String nombre, String numeroUsuario, String identificacion) {
        super(numero, nombre);
        this.numeroUsuario = numeroUsuario;
        this.identificacion = identificacion;
    }

    public String getNumeroUsuario() { return numeroUsuario; }
    public String getIdentificacion() { return identificacion; }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " | Usuario: " + numeroUsuario);
    }
}