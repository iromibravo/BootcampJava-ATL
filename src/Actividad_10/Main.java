import Actividad_10.Cuenta;
import Actividad_10.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Datos Personales----------");
        LocalDate fechaNacimiento1 = LocalDate.parse("1986-02-15");
        Persona persona1 = new Persona("001","Iromi", 37,fechaNacimiento1, "147852369");

        Cuenta cuenta1 = new Cuenta(persona1,0.0);
        cuenta1.mostrar();
        System.out.println("Es mayor de edad?:"+ " "+ persona1.esMayorDeEdad());

        System.out.println("------------Consignación------------");
        cuenta1.ingresar(20000.0);
        cuenta1.mostrarSaldo();

        System.out.println("---------------Retiro---------------");
        cuenta1.retirar(15000.0);
        cuenta1.mostrarSaldo();

        System.out.println("/////////////////////////////////////");

        System.out.println("----------Datos Personales----------");
        LocalDate fechaNacimiento2 = LocalDate.parse("2007-02-15");
        Persona persona2 = new Persona("002","Lucas", 16,fechaNacimiento2, "102563897");

        Cuenta cuenta2 = new Cuenta(persona2,1000.0);
        cuenta2.mostrar();
        System.out.println("Es mayor de edad?:"+ " "+ persona2.esMayorDeEdad());


        System.out.println("------------Consignación------------");
        cuenta2.ingresar(-100.0);
        cuenta2.mostrarSaldo();

        System.out.println("---------------Retiro---------------");
        cuenta2.retirar(1540.5);
        cuenta2.mostrarSaldo();
    }

}