import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        while (true) {
            System.out.print("Which animal would you like to see? Type 'dog' or 'cat': ");
            userChoice = scanner.nextLine().trim().toLowerCase();

            if (userChoice.equals("dog")) {
                System.out.println();
                break;
            } else if (userChoice.equals("cat")) {
                System.out.println();
                break;
            } else {
                System.out.println("Invalid option. Please enter 'dog' or 'cat'.");
            }
        
        }
    }
}