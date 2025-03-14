static void mostrar() {
        if (contador == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        
        System.out.println("\nAgenda de Alumnos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumno[i].nombre);
            System.out.println("Boleta: " + alumno[i].boleta);
            System.out.println("Grupo: " + alumno[i].grupo);
            System.out.println("----------------------------");
        }
    }
}
