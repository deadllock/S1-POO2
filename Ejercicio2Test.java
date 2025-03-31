public class Ejercicio2Test {
    public static void main(String[] args) {
        // Crear puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(3, 4);

        // Crear triángulo con estos puntos
        Triangulo t1 = new Triangulo("Triangulo 1", p1, p2, p3);

        System.out.println(t1);
        System.out.println("Area del triangulo: " + t1.calcularArea());
        System.out.println("¿Es un triangulo equilatero?: " + t1.esRegular());

        SuperficiePlana superficie = new SuperficiePlana();
        FiguraGeometrica[] figuras = {t1};
        System.out.println("Area total de las figuras: " + superficie.calcularTotalArea(figuras));
    }
}
