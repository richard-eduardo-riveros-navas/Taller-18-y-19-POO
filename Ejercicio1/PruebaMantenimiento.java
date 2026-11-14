package Ejercicio1;

interface Reparador {
    void reparar();
}

interface Limpiador {
    void limpiar();
}

class Mecanico implements Reparador {
    @Override
    public void reparar() {
        System.out.println("El mecánico repara la máquina.");
    }
}

class Conserje implements Limpiador {
    @Override
    public void limpiar() {
        System.out.println("El conserje limpia las instalaciones.");
    }
}

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico();
        Conserje conserje = new Conserje();

        mecanico.reparar();
        conserje.limpiar();
    }
}

