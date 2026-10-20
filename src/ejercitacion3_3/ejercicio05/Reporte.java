package ejercitacion3_3.ejercicio05;

public class Reporte implements Imprimible {
    private String titulo;
    private int cantidadPaginas;

    public Reporte(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public void imprimir() {
        System.out.printf("Reporte %-16s | Paginas: %d%n", this.titulo, this.cantidadPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
}
