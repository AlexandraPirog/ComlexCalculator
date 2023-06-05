public class OperationMinus implements iRunOperation {
    @Override
    public void run() {
    }
    /**
     * Вычитание
     * z = x + iy
     * Z = z - z = ( x - x ) +(y - y) * i
     */
    public ComplexNum subtraction(ComplexNum x, ComplexNum y) {
        double resultX = (x.getX() - y.getX());
        double resultY = (x.getY() - y.getY());
        return new ComplexNum(resultX, resultY);

    }
}
