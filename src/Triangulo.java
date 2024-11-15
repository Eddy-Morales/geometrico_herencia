public class Triangulo extends d2{
    double base;
    double altura;

    public Triangulo() {}
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea(){
        System.out.println("area");
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("perimetro");
    }
    public void mostrarDatosTriangulo(){
        System.out.println("datos triangulo");
    }

}
