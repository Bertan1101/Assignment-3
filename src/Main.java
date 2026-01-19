import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Menu menu = new MenuManager();
        Scanner scanner = new Scanner(System.in);

        menu.showMenu();
        int choice = scanner.nextInt();

        try {
            menu.handleChoice(choice);
        } catch (InvalidChoiceException e) {
            System.out.println(e.getMessage());
        }
    }
}
