import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculos vh = new vehiculos();
        vehiculos vh1 = new vehiculos();
        vehiculos vh2 = new vehiculos();
        vehiculos vh3 = new vehiculos();
        vehiculos vh4 = new vehiculos();

        int menu, opcion;
            do {
                vh.mostrarMenu(vh);
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("\t\tDatos del auto 1");
                        String color1, tipo1, modelo1, placa1, marca1;
                        System.out.println("\nIngrese la marca del auto: ");
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

                        System.out.println("\n\t\tDatos del auto 2");
                        String color2, tipo2, modelo2, placa2, marca2;
                        System.out.println("\nIngrese la marca del auto: ");
                        marca2 = sc.next();
                        vh1.setMarca(marca2);
                        System.out.println("Ingrese el modelo del auto: ");
                        modelo2 = sc.next();
                        vh1.setModelo(modelo2);
                        System.out.println("Ingrese el tipo del auto: ");
                        tipo2 = sc.next();
                        vh1.setTipo(tipo2);
                        System.out.println("Ingrese el Color del auto: ");
                        color2 = sc.next();
                        vh1.setColor(color2);
                        System.out.println("Ingrese el placa del auto: ");
                        placa2 = sc.next();
                        vh1.setPlaca(placa2);

                        System.out.println("\n\t\tDatos del auto 3");
                        String color3, tipo3, modelo3, placa3, marca3;
                        System.out.println("\nIngrese la marca del auto: ");
                        marca3 = sc.next();
                        vh2.setMarca(marca3);
                        System.out.println("Ingrese el modelo del auto: ");
                        modelo3 = sc.next();
                        vh2.setModelo(modelo3);
                        System.out.println("Ingrese el tipo del auto: ");
                        tipo3 = sc.next();
                        vh2.setTipo(tipo3);
                        System.out.println("Ingrese el Color del auto: ");
                        color3 = sc.next();
                        vh2.setColor(color3);
                        System.out.println("Ingrese el placa del auto: ");
                        placa3 = sc.next();
                        vh2.setPlaca(placa3);

                        System.out.println("\n\t\tDatos del auto 4");
                        String color4, tipo4, modelo4, placa4, marca4;
                        System.out.println("\nIngrese la marca del auto: ");
                        marca4 = sc.next();
                        vh3.setMarca(marca4);
                        System.out.println("Ingrese el modelo del auto: ");
                        modelo4 = sc.next();
                        vh3.setModelo(modelo4);
                        System.out.println("Ingrese el tipo del auto: ");
                        tipo4 = sc.next();
                        vh3.setTipo(tipo4);
                        System.out.println("Ingrese el Color del auto: ");
                        color4 = sc.next();
                        vh3.setColor(color4);
                        System.out.println("Ingrese el placa del auto: ");
                        placa4 = sc.next();
                        vh3.setPlaca(placa4);

                        System.out.println("\n\t\tDatos del auto 5");
                        String color5, tipo5, modelo5, placa5, marca5;
                        System.out.println("\nIngrese la marca del auto: ");
                        marca5 = sc.next();
                        vh4.setMarca(marca5);
                        System.out.println("Ingrese el modelo del auto: ");
                        modelo5 = sc.next();
                        vh4.setModelo(modelo5);
                        System.out.println("Ingrese el tipo del auto: ");
                        tipo5 = sc.next();
                        vh4.setTipo(tipo5);
                        System.out.println("Ingrese el Color del auto: ");
                        color5 = sc.next();
                        vh4.setColor(color5);
                        System.out.println("Ingrese el placa del auto: ");
                        placa5 = sc.next();
                        vh4.setPlaca(placa5);
                        break;
                    case 2:
                        vh.mostrarDatos(vh);
                        vh1.mostrarDatos2(vh1);
                        vh2.mostrarDatos3(vh2);
                        vh3.mostrarDatos4(vh3);
                        vh4.mostrarDatos5(vh4);
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

