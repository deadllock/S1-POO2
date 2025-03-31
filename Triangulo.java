public class Triangulo extends FiguraGeometrica {
    private String nombre;
    private Punto punto1, punto2, punto3;

    public Triangulo() {
        this.nombre = "Triángulo Genérico";
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        this.nombre = nombre;
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularArea() {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public boolean esRegular() {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        return lado1 == lado2 && lado2 == lado3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + nombre + " tiene 3 Puntos: " + punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString();
    }
}

