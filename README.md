# Programación Orientada a Objetos - Ejercitaciones 3.E.3 y 3.E.4 (Polimorfismo)

Este repositorio contiene la resolución de las **Ejercitaciones 3.E.3 y 3.E.4** de la materia **Programación Orientada a Objetos en Java**, centradas en **polimorfismo**: clases abstractas, métodos abstractos, interfaces, métodos `default` y colecciones heterogéneas.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete. Todos los ejercicios son **autocontenidos**: las clases que se necesitan (`Empleado`, `EmpleadoPlanta`, `EmpleadoEventual`, etc.) se replican en el paquete de cada ejercicio para poder compilarlo y ejecutarlo por separado sin dependencias externas.

Además, se incluye un **Menú Interactivo de Consola (`Main.java`)** para compilar y ejecutar cualquier consigna cómodamente.

---

## 📂 Índice de Ejercicios Resueltos

### Ejercitación 3.E.3: Polimorfismo

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| --- | --- | --- |
| **01. FiguraGeometrica** | [`FiguraGeometrica.java`](src/ejercitacion3_3/ejercicio01/FiguraGeometrica.java) | Clase abstracta con método abstracto `calcularArea()` y subclases concretas `Circulo` y `Rectangulo`. |
| **02. Empleado** | [`Empleado.java`](src/ejercitacion3_3/ejercicio02/Empleado.java) | Lógica heredable concreta (`EmpleadoPlanta`) y especializado obligatorio (`EmpleadoEventual`). |
| **03. LiquidacionSueldos** | [`LiquidacionSueldos.java`](src/ejercitacion3_3/ejercicio03/LiquidacionSueldos.java) | Paso de parámetros polimórficos: el cliente trabaja con el tipo abstracto. |
| **04. Vehiculo** | [`Vehiculo.java`](src/ejercitacion3_3/ejercicio04/Vehiculo.java) | Inspección defensiva con `instanceof` y downcasting seguro sobre `Auto` y `Moto`. |
| **05. Imprimible** | [`Factura.java`](src/ejercitacion3_3/ejercicio05/Factura.java) | Contrato puro de interfaz con `Factura` y `Reporte` como implementaciones. |
| **06. TelefonoInteligente** | [`TelefonoInteligente.java`](src/ejercitacion3_3/ejercicio06/TelefonoInteligente.java) | Implementación múltiple de las interfaces `Conectable` y `Recargable`. |
| **07. Notificable** | [`NotificacionPush.java`](src/ejercitacion3_3/ejercicio07/NotificacionPush.java) | Lista heterogénea `ArrayList<Notificable>` con email, SMS y push. |
| **08. Pagable** | [`Servicio.java`](src/ejercitacion3_3/ejercicio08/Servicio.java) | Sistema de procesamiento múltiple sobre `List<Pagable>` con total acumulado. |
| **09. Evaluable** | [`ExamenEscrito.java`](src/ejercitacion3_3/ejercicio09/ExamenEscrito.java) | Método abstracto `obtenerPuntaje()` y método `default` `esAprobado()` en la interfaz. |
| **10. Reserva** | [`Reserva.java`](src/ejercitacion3_3/ejercicio10/Reserva.java) | Integración de clase abstracta, interfaz `Cancelable` y lista heterogénea. |

### Ejercitación 3.E.4: Polimorfismo

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| --- | --- | --- |
| **01. MiembroUniversitario** | [`MiembroUniversitario.java`](src/ejercitacion3_4/ejercicio01/MiembroUniversitario.java) | Contrato abstracto `obtenerRol()` con las subclases `Estudiante` y `Docente`. |
| **02. EvaluacionAcademica** | [`EvaluacionAcademica.java`](src/ejercitacion3_4/ejercicio02/EvaluacionAcademica.java) | Método concreto `imprimirEncabezado()` combinado con `calcularNotaFinal()` abstracto. |
| **03. PersonalUniversitario** | [`PersonalUniversitario.java`](src/ejercitacion3_4/ejercicio03/PersonalUniversitario.java) | Liquidación polimórfica de haberes desde una clase de servicio. |
| **04. EspacioUniversitario** | [`EspacioUniversitario.java`](src/ejercitacion3_4/ejercicio04/EspacioUniversitario.java) | Control de acceso con `instanceof` y downcasting sobre `Laboratorio` y `AulaMagna`. |
| **05. Acreditable** | [`CursoExtension.java`](src/ejercitacion3_4/ejercicio05/CursoExtension.java) | Interfaz de acreditación de horas con cursos y proyectos de investigación. |
| **06. CertificadoAnalitico** | [`CertificadoAnalitico.java`](src/ejercitacion3_4/ejercicio06/CertificadoAnalitico.java) | Múltiples contratos: `Imprimible` y `ValidableDigitalmente` en un solo objeto. |
| **07. NotificableCampus** | [`AvisoPlataforma.java`](src/ejercitacion3_4/ejercicio07/AvisoPlataforma.java) | Notificaciones del campus virtual agrupadas por interfaz común. |
| **08. SolicitudBeca** | [`SolicitudBeca.java`](src/ejercitacion3_4/ejercicio08/SolicitudBeca.java) | Gestión heterogénea de becas y cálculo del presupuesto total requerido. |
| **09. Evaluable** | [`ExamenOral.java`](src/ejercitacion3_4/ejercicio09/ExamenOral.java) | Método `default` `estaAprobado()` reutilizado por la implementación `ExamenOral`. |
| **10. ReservaTurno** | [`ReservaTurno.java`](src/ejercitacion3_4/ejercicio10/ReservaTurno.java) | Control de turnos con aranceles, cancelación opcional y comprobación de tipos. |

---

## Compilación y Ejecución

### Opción 1: Menú Interactivo de Consola (¡Recomendado!)

**Desde la Terminal:**

```bash
# 1. Compilar todo el proyecto
javac -encoding UTF-8 -d bin -sourcepath src src/Main.java

# 2. Ejecutar el menú principal
java -cp bin Main
```

**Desde cualquier IDE:** abrir y ejecutar la clase [`src/Main.java`](src/Main.java).

### Opción 2: Ejecutar un Ejercicio Individual

Cada ejercicio se compila indicando el path completo del archivo principal y se ejecuta con su package completo:

```bash
# Ejemplo: Ejercicio 10 - Reserva
javac -encoding UTF-8 -d bin -sourcepath src src/ejercitacion3_3/ejercicio10/Reserva.java
java -cp bin ejercitacion3_3.ejercicio10.Reserva
```

> La opción `-sourcepath src` le permite a `javac` resolver las clases auxiliares del mismo ejercicio automáticamente.

---

## Requisitos

- **Java Development Kit (JDK):** Versión 17 o superior.
- **IDE recomendado:** Visual Studio Code, IntelliJ IDEA, Eclipse o NetBrains.

---

>**Entrenador Novato:**
>
>```java
>if (poke.tipo == FUEGO) lanzarLlamas();
>else if (poke.tipo == AGUA) chorroAgua();
>```
>
>**Entrenador Maestro:**
>
>```java
>miPokemon.ejecutarAtaque();
>```
