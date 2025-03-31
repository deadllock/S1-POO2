public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos Getter y Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto otro) {
        return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
    }

    public double calcularDistancia() {
        return calcularDistancia(new Punto(0, 0));
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + x + ", " + y;
    }
}

