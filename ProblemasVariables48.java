import java.util.Scanner;

public class ProblemasVariables48{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el primer valor: ");
        int valorA = entrada.nextInt();

        System.out.print("Digite el segundo valor: ");
        int valorB = entrada.nextInt();

        if (valorA % valorB == 0) {
            System.out.println(valorA + " es divisible por " + valorB);
            double resultado = (double) valorA / valorB;
            System.out.println("El cociente es: " + resultado);
        } else if (valorB % valorA == 0) {
            System.out.println(valorB + " es divisible por " + valorA);
            double resultado = (double) valorB / valorA;
            System.out.println("El cociente es: " + resultado);
        } else {
            System.out.println("Ninguno de los dos valores es divisible por el otro.");
        }
    }
}