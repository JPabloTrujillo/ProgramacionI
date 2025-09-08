import java.util.Scanner;

public class ProblemasVariables45 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un valor entero: ");
        int valor = teclado.nextInt();

        // Método 1: Usando el operador módulo
        if (valor % 2 == 0) {
            System.out.println(valor + " es par (usando módulo %).");
        } else {
            System.out.println(valor + " es impar (usando módulo %).");
        }

        // Método 2: Usando el último dígito
        int digitoFinal = Math.abs(valor) % 10;
        if (digitoFinal == 0 || digitoFinal == 2 || digitoFinal == 4 || digitoFinal == 6 || digitoFinal == 8) {
            System.out.println(valor + " es par (usando último dígito).");
        } else {
            System.out.println(valor + " es impar (usando último dígito).");
        }

        // Método 3: Usando bitwise AND
        if ((valor & 1) == 0) {
            System.out.println(valor + " es par (usando bitwise AND).");
        } else {
            System.out.println(valor + " es impar (usando bitwise AND).");
        }
    }
}