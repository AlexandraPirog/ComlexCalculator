public class DivGenerator extends OperationGenerator{
    @Override
    public iRunOperation createOperation() {
        return new OperationDivision();
    }
}
