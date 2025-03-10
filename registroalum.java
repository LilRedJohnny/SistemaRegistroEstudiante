static void nuevoAlumno() {
    if (contador >= 10) {
        System.out.println("Agenda llena");
        return;
    }
    
    System.out.println("Digite el nombre del alumno");
    alumno[contador].nombre = scanner.nextLine();
    
    System.out.println("Digite la boleta del alumno");
    alumno[contador].boleta = scanner.nextLine();
    
    System.out.println("Digite el grupo del alumno");
    alumno[contador].grupo = scanner.nextLine();
    
    contador++;
}
