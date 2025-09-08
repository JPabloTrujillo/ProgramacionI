import java.util.Scanner;

public class ProblemasVariables44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un valor: ");
        int valor = entrada.nextInt();

        if (valor >= 0) {
            double resultado = Math.sqrt(valor);
            System.out.println("La raíz cuadrada de " + valor + " es: " + resultado);
        } else {
            System.out.println("Error: no es posible calcular la raíz de un número negativo.");
        }
    }
}