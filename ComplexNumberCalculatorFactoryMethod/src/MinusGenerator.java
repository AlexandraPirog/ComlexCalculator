public class MinusGenerator extends OperationGenerator{
    @Override
    public iRunOperation createOperation() {
        return new OperationMinus();
    }
}
