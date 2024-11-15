//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FigurasGeometricas figuras = new FigurasGeometricas();

        d2 figura2D1 = new d2();
        figura2D1.mostrarDatos2d();
        figura2D1.mostrarDatos();

        d3 figura3D1 = new d3();
        figura3D1.mostrarDatos3d();
        figura3D1.mostrarDatos();

        Circulo circulo1 = new Circulo();
        circulo1.mostrarDatosCirculo();

    }
}