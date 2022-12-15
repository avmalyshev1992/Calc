import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        char calculatorOprrator ='c';
        double result = 0;

        do {
            if(calculatorOprrator == 'c') {
                System.out.print("Введите первое значение: ");
                val1 = scanner.nextDouble();
                System.out.print("Введите оператор: ");
                operand = scanner.next().charAt(0);
            } else {
                val1 = result;
                operand = calculatorOprrator;
            }

            System.out.print("Введите второе значение: ");
            val2 = scanner.nextDouble();

            result =  calcylate(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " " + "=" + " " + result);
            calculatorOprrator = scanner.next().charAt(0);
        } while (calculatorOprrator != 's');


    }
    public static double calcylate(double val1, double val2, char operand) {
        return switch (operand){
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println(" Ты делаешь что-то не так ");
                yield 0;
            }

        };
    }
}