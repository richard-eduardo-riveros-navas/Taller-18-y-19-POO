package Ejercicio2;

 interface Transferencia {
    void transferir(double monto);
}

 interface Retiro {
    void retirar(double monto);
}

interface PagoFactura {
    void pagarFactura(double monto);
}

class CajeroAutomatico implements Retiro, Transferencia {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en el cajero: $" + monto);
    }

    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia desde el cajero: $" + monto);
    }
}

 class BancaEnLinea implements Transferencia, PagoFactura {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia en línea: $" + monto);
    }

    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura en línea: $" + monto);
    }
}

public class PruebaBanco {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        BancaEnLinea banca = new BancaEnLinea();

        cajero.retirar(50000);
        cajero.transferir(120000);
        banca.transferir(80000);
        banca.pagarFactura(35000);
    }
}

