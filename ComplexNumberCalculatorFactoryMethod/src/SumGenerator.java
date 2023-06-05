public class SumGenerator extends OperationGenerator{
    @Override
    public iRunOperation createOperation() {
        return new OperationSum();
    }
}
