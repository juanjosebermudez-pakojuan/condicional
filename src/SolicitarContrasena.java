import java.util.Scanner;

public class SolicitarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Ingresa la contraseña: ");
            contrasena = scanner.nextLine();
        } while (!contrasena.equals("1234"));

        System.out.println("¡Contraseña correcta!");
        scanner.close();
    }
}

