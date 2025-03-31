public class SuperficiePlana {
    public double calcularTotalArea(FiguraGeometrica[] figuras) {
        double totalArea = 0;
        for (FiguraGeometrica figura : figuras) {
            totalArea += figura.calcularArea();
        }
        return totalArea;
    }
}