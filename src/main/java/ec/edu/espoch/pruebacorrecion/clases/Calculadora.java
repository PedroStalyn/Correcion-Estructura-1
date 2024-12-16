
package ec.edu.espoch.pruebacorrecion.clases;
import java.util.Stack;

public class Calculadora {
    private Stack<Double> pilaResultados;
    private Stack<Double> pilaRehacer;

    public Calculadora() {
        pilaResultados = new Stack<>();
        pilaRehacer = new Stack<>();
        pilaResultados.push(0.0); // Resultado inicial
    }

    // Método para sumar un número al resultado actual
    public void sumar(double numero) {
        double resultadoActual = pilaResultados.peek();
        double nuevoResultado = resultadoActual + numero;

        pilaResultados.push(nuevoResultado);
        pilaRehacer.clear(); // Limpiar pila de rehacer al realizar una nueva operación
        System.out.println("Resultado actual: " + nuevoResultado);
    }

    // Método para deshacer la última operación
    public void deshacer() {
        if (pilaResultados.size() > 1) {
            pilaRehacer.push(pilaResultados.pop());
            System.out.println("Deshacer realizado. Resultado actual: " + pilaResultados.peek());
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }

    // Método para rehacer una operación deshecha
    public void rehacer() {
        if (!pilaRehacer.isEmpty()) {
            pilaResultados.push(pilaRehacer.pop());
            System.out.println("Rehacer realizado. Resultado actual: " + pilaResultados.peek());
        } else {
            System.out.println("No hay operaciones para rehacer.");
        }
    }

    // Método para mostrar el resultado actual
    public double getResultadoActual() {
        return pilaResultados.peek();
    }
}
