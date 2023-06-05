public class OperationMulti implements iRunOperation {
    @Override
    public void run() {

    }
    /**
     * Умножение
     * z = x + iy
     * Z = z * z = (( x * x ) - (y * y)) +(( x * y ) + ( y * x ) * i)
     */
    public ComplexNum multiplication(ComplexNum x, ComplexNum y) {
        double resultX = (x.getX() * y.getX()) - (x.getY() * y.getY());
        double resultY = (x.getX() * y.getY()) + (x.getY() * y.getX());
        return new ComplexNum(resultX, resultY);
    }
}
