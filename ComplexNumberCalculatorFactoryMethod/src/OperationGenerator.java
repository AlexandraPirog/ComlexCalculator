public abstract class OperationGenerator {
    public void runOperation()
    {
        iRunOperation operation = createOperation();
        operation.run();
    }

    public abstract iRunOperation createOperation();
}
