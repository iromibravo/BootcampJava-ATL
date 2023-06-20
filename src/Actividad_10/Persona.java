package Actividad_10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String fechaFormateada;
    private  String DNI;

    //Constructor Vacío
    public Persona() {
    }

    //Constructor
    public Persona(String id, String nombre, int edad, LocalDate fechaNacimiento, String DNI) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaFormateada = fechaNacimiento.format(formatter);
        this.DNI = DNI;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // toString
    @Override
    public String toString() {
        return  "Id=" + " "+ id + '\n' +
                "Nombre=" +  " "+ nombre + '\n' +
                "Edad=" +  " "+ edad + '\n' +
                "Fecha de Nacimiento=" +  " "+ fechaFormateada + '\n' +
                "DNI=" + " "+ DNI;
    }

    // Método para mostrar los datos de la persona
    public void mostrar() {
        System.out.println(this);
    }

    //Método esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
    public boolean esMayorDeEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period tiempo = Period.between(fechaNacimiento, fechaActual);
        int edad = tiempo.getYears();
        int mayorEdad = 18;
        return edad >= mayorEdad;
    }

    public static void main(String[] args) {

        System.out.println("------------Datos Personales--------------");
        LocalDate fechaNacimiento = LocalDate.parse("1986-02-15");
        Persona persona1 = new Persona("001","Iromi", 37,fechaNacimiento, "102563897");
        persona1.mostrar();
        System.out.println("Es mayor de edad?:"+ " "+ persona1.esMayorDeEdad());
    }

}

