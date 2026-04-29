public class CuentaInversion extends CuentaBancaria {
    private double nivelRiesgo;
    private static final double DEPOSITO_MINIMO_INICIAL = 25000;
    private static final double SALDO_MINIMO = 10000;

    public CuentaInversion(String numeroCuenta, Cliente titular, double nivelRiesgo) {
        super(numeroCuenta, titular);
        this.nivelRiesgo = nivelRiesgo;
    }

    @Override
    public boolean depositar(double monto, String numeroUsuario) {
        if (!titular.getNumeroUsuario().equals(numeroUsuario)) {
            System.out.println("Número de usuario incorrecto.");
            return false;
        }
        if (saldo == 0 && monto < DEPOSITO_MINIMO_INICIAL) {
            System.out.println("El monto inicial debe ser mínimo $" + DEPOSITO_MINIMO_INICIAL);
            return false;
        }
        saldo += monto;
        System.out.println("Inversión registrada. Saldo: $" + saldo);
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
        boolean cancelarCuenta = (monto == saldo);
        if (!cancelarCuenta && saldo - monto < SALDO_MINIMO) {
            System.out.println("Debe quedar mínimo $" + SALDO_MINIMO + " o retirar todo para cancelar.");
            return false;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
        return true;
    }
}
