import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в математический quiz!");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a, b;
        int counterAnswers;
        int operation;
        int correctAnswer;
        int userAnswer;

        String[] arrayOperation = {"+", "-", "*", "/", "%"};
        System.out.println("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();
        String[] arrayNameOfPlayers = new String[numberOfPlayers];
        int[] arrayCounters = new int[numberOfPlayers];

        arrayNameOfPlayers = acquaintanceWithPlayers(arrayNameOfPlayers, scanner);


        for (int i = 0; i < numberOfPlayers ; i++) {
            System.out.println("Вопросы игроку " + arrayNameOfPlayers[i] +"\n");
            counterAnswers = 0;
            for (int numberOfQuestion = 1; numberOfQuestion <= 5; numberOfQuestion++) {
                a = random.nextInt(101); // случайное число от 0 до 100
                b = random.nextInt(101);
                operation = random.nextInt(5); // случайный выбор операции: 0 - сложение, 1 - вычитание, 2 - умножение, 3 - деление

                correctAnswer = matematicOperation(operation, a, b);

                System.out.println("Вопрос #" + numberOfQuestion + ":");
                System.out.println(a + " " + arrayOperation[operation] + " " + b + " = ?");

                userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Правильно!");
                    counterAnswers += 5;
                } else {
                    counterAnswers -= 5;
                    System.out.println("Неправильно. Правильный ответ: " + correctAnswer);
                }
            }
            arrayCounters[i] = counterAnswers;
        }

        whoIsWinner(arrayNameOfPlayers, arrayCounters);
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
    public static String[] acquaintanceWithPlayers(String[] arrayList, Scanner scanner) {
        for(int i = 0; i < arrayList.length; i++) {
            System.out.println("игрок " + (i+1) + " представьтесь ");
            arrayList[i] = scanner.next();
        }
        return arrayList;
    }
    public static void whoIsWinner(String[] arrayNames, int[] arrayCounters) {
        int index = 0;
        int someValue;
        String name;
        for (int i = 0; i < arrayCounters.length -1; i++) {
            index = i;
            for (int j = i+1; j < arrayCounters.length; j++) {
                if(arrayCounters[i] < arrayCounters[j] && arrayCounters[index] < arrayCounters[j]) {
                    index = j;
                }
            }
            someValue = arrayCounters[i];
            arrayCounters[i] = arrayCounters[index];
            arrayCounters[index] = someValue;

            name = arrayNames[i];
            arrayNames[i] = arrayNames[index];
            arrayNames[index] = name;
        }

        for (int i = 0; i < arrayNames.length ; i++) {
            System.out.println(arrayNames[i] + " набрал " + arrayCounters[i] + " очков");
        }
    }
}

