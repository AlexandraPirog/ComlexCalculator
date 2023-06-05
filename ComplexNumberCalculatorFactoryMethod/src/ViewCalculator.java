import java.util.Scanner;

public class ViewCalculator {

    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double x = promptInt("Введите действительную часть: ");
            double y = promptInt("введите мнимую часть: ");

            Calculable calculator = calculableFactory.create(x,y);
            //Calculable calculator2 = calculableFactory.create(y);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int x1 = promptInt("Введите второй аргумент действительную часть: ");
                    int y1 = promptInt("Введите второй аргумент мнимую  часть: ");
                    calculator.multiplication(x,y,x1,y1);
                    continue;
                }
                if (cmd.equals("+")) {
                    int x1 = promptInt("Введите второй аргумент действительную часть: ");
                    int y1 = promptInt("Введите второй аргумент мнимую  часть: ");
                    calculator.addition(x,y,x1,y1);
                    continue;
                }
                if (cmd.equals("-")) {
                    int x1 = promptInt("Введите второй аргумент действительную часть: ");
                    int y1 = promptInt("Введите второй аргумент мнимую  часть: ");
                    calculator.subtraction(x,y,x1,y1);
                    continue;
                }
//                if (cmd.equals("/")) {
                    int x1 = promptInt("Введите второй аргумент действительную часть: ");
                    int y1 = promptInt("Введите второй аргумент мнимую  часть: ");
                    calculator.division(x,y,x1,y1);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
