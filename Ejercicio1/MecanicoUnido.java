package Ejercicio1;


interface Mantenimiento {
    void reparar();
    void limpiar();
}

public class MecanicoUnido implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("El mecánico repara la máquina.");
    }

    @Override
    public void limpiar() {
    }
}
class PruebaM {
    public static void main(String[] args) {
        MecanicoUnido mecanico = new MecanicoUnido();

        mecanico.reparar();
        mecanico.limpiar();


    }
}


