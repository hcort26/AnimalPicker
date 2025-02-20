import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        while (true) {
            System.out.print("Which animal would you like to see? Type 'dog' or 'cat': ");
            userChoice = scanner.nextLine().trim().toLowerCase();

            if (userChoice.equals("dog")) {
                System.out.println("     |\\_/|                  \n     | @ @   Woof! \n     |   <>              _  \n     |  _/\\------____ ((| |))\n     |               `--\' |   \n ____|_       ___|   |___.\' \n/_/_____/____/_______|");
                break;
            } else if (userChoice.equals("cat")) {
                System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_)  ");
                break;
            } else {
                System.out.println("Invalid option. Please enter 'dog' or 'cat'.");
            }
        
        }
    }
}