public class CuentaAhorro extends CuentaBancaria {
    private double tasaAhorroAnual;
    private boolean primerDeposito;
    private static final double DEPOSITO_MINIMO_INICIAL = 1000;
    private static final double SALDO_MINIMO = 500;

    public CuentaAhorro(String numeroCuenta, Cliente titular, double tasaAhorroAnual) {
        super(numeroCuenta, titular);
        this.tasaAhorroAnual = tasaAhorroAnual;
        this.primerDeposito = true;
    }

    @Override
    public boolean depositar(double monto, String numeroUsuario) {
        if (!titular.getNumeroUsuario().equals(numeroUsuario)) {
            System.out.println("Número de usuario incorrecto.");
            return false;
        }
        if (primerDeposito && monto < DEPOSITO_MINIMO_INICIAL) {
            System.out.println("El primer depósito debe ser mínimo $" + DEPOSITO_MINIMO_INICIAL);
            return false;
        }
        saldo += monto;
        primerDeposito = false;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        return true;
    }

    @Override
    public boolean retirar(double monto, String numeroUsuario, String identificacion) {
        if (!titular.getNumeroUsuario().equals(numeroUsuario)) {
            System.out.println("Número de usuario incorrecto.");
            return false;
        }
        if (!titular.getIdentificacion().equals(identificacion)) {
            System.out.println("Identificación incorrecta.");
            return false;
        }
        if (saldo - monto < SALDO_MINIMO) {
            System.out.println("Retiro no permitido. Debe quedar mínimo $" + SALDO_MINIMO);
            return false;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        return true;
    }

    public void calcularInteresesMensuales() {
        double interes = saldo * (tasaAhorroAnual / 100) / 12;
        saldo += interes;
        System.out.println("Intereses aplicados: $" + interes + " | Nuevo saldo: $" + saldo);
    }
}
 