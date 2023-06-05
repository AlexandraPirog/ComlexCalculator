public class MultiGenerator extends OperationGenerator{
    @Override
    public iRunOperation createOperation() {
        return new OperationMulti();
    }
}
