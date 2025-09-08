import java.util.Scanner;

public class ProblemasVariables43 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int b = teclado.nextInt();

        System.out.print("Ingrese el tercer valor: ");
        int c = teclado.nextInt();

        // Calcular el número del medio
        int medio;
        if ((a > b && a < c) || (a < b && a > c)) {
            medio = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            medio = b;
        } else {
            medio = c;
        }

        System.out.println("El número intermedio es: " + medio);
    }
}