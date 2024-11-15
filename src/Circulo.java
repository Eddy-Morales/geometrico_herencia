public class Circulo extends d2{
    double radio;

    public Circulo() {}
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroCirculo( double radio){
        return 2 * Math.PI * radio;
    }
    public void mostrarDatosCirculo(){
        System.out.println("datos circulo:");
        System.out.println("Area: "+calcularAreaCirculo(radio));
        System.out.println("Perimetro: "+calcularPerimetroCirculo(radio));
    }
}
