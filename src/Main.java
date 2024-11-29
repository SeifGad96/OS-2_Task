import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st & 2nd name:");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[1];

        System.out.println("first name: " + firstName);
        System.out.println("second name: " + lastName);

    }
}