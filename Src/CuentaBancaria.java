public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente titular;

    private static int totalCuentas = 0;
    public CuentaBancaria(String numeroCuenta, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
        totalCuentas++;
    }

    public static int getTotalCuentas() { return totalCuentas; }

    public abstract boolean depositar(double monto, String numeroUsuario);
    public abstract boolean retirar(double monto, String numeroUsuario, String identificacion);

    public double getSaldo() { return saldo; }
    public String getNumeroCuenta() { return numeroCuenta; }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Saldo: $" + saldo);
    }
}
