import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в математический quiz!");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a, b;
        int counterAnswers = 0;
        int operation;
        int correctAnswer;
        int userAnswer;

        String[] arrayOperation = {"+", "-", "*", "/", "%"};

        for (int i = 1; i <= 5; i++) {
            a = random.nextInt(101); // случайное число от 0 до 100
            b = random.nextInt(101);
            operation = random.nextInt(5); // случайный выбор операции: 0 - сложение, 1 - вычитание, 2 - умножение, 3 - деление

            correctAnswer = matematicOperation(operation, a, b);

            System.out.println("Вопрос #" + i + ":");
            System.out.println(a + " " + arrayOperation[operation] + " " + b + " = ?");

            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильно!");
                counterAnswers++;
            } else {
                System.out.println("Неправильно. Правильный ответ: " + correctAnswer);
            }
        }

        System.out.println("Игра окончена. Вы ответили правильно на " + counterAnswers + " вопросов из 5.");
    }
    public static int matematicOperation(int operationSymbol, int a, int b){
        switch (operationSymbol) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
            default:
                return a % b;
        }
    }
}

