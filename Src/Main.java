public class Main {
    public static void main(String[] args) {

        System.out.println("===== SISTEMA BANCARIO =====\n");

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Ana Torres", "USR001", "CC123456");
        Cliente cliente2 = new Cliente(2, "Luis Gómez", "USR002", "CC789012");

        cliente1.mostrarInfo();
        cliente2.mostrarInfo();

        System.out.println("\n--- Cuenta de Ahorro ---");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("CA-001", cliente1, 5.0);
        cuentaAhorro.depositar(1500, "USR001");        // primer depósito válido
        cuentaAhorro.retirar(800, "USR001", "CC123456"); // retiro válido
        cuentaAhorro.retirar(300, "USR001", "CC123456"); // falla por saldo mínimo
        cuentaAhorro.calcularInteresesMensuales();

        System.out.println("\n--- Cuenta de Inversión ---");
        CuentaInversion cuentaInversion = new CuentaInversion("CI-001", cliente2, 3.5);
        cuentaInversion.depositar(25000, "USR002");        // depósito inicial válido
        cuentaInversion.retirar(5000, "USR002", "CC789012");
        cuentaInversion.retirar(25000, "USR002", "CC789012");

        System.out.println("\n--- Empleados (Herencia y Polimorfismo) ---");
        Empleado[] empleados = {
                new Cajero(10, "Carlos Ruiz", 2500, 3, 5),
                new Supervisor(11, "Marta López", 4000, 8, "Créditos")
        };

        for (Empleado e : empleados) {
            e.mostrarInfo(); // polimorfismo Actividad
        }

        System.out.println("\nTotal empleados: " + Empleado.getTotalEmpleados());
        System.out.println("Total cuentas: " + CuentaBancaria.getTotalCuentas());

        System.out.println("\n--- Empresa Inversora ---");
        EmpresaInversora empresa = new EmpresaInversora("EMP01", "Inversiones XYZ",
                9.2, 12.5, 5000, 24);
        empresa.mostrarInfo();
        System.out.println("Total empresas registradas: " + EmpresaInversora.getTotalEmpresas());
    }
}
