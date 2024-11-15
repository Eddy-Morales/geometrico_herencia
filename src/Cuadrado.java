public class Cuadrado extends d2{
    double lado;

    public Cuadrado() {}
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }
    public void mostrarDatosCuadrado(){
        System.out.println("datos cuadrado:");
        System.out.println("Area: " + calcularAreaCuadrado(lado));
        System.out.println("Perimetro: " + calcularPerimetroCuadrado(lado));
    }
}
