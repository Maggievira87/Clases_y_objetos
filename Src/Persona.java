public abstract class Persona {
    protected int numero;
    protected String nombre;

    public Persona(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }

    public abstract void mostrarInfo();
}