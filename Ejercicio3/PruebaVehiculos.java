package Ejercicio3;

 interface Conducible {
    void conducir();
}

 interface TransportaMercancias {
    void cargarMercancias();
}

 class Bicicleta implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la bicicleta.");
    }
}

 class Camion implements Conducible, TransportaMercancias {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Cargando mercancías en el camión.");
    }
}

public class PruebaVehiculos {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Camion camion = new Camion();

        bicicleta.conducir();
        camion.conducir();
        camion.cargarMercancias();
    }
}

