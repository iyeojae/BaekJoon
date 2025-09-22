import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Double chageFormat = Double.valueOf(a/b);
        System.out.printf("%d\n%d\n%d\n%.0f\n%d\n", (a + b), (a - b), (a * b), chageFormat, (a % b));
    }
}
