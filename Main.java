import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            System.out.println("Bienvenido al Conversor de Monedas");
            System.out.println("1. USD a ARS");
            System.out.println("2. ARS a USD");
            System.out.println("3. BRL a USD");
            System.out.println("4. USD a BRL");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double amount = scanner.nextDouble();
            double result = 0.0;

            try {
                switch (option) {
                    case 1:
                        result = converter.convert("USD", "ARS", amount);
                        System.out.println("Resultado: " + result + " ARS");
                        break;
                    case 2:
                        result = converter.convert("ARS", "USD", amount);
                        System.out.println("Resultado: " + result + " USD");
                        break;
                    case 3:
                        result = converter.convert("BRL", "USD", amount);
                        System.out.println("Resultado: " + result + " USD");
                        break;
                    case 4:
                        result = converter.convert("USD", "BRL", amount);
                        System.out.println("Resultado: " + result + " BRL");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al convertir moneda: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
