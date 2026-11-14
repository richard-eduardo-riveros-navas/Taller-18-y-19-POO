package Ejercicio3;

public interface Vehiculo {
    void conducir();
    void cargarMercancias();
}

class Bicicletaa implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la bicicleta.");
    }

    @Override
    public void cargarMercancias() {
    }
}
 class Prueba {
    public static void main(String[] args) {
        Bicicletaa bicicleta = new Bicicletaa();
        bicicleta.conducir();
        bicicleta.cargarMercancias();
    }
}
