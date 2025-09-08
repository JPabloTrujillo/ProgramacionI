import java.util.Scanner;

public class ProblemasVariables {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el primer valor: ");
        int valorA = entrada.nextInt();

        System.out.print("Escribe el segundo valor: ");
        int valorB = entrada.nextInt();

        if (valorA > valorB) {
            System.out.println("El primer valor es el mayor");
        } else if (valorA < valorB) {
            System.out.println("El primer valor es el menor");
        } else {
            System.out.println("Los dos valores son iguales");
        }
    }
}