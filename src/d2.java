public class d2 extends FigurasGeometricas{

    int nlados;
    public d2() {}
    public d2(double lado, int nlados) {
        this.nlados = nlados;
    }
    public int getNlados() {
        return nlados;
    }
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void calcularArea(){
        System.out.println("area 2d");
    }
    public void calcularPerimetro(){
        System.out.println("perimetro");
    }
    public void mostrarDatos2d(){
        System.out.println("datos 2d");
    }


}
