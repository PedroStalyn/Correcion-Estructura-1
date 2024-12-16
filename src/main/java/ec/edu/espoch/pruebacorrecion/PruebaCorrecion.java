package ec.edu.espoch.pruebacorrecion;

import ec.edu.espoch.pruebacorrecion.clases.Calculadora;
import java.util.Scanner;

public class PruebaCorrecion {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Calculadora de Suma con Deshacer/Rehacer ---");
            System.out.println("1. Sumar");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar resultado actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para sumar: ");
                    double numero = scanner.nextDouble();
                    calculadora.sumar(numero);
                    break;

                case 2:
                    calculadora.deshacer();
                    break;

                case 3:
                    calculadora.rehacer();
                    break;

                case 4:
                    System.out.println("Resultado actual: " + calculadora.getResultadoActual());
                    break;

                case 5:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();

    }
}
