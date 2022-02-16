import java.util.Scanner;

class table {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter  a number: ");

        int n = s.nextInt();

        int multiplication;

        System.out.println("Multiplication Table of " + n + " : ");

        for (int i = 1; i <= 20; i++) {

            multiplication = n * i;

            System.out.println(n + " * " + i + " = " + multiplication);
        }
    }
}