public interface Menu {
    void showMenu();

    void handleChoice(int choice) throws InvalidChoiceException;
}
