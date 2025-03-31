public class Circulo2 {
    private double radio2;
    private String color2;

    // Constructor por defecto
    public Circulo2() {
        this(12.5, "azul");
    }

    // Constructor con parámetros
    public Circulo2(double radio2, String color2) {
        this.setRadio2(radio2);
        this.setColor2(color2);
    }

    // Métodos Getter y Setter
    public double getRadio2() {
        return radio2;
    }

    public void setRadio2(double radio2) {
        this.radio2 = radio2;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public double getArea2() {
        return radio2 * radio2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo2 [radio=" + radio2 + ", color=" + color2 + ", área=" + getArea2() + "]";
        }
    }