# Documentación - Agenda de Estudiantes

## Objetivo de la Práctica

El objetivo de esta práctica es desarrollar un programa en Java que permita administrar una agenda de estudiantes. Se pueden agregar, editar, eliminar, buscar y mostrar estudiantes utilizando una estructura de datos basada en arreglos.

## Integrantes y Responsabilidades

- **Eliminar estudiante:** Alondra  
- **Registrar nuevos estudiantes:** Nicol  
- **Mostrar lista de estudiantes:** Juan  
- **Buscar estudiante:** Axel  
- **Documentación:** Ismael  

## Introducción

Esta práctica tiene como objetivo poner en práctica los conocimientos adquiridos durante el curso de programación en Java, con el propósito de desarrollar una aplicación que gestione una agenda de estudiantes. En este programa, los usuarios pueden agregar, eliminar, modificar, buscar y mostrar información de los estudiantes utilizando arreglos. A través de esta práctica, se ha logrado mejorar la comprensión de estructuras de datos, manejo de arreglos y el uso de la programación orientada a objetos.

## Explicación del Código

A continuación, se explica línea por línea el código en Java:

```java
// Importa la clase Scanner para la entrada de datos
import java.util.Scanner;
```

```java
// Definición de la clase Agenda
class Agenda {
```

```java
// Definición de la clase interna Student
static class Student {
    String nombre;
    String boleta;
    String grupo;
```

```java
    // Constructor de la clase Student
    public Student() {
        nombre = "";
        boleta = "";
        grupo = "";
    }
```

```java
static Student[] alumno = new Student[10];
static int contador = 0;
static Scanner scanner = new Scanner(System.in);
```

```java
public static void main(String[] args) {
```

```java
    // Inicializa los objetos del array
    for (int i = 0; i < 10; i++) {
        alumno[i] = new Student();
    }
```

```java
    int op;
    do {
```

```java
        System.out.println("\t Bienvenido a la agenda");
        System.out.println("\t 1) Agregar Alumno");
        System.out.println("\t 2) Editar Alumno");
        System.out.println("\t 3) Borrar Alumno");
        System.out.println("\t 4) Mostrar Agenda");
        System.out.println("\t 5) Buscar Alumno por Boleta");
        System.out.println("\t 6) Salir");
        System.out.print("Digite su opción: ");
        op = scanner.nextInt();
        scanner.nextLine(); // Consume newline
```

```java
        switch (op) {
            case 1:
                nuevoAlumno();
                break;
            case 2:
                editarAlumno();
                break;
            case 3:
                borrarAlumno();
                break;
            case 4:
                mostrar();
                break;
            case 5:
                buscarAlumnoPorBoleta();
                break;
            case 6:
                System.out.println("Saliendo de la agenda");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
```

```java
    } while (op != 6);
    scanner.close();
}
```

## Funciones Implementadas

- **`nuevoAlumno()`**: Registra un nuevo estudiante.  
- **`editarAlumno()`**: Permite modificar los datos de un estudiante.  
- **`borrarAlumno()`**: Elimina un estudiante de la lista.  
- **`mostrar()`**: Muestra todos los estudiantes registrados.  
- **`buscarAlumnoPorBoleta()`**: Busca un estudiante en la agenda por su boleta.  

## Introducción de los Miembros del Equipo

### Alondra - Eliminar estudiante

**Introducción:**  
Alondra fue la encargada de implementar la función para eliminar estudiantes de la agenda. Se encargó de desarrollar la lógica que permite remover un estudiante de la lista registrada, asegurándose de que el espacio ocupado por el estudiante se libere correctamente.

**Conclusión:**  
La tarea de eliminar estudiantes fue fundamental para la gestión adecuada de la agenda, ya que garantiza que los datos desactualizados sean eliminados correctamente. Alondra desempeñó un papel importante para asegurar que esta funcionalidad fuera clara y eficiente en el programa.

### Nicol - Registrar nuevos estudiantes

**Introducción:**  
Nicol se encargó de implementar la funcionalidad para registrar nuevos estudiantes en la agenda. Desarrolló la lógica necesaria para ingresar los datos del estudiante y agregarlo a la lista de estudiantes, garantizando que la información se registrara correctamente.

**Conclusión:**  
Gracias a Nicol, los usuarios pueden registrar nuevos estudiantes de manera sencilla. Su contribución fue clave para garantizar que la agenda fuera dinámica y permitiera la incorporación de nuevos datos.

### Juan - Mostrar lista de estudiantes

**Introducción:**  
Juan fue el encargado de desarrollar la función que permite mostrar todos los estudiantes registrados en la agenda. Su tarea consistió en crear una función que recorriera la lista y mostrara los detalles de cada estudiante de forma ordenada.

**Conclusión:**  
La función de mostrar estudiantes es crucial para que los usuarios puedan visualizar toda la información ingresada. La implementación de Juan asegura que esta funcionalidad sea accesible y clara para los usuarios.

### Axel - Buscar estudiante

**Introducción:**  
Axel se encargó de implementar la función para buscar un estudiante dentro de la agenda por su boleta. La tarea consistió en crear una búsqueda eficiente para localizar rápidamente a un estudiante en el sistema.

**Conclusión:**  
La función de búsqueda desarrollada por Axel permite que los usuarios encuentren fácilmente a los estudiantes sin necesidad de revisar toda la lista manualmente, lo que mejora la usabilidad del programa.

### Ismael - Documentación

**Introducción:**  
Ismael fue el responsable de la documentación del proyecto, explicando detalladamente las funciones implementadas y proporcionando contexto sobre el propósito y estructura del programa. Su tarea fue esencial para facilitar la comprensión del código.

**Conclusión:**  
La documentación elaborada por Ismael asegura que otros usuarios puedan comprender cómo funciona el programa y cómo interactuar con sus diferentes funciones. Además, ofrece claridad sobre el trabajo de cada miembro del equipo.
