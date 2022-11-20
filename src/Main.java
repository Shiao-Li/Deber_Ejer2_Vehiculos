import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculos vh = new vehiculos();
        int menu, opcion;
            do {
                vehiculos.mostrarMenu(vh);
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:

                        break;
                    case 2:

                        break;

                    default:
                        System.out.println("Opcion no disponible!!!!!");
                        break;
                }
                System.out.println("Desea continuar con el programa 1.SI");
                opcion = sc.nextInt();
            } while (opcion == 1);
    }

}

