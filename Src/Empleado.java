public class Empleado extends Persona {
    protected String puesto;
    protected double salario;
    protected int aniosTrabajados;

    private static int totalEmpleados = 0;

    public Empleado(int numero, String nombre, String puesto, double salario, int aniosTrabajados) {
        super(numero, nombre);
        this.puesto = puesto;
        this.salario = salario;
        this.aniosTrabajados = aniosTrabajados;
        totalEmpleados++;
    }

    public static int getTotalEmpleados() { return totalEmpleados; }

    public int calcularDiasVacaciones() {
        if (aniosTrabajados == 0) return 0;
        int dias = 5 + (aniosTrabajados - 1) * 2;
        return Math.min(dias, 20);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Puesto: " + puesto +
                " | Salario: $" + salario +
                " | Vacaciones: " + calcularDiasVacaciones() + " días");
    }
}
