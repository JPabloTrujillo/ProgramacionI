import java.util.Scanner;

public class CuatroPuntoCatorce {

     private static final int PISO_MINIMO = 1;
    private static final int PISO_MAXIMO = 25;
    private static int pisoActual = 1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int destino;

        System.out.println("Simulación de Ascensor - 25 Pisos");

        while (true) {
            System.out.println("El ascensor está en el piso: " + pisoActual);
            mostrarOpciones();

            System.out.print("Ingrese el piso de destino (1-25), o 0 para salir: ");
            destino = scanner.nextInt();

            if (destino == 0) {
                System.out.println("Saliendo de la simulación...");
                break;
            }

            if (destino < PISO_MINIMO || destino > PISO_MAXIMO) {
                System.out.println("Piso inválido. Intente de nuevo.");
                continue;
            }

            moverAscensor(destino);
        }

        scanner.close();
    }

    private static void mostrarOpciones() {
        if (pisoActual == PISO_MINIMO) {
            System.out.println("Botón disponible: SUBIR");
        } else if (pisoActual == PISO_MAXIMO) {
            System.out.println("Botón disponible: BAJAR");
        } else {
            System.out.println("Botones disponibles: SUBIR y BAJAR");
        }
    }

    private static void moverAscensor(int destino) {
        if (destino == pisoActual) {
            System.out.println("Ya estás en el piso " + destino);
        } else if (destino > pisoActual) {
            System.out.println("Subiendo...");
            for (int i = pisoActual + 1; i <= destino; i++) {
                System.out.println("Piso " + i);
                esperar();
            }
        } else {
            System.out.println("Bajando...");
            for (int i = pisoActual - 1; i >= destino; i--) {
                System.out.println("Piso " + i);
                esperar();
            }
        }

        pisoActual = destino;
        System.out.println("Llegaste al piso " + pisoActual);
    }

    // Simula el tiempo de movimiento entre pisos
    private static void esperar() {
        try {
            Thread.sleep(500); // 0.5 segundos entre pisos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
