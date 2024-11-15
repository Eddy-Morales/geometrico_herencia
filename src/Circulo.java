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
        System.out.println("area circulo: ");
        return Math.PI * (radio*radio);
    }
    
    public void calcularPerimetroCirculo(){
        System.out.println("perimetro circulo");
    }
    public void mostrarDatosCirculo(){
        System.out.println("datos circulo");
    }
}
