package Ejercicio2;

interface Almacenamiento {
    void guardar(String nombreArchivo, String contenido);
    String recuperar(String nombreArchivo);
}

class AlmacenamientoLocal implements Almacenamiento {
    private String nombreGuardado;
    private String contenidoGuardado;

    @Override
    public void guardar(String nombreArchivo, String contenido) {
        nombreGuardado = nombreArchivo;
        contenidoGuardado = contenido;
        System.out.println("Guardado en el disco local: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        if (nombreArchivo.equals(nombreGuardado)) {
            return contenidoGuardado;
        }
        return "Archivo no encontrado";
    }
}

class AlmacenamientoNube implements Almacenamiento {
    private String nombreGuardado;
    private String contenidoGuardado;

    @Override
    public void guardar(String nombreArchivo, String contenido) {
        nombreGuardado = nombreArchivo;
        contenidoGuardado = contenido;
        System.out.println("Subido a la nube: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        if (nombreArchivo.equals(nombreGuardado)) {
            return contenidoGuardado;
        }
        return "Archivo no encontrado";
    }
}

class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void leerArchivo(String nombre) {
        System.out.println("Contenido: " + almacenamiento.recuperar(nombre));
    }
}

public class PruebaArchivos {
    public static void main(String[] args) {
        GestorArchivos local = new GestorArchivos(new AlmacenamientoLocal());
        local.guardarArchivo("notas.txt", "Apuntes de clase");
        local.leerArchivo("notas.txt");

        GestorArchivos nube = new GestorArchivos(new AlmacenamientoNube());
        nube.guardarArchivo("tarea.txt", "Taller de DIP");
        nube.leerArchivo("otro.txt");
    }
}

