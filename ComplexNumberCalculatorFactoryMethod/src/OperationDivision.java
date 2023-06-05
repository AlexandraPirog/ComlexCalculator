public class OperationDivision implements iRunOperation {
    @Override
    public void run() {

    }
    /**
     * Деление
     * Z= z1/z2=((x1*x2)+(y1*y2)+ i*(x2y1- x1y2))/(x2*x2 + y2*y2)
     */

    public ComplexNum division(ComplexNum x, ComplexNum y) {
        double denominator = Math.pow(y.getX(), 2) + Math.pow(y.getY(), 2);
        double resultX = (x.getX() * y.getX() + x.getY() * y.getY()) / denominator;
        double resultY = (x.getY() * y.getX() - x.getX() * y.getY()) / denominator;
        return new ComplexNum(resultX, resultY);
    }
}
