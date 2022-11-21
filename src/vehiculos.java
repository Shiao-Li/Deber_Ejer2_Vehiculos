public class vehiculos {
    String color, tipo, modelo, placa, marca;
    public vehiculos(){
        color=" ";
        tipo=" ";
        modelo=" ";
        marca=" ";
        placa=" ";

    }

    public void mostrarMenu(vehiculos vh) {
        System.out.println("****MENU****");
        System.out.println("1. Ingresar datos ");
        System.out.println("2. Mostrar datos");
    }
    public void mostrarDatos(vehiculos vh){
        System.out.println("\t\tDatos del auto 1");
        System.out.println("\nColor: " + vh.color);
        System.out.println("Modelo: " + vh.modelo);
        System.out.println("Tipo: " + vh.tipo);
        System.out.println("Placa: " + vh.placa);
        System.out.println("Marca: " + vh.marca);
    }
    public  void mostrarDatos2(vehiculos vh1){
        System.out.println("\t\tDatos del auto 2");
        System.out.println("\nColor: " + vh1.color);
        System.out.println("Modelo: " + vh1.modelo);
        System.out.println("Tipo: " + vh1.tipo);
        System.out.println("Placa: " + vh1.placa);
        System.out.println("Marca: " + vh1.marca);
    }
    public  void mostrarDatos3(vehiculos vh2){
        System.out.println("\t\tDatos del auto 2");
        System.out.println("\nColor: " + vh2.color);
        System.out.println("Modelo: " + vh2.modelo);
        System.out.println("Tipo: " + vh2.tipo);
        System.out.println("Placa: " + vh2.placa);
        System.out.println("Marca: " + vh2.marca);
    }
    public  void mostrarDatos4(vehiculos vh3){
        System.out.println("\t\tDatos del auto 2");
        System.out.println("\nColor: " + vh3.color);
        System.out.println("Modelo: " + vh3.modelo);
        System.out.println("Tipo: " + vh3.tipo);
        System.out.println("Placa: " + vh3.placa);
        System.out.println("Marca: " + vh3.marca);
    }
    public  void mostrarDatos5(vehiculos vh4){
        System.out.println("\t\tDatos del auto 2");
        System.out.println("\nColor: " + vh4.color);
        System.out.println("Modelo: " + vh4.modelo);
        System.out.println("Tipo: " + vh4.tipo);
        System.out.println("Placa: " + vh4.placa);
        System.out.println("Marca: " + vh4.marca);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
