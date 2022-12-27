import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        Massive ms = new Massive(sc.nextInt());
        ms.numbersTaker(ms.theNumber);
        System.out.println("Выберите необходимую операцию\n1.Суммирование\n2.Умножение\n3.Поделить\n4.Вычитание");
        Massive.userChoice = sc.nextInt();
        System.out.println("Введите диапазон чисел (первое значение имеет индекс 0");
        if (Massive.userChoice == ms.SUM) {
            ms.sum(sc.nextInt(), sc.nextInt());}
        if (Massive.userChoice == ms.MULTIPLICATION) {
            ms.multiplication(sc.nextInt(), sc.nextInt());
        }if (Massive.userChoice == ms.DIVIDE) {
            ms.divide(sc.nextInt(), sc.nextInt());
        }if (Massive.userChoice == ms.SUBTRACTION) {
            ms.subtraction(sc.nextInt(), sc.nextInt());}
        }
    }

