package EmpresaTransporte;

import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public void mostrarMenu() {
        Menu();

    }

    public void Menu() {

        Scanner ScanHD = new Scanner(System.in);
        boolean salir = false;
        int opcionPrincipal;
        System.out.println("Bienvenido a la empresa");

        do {
            System.out.println("[1] Comprar Bus");
            System.out.println("[2] Eliminar Bus");
            System.out.println("[3] Salir");
            opcionPrincipal = ScanHD.nextInt();

            switch (opcionPrincipal) {
                case 1:

                    break;


                case 2:


                    break;

                case 3:
                    salir = true;

                    break;
                default:

            }
        }
        while (!salir);
    }
}