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
        System.out.println("\nColor: " + vh.color);
        System.out.println("Modelo: " + vh.modelo);
        System.out.println("Tipo: " + vh.tipo);
        System.out.println("Placa: " + vh.placa);
        System.out.println("Marca: " + vh.marca);
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
