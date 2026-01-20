public class StoreMenuManager implements StoreMenu {

    @Override
    public void showMenu() {
        System.out.println("1. Add food product");
        System.out.println("2. Add household product");
        System.out.println("3. Exit");
    }

    @Override
    public void handleChoice(int choice) throws InvalidChoiceException {
        switch (choice) {
            case 1:
                System.out.println("Food product added (demo)");
                break;
            case 2:
                System.out.println("Household product added (demo)");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                throw new InvalidChoiceException("Invalid menu choice");
        }
    }
}
