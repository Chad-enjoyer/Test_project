import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        Massive.numbers = sc.nextInt();
        System.out.println("Введите числа");
        for (int i = 0; i < Massive.numbersStorage.length; i++){
            Massive.numbersStorage[i] = sc.nextInt();
        }
    }
}