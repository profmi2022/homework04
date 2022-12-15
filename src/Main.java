import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] payArray = new int[30];
        for (int i = 0; i < payArray.length; i++) {
            payArray[i] = random.nextInt(100_000) + 100_000;
        }
        return payArray;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] payArray = generateRandomArray();

        System.out.println(Arrays.toString(payArray));

        int paySum = 0;
        for (int pay : payArray) {
            paySum += pay;
        }
        System.out.println("Сумма трат за месяц составила " + paySum + " рублей");

        System.out.println("Задача 2");

        int payMax = Integer.MIN_VALUE;
        int payMin = Integer.MAX_VALUE;

        for (int pay : payArray) {

            if (pay > payMax) {
                payMax = pay;
            }
            if (pay < payMin) {
                payMin = pay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + payMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + payMax + " рублей");

        System.out.println("Задача 3");

        double payAverage = (double) paySum / payArray.length;

        System.out.println("Средняя сумма трат за месяц составила " + payAverage + " рублей");

        }

    public static void task2() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }
    }
}