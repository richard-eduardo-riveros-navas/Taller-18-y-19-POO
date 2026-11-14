package Ejercicio1;

interface ServicioAutenticacion {
    boolean autenticar(String usuario, String credencial);
}

class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return usuario.equals("admin") && credencial.equals("1234");
    }
}

class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return credencial.equals("token-valido");
    }
}

class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicio.autenticar(usuario, credencial)) {
            System.out.println("Acceso concedido a " + usuario);
        } else {
            System.out.println("Acceso denegado a " + usuario);
        }
    }
}

public class PruebaAutenticacion {
    public static void main(String[] args) {
        GestorAutenticacion local = new GestorAutenticacion(new AutenticacionLocal());
        local.iniciarSesion("admin", "1234");
        local.iniciarSesion("admin", "0000");

        GestorAutenticacion oauth = new GestorAutenticacion(new AutenticacionOAuth());
        oauth.iniciarSesion("carlos", "token-valido");
    }
}

