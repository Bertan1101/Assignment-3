public class MenuManager implements Menu {
    @Override
    public void showMenu() {
        System.out.println("1. Add Chef");
        System.out.println("2. Add Waiter");
        System.out.println("3. Exit");
    }

    @Override
    public void handleChoice(int choice) throws InvalidChoiceException {
        if (choice < 1 || choice > 3) {
            throw new InvalidChoiceException("Invalid menu choice");
        }
        System.out.println("Selected option: " + choice);
    }
}
