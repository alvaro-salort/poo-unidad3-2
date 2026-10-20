package ejercitacion3_4.ejercicio06;

// una clase puede implementar varias interfaces a la vez
public class CertificadoAnalitico implements Imprimible, ValidableDigitalmente {
    private String nombreAlumno;
    private String carrera;
    private String codigoFirma;

    public CertificadoAnalitico(String nombreAlumno, String carrera, String codigoFirma) {
        this.nombreAlumno = nombreAlumno;
        this.carrera = carrera;
        this.codigoFirma = codigoFirma;
    }

    @Override
    public void imprimirDocumento() {
        System.out.printf("Certificado analitico de %-18s | Carrera: %s%n", this.nombreAlumno, this.carrera);
    }

    @Override
    public boolean verificarFirmaDigital() {
        boolean valida = this.codigoFirma != null && !this.codigoFirma.isEmpty();
        if (valida) {
            System.out.println("Firma digital " + this.codigoFirma + " verificada correctamente.");
        } else {
            System.out.println("El documento no posee una firma digital valida.");
        }
        return valida;
    }

    public static void main(String[] args) {
        CertificadoAnalitico certificado = new CertificadoAnalitico("Paula Medina", "Contaduria", "FD-2026-0091");

        System.out.println("--- COMO Imprimible ---");
        Imprimible imprimible = certificado;
        imprimible.imprimirDocumento();

        System.out.println("\n--- COMO ValidableDigitalmente ---");
        ValidableDigitalmente validable = certificado;
        validable.verificarFirmaDigital();

        System.out.println("\n--- COMO CertificadoAnalitico (clase concreta) ---");
        certificado.imprimirDocumento();
        System.out.println("Resultado de la verificacion: " + certificado.verificarFirmaDigital());
    }
}
