package Ejercicio2;

public interface OperacionBancaria {
    void transferir(double monto);
    void retirar(double monto);
    void pagarFactura(double monto);
}

class CajeroAutomaticoo implements OperacionBancaria {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia desde el cajero: $" + monto);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en el cajero: $" + monto);
    }

    @Override
    public void pagarFactura(double monto) {
    }
}
 class Prueba {
    public static void main(String[] args) {
        CajeroAutomaticoo cajero = new CajeroAutomaticoo();

        cajero.retirar(50000);
        cajero.transferir(120000);
        cajero.pagarFactura(2000);
    }
}

