import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number, n = 1;

        System.out.print("Sayı giriniz => ");
        number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            for (int k = 0; k < (number * 2) - n; k++)
                System.out.print("*");

            System.out.println();
            n += 2;

        }

    }
}
