import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    private ArrayList<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;

    @Override
    public void showMenu() {
        System.out.println("\n--- GROCERY STORE MENU ---");
        System.out.println("1. Add food product");
        System.out.println("2. Add household product");
        System.out.println("3. Show all products");
        System.out.println("4. Sell product");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    @Override
    public void handleChoice(int choice) {
        try {
            switch (choice) {
                case 1 -> addFood();
                case 2 -> addHousehold();
                case 3 -> showProducts();
                case 4 -> sellProduct();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addFood() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Expiration date: ");
        String exp = scanner.nextLine();

        products.add(new FoodProduct(id, name, price, qty, exp));
        System.out.println("Food product added");
    }

    private void addHousehold() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Usage type: ");
        String usage = scanner.nextLine();

        products.add(new HouseholdProduct(id, name, price, qty, usage));
        System.out.println("Household product added");
    }

    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No products");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    private void sellProduct() throws InvalidProductException {
        System.out.print("Product ID: ");
        int id = scanner.nextInt();

        System.out.print("Amount: ");
        int amount = scanner.nextInt();

        for (Product p : products) {
            if (p.id == id) {
                p.sell(amount);
                System.out.println("Product sold");
                return;
            }
        }
        throw new InvalidProductException("Product not found");
    }

    public boolean isRunning() {
        return running;
    }
}
