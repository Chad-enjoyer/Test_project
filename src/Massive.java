import java.util.Scanner;
public class Massive {
    int SUM = 1;
    int MULTIPLICATION = 2;
    int DIVIDE = 3;
    int SUBTRACTION = 4;
    Scanner sc = new Scanner(System.in);
    static int userChoice;
    int theNumber;
    public int[] numbersStorage;
    public Massive(int number) {
        this.theNumber = number;
        numbersStorage = new int[theNumber];
    }
    public void numbersTaker(int a) {
        System.out.println("Введите числа");
        for (int i = 0; i < a; i++) {
            numbersStorage[i] = sc.nextInt();
        }
    }

    void divide(int a , int b) {
        double divider = numbersStorage[a];
        for (int c = a; c < b; c++) {
            divider = divider / numbersStorage[c + 1];
        }
        System.out.println(divider);
    } // Dividing methode for chosen numbers
    void sum(int a, int b) {
        double sumNumbers = numbersStorage[a];
        for (int c = a; c < b; c++) {
            sumNumbers = sumNumbers + numbersStorage[a];
        }
        System.out.println(sumNumbers);
    } // Sum methode for chosen numbers
    void multiplication(int a, int b) {
        double multiplication = numbersStorage[a];
        for (int c = a; c < b; c++) {
            multiplication = multiplication * numbersStorage[c+1];
        }
        System.out.println(multiplication);
    } // Multiplication methode for chosen numbers
    void subtraction(int a, int b) {
        double subtract = 0;
        for (int c = a; c < b; c++) {
            subtract = subtract * numbersStorage[c];
        }
        System.out.println(subtract);
    }  // Subtraction methode for chosen numbers
}