public interface StoreMenu {

    void showMenu();

    void handleChoice(int choice) throws InvalidChoiceException;
}
