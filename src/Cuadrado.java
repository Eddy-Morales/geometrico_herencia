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
    @Override
    public void calcularArea(){
        System.out.println("area");
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("volumen");
    }
    public void mostrarDatosCuadrado(){
        System.out.println("datos cuadrado");
    }
}
