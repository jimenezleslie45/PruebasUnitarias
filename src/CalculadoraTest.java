import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(5, 3);
        assertEquals(8, resultado, 0);
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        double resultado = calc.resta(10, 4);
        assertEquals(6, resultado, 0);
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicacion(2, 3);
        assertEquals(6, resultado, 0);
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        double resultado = calc.division(10, 2);
        assertEquals(5, resultado, 0);
    }
}

class Calculadora {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.suma(num1, num2));
        System.out.println("Resta: " + calc.resta(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicacion(num1, num2));
        try {
            System.out.println("División: " + calc.division(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

