public class Calculator implements Calculable{

    @Override
    public Object addition(Object x, Object y, Object x1, Object y1) {
        return new SumGenerator();
    }

    @Override
    public Object subtraction(Object x, Object y, Object x1, Object y1) {
        return new MinusGenerator();
    }

    @Override
    public Object multiplication(Object x, Object y, Object x1, Object y1) {
        return new MultiGenerator();
    }

    @Override
    public Object division(Object x, Object y, Object x1, Object y1) {
        return new DivGenerator();
    }

    @Override
    public int getResult() {
        return ;
    }
}
