import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculos vh = new vehiculos();
        int menu, opcion;
            do {
                vh.mostrarMenu(vh);
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Datos del auto 1");
                        String color1, tipo1, modelo1, placa1, marca1;
                        System.out.println("Ingrese la marca del auto: ");
                        marca1 = sc.next();
                        vh.setMarca(marca1);
                        System.out.println("Ingrese el modelo del auto: ");
                        modelo1 = sc.next();
                        vh.setModelo(modelo1);
                        System.out.println("Ingrese el tipo del auto: ");
                        tipo1 = sc.next();
                        vh.setTipo(tipo1);
                        System.out.println("Ingrese el Color del auto: ");
                        color1 = sc.next();
                        vh.setColor(color1);
                        System.out.println("Ingrese el placa del auto: ");
                        placa1 = sc.next();
                        vh.setPlaca(placa1);
                        break;
                    case 2:
                        vh.mostrarDatos(vh);
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

