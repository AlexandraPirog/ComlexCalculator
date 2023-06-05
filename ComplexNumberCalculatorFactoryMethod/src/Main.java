import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<OperationGenerator> generatorList = new ArrayList<>();

        generatorList.add(new SumGenerator());
        generatorList.add(new MinusGenerator());
        generatorList.add(new MultiGenerator());
        generatorList.add(new DivGenerator());

        for (int i = 0; i < 10; i++) {
            int indx = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            OperationGenerator operationGenerator = generatorList.get(indx);
            operationGenerator.runOperation();
        }
    }
}