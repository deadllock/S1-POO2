public class CirculoTest {
    public static void main(String[] args) {

        Circulo newCirculo = new Circulo(8.75);

        System.out.println("Nuevo Radio: " + newCirculo.getRadio());
        System.out.println("Nuevo Área: " + newCirculo.getArea());

        // =================================================================================
        Circulo circulo1 = new Circulo();
        System.out.println("Radio: " + circulo1.getRadio() + ", Area: " + circulo1.getArea());

        Circulo circulo2 = new Circulo(6.55);
        System.out.println("Radio: " + circulo2.getRadio() + ", Area: " + circulo2.getArea());
    }
}