public class d3 extends FigurasGeometricas{
    double lado;
    int nlados;
    int ncaras;

    public d3() {}
    public d3(double lado, int ncaras, int nlados) {
        this.lado = lado;
        this.ncaras = ncaras;
        this.nlados = nlados;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public int getNcaras() {
        return ncaras;
    }
    public void setNcaras(int ncaras) {
        this.ncaras = ncaras;
    }
    public int getNlados() {
        return nlados;
    }
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void calcularArea(){
        System.out.println("area 3d");
    }
    public void calcularVolumen(){
        System.out.println("volumen");
    }
    public void mostrarDatos3d(){
        System.out.println("datos 3d");
    }
}
