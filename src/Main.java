import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MenuManager manager = new MenuManager();
        Scanner scanner = new Scanner(System.in);

        while (manager.isRunning()) {
            manager.showMenu();
            int choice = scanner.nextInt();
            manager.handleChoice(choice);
        }

        System.out.println("Program finished");
    }
}
