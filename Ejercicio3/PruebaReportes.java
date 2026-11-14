package Ejercicio3;

interface GeneradorReporte {
    void generar(String titulo);
}

class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String titulo) {
        System.out.println("Generando reporte en PDF: " + titulo);
    }
}

class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String titulo) {
        System.out.println("Generando reporte en Excel: " + titulo);
    }
}

class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String titulo) {
        generador.generar(titulo);
    }
}


public class PruebaReportes {
    public static void main(String[] args) {
        GestorReportes gestorPdf = new GestorReportes(new ReportePDF());
        gestorPdf.crearReporte("Ventas del mes");

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.crearReporte("Inventario");
    }
}

