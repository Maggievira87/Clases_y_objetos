public class Supervisor extends Empleado {
    private String area;

    public Supervisor(int numero, String nombre, double salario, int aniosTrabajados, String area) {
        super(numero, nombre, "Supervisor", salario, aniosTrabajados);
        this.area = area;
    }

    public void supervisar() {
        System.out.println("Supervisor " + nombre + " supervisando área: " + area);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("  Área: " + area);
    }
}
