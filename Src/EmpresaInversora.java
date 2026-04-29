public class EmpresaInversora {
    private String claveEmpresa;
    private String nombre;
    private double confiabilidad;
    private double porcentajeRetorno;
    private double montoMinimo;
    private int plazoMeses;

    private static int totalEmpresas = 0;

    public EmpresaInversora(String claveEmpresa, String nombre, double confiabilidad,
                            double porcentajeRetorno, double montoMinimo, int plazoMeses) {
        this.claveEmpresa = claveEmpresa;
        this.nombre = nombre;
        this.confiabilidad = confiabilidad;
        this.porcentajeRetorno = porcentajeRetorno;
        this.montoMinimo = montoMinimo;
        this.plazoMeses = plazoMeses;
        totalEmpresas++;
    }

    public static int getTotalEmpresas() { return totalEmpresas; }

    public void mostrarInfo() {
        System.out.println("Empresa: " + nombre + " | Clave: " + claveEmpresa +
                " | Retorno: " + porcentajeRetorno + "% | Plazo: " + plazoMeses + " meses" +
                " | Confiabilidad: " + confiabilidad);
    }
}
