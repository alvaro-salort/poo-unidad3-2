import java.util.Scanner;

import ejercitacion3_3.ejercicio01.FiguraGeometrica;
import ejercitacion3_3.ejercicio02.Empleado;
import ejercitacion3_3.ejercicio03.LiquidacionSueldos;
import ejercitacion3_3.ejercicio04.Vehiculo;
import ejercitacion3_3.ejercicio05.Factura;
import ejercitacion3_3.ejercicio06.TelefonoInteligente;
import ejercitacion3_3.ejercicio07.NotificacionPush;
import ejercitacion3_3.ejercicio08.Servicio;
import ejercitacion3_3.ejercicio09.ExamenEscrito;
import ejercitacion3_3.ejercicio10.Reserva;
import ejercitacion3_4.ejercicio01.MiembroUniversitario;
import ejercitacion3_4.ejercicio02.EvaluacionAcademica;
import ejercitacion3_4.ejercicio03.PersonalUniversitario;
import ejercitacion3_4.ejercicio04.EspacioUniversitario;
import ejercitacion3_4.ejercicio05.CursoExtension;
import ejercitacion3_4.ejercicio06.CertificadoAnalitico;
import ejercitacion3_4.ejercicio07.AvisoPlataforma;
import ejercitacion3_4.ejercicio08.SolicitudBeca;
import ejercitacion3_4.ejercicio09.ExamenOral;
import ejercitacion3_4.ejercicio10.ReservaTurno;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        do {
            System.out.println("\n==================================================");
            System.out.println("       MENÚ PRINCIPAL - EJERCITACIONES POO        ");
            System.out.println("==================================================");
            System.out.println("1. Ejercitación 3.E.3 (Ejercicios 1 a 10)");
            System.out.println("2. Ejercitación 3.E.4 (Ejercicios 1 a 10)");
            System.out.println("0. Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuEjercitacion3_3();
                    break;
                case 2:
                    menuEjercitacion3_4();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por revisar las ejercitaciones!");
                    break;
                default:
                    System.out.println("\n[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion3_3() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 3.E.3                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: FiguraGeometrica");
            System.out.println("2.  Ejercicio 2: Empleado");
            System.out.println("3.  Ejercicio 3: LiquidacionSueldos");
            System.out.println("4.  Ejercicio 4: Vehiculo");
            System.out.println("5.  Ejercicio 5: Imprimible");
            System.out.println("6.  Ejercicio 6: TelefonoInteligente");
            System.out.println("7.  Ejercicio 7: Notificable");
            System.out.println("8.  Ejercicio 8: Pagable");
            System.out.println("9.  Ejercicio 9: Evaluable");
            System.out.println("10. Ejercicio 10: Reserva");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    FiguraGeometrica.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    Empleado.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    LiquidacionSueldos.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    Vehiculo.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    Factura.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    TelefonoInteligente.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    NotificacionPush.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    Servicio.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    ExamenEscrito.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    Reserva.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion3_4() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 3.E.4                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: MiembroUniversitario");
            System.out.println("2.  Ejercicio 2: EvaluacionAcademica");
            System.out.println("3.  Ejercicio 3: PersonalUniversitario");
            System.out.println("4.  Ejercicio 4: EspacioUniversitario");
            System.out.println("5.  Ejercicio 5: Acreditable");
            System.out.println("6.  Ejercicio 6: CertificadoAnalitico");
            System.out.println("7.  Ejercicio 7: NotificableCampus");
            System.out.println("8.  Ejercicio 8: SolicitudBeca");
            System.out.println("9.  Ejercicio 9: Evaluable");
            System.out.println("10. Ejercicio 10: ReservaTurno");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    MiembroUniversitario.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    EvaluacionAcademica.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    PersonalUniversitario.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    EspacioUniversitario.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    CursoExtension.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    CertificadoAnalitico.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    AvisoPlataforma.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    SolicitudBeca.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    ExamenOral.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    ReservaTurno.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private static void pausa() {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
// Hecho con ayuda de la buena IA
