public class Cajero extends Empleado {
    private int cajeroId;

    public Cajero(int numero, String nombre, double salario, int aniosTrabajados, int cajeroId) {
        super(numero, nombre, "Cajero", salario, aniosTrabajados);
        this.cajeroId = cajeroId;
    }

    public void atenderCliente(Cliente c) {
        System.out.println("Cajero " + nombre + " atendiendo a: " + c.getNombre());
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("  ID Cajero: " + cajeroId);
    }
}
