import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    String answer;
    String name;

    double price;

    boolean isRunning = true;

    Catalog catalog = new Catalog();

    public void run() {

        while (isRunning) {
            System.out.println("Hello what do you wanna do with the products?");
            System.out.println("1: Add new product\n2: Show whole catalogue\n3: Quit the program");

            answer = scanner.nextLine();

            if (answer.equals("1")) {
                System.out.println("What product do you want to add?");
                name = scanner.nextLine();
                while (true) {
                    System.out.println("And what is the price?");
                    if (scanner.hasNextDouble()) {
                        price = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                    } else {
                        scanner.nextLine();
                        System.out.println("Wrong type of input. Please write a number");
                    }
                }
                catalog.addProduct(new Product(name, price));

            } else if (answer.equals("2")) {
                catalog.showAllProducts();

            }else if (answer.equals("3")) {

            isRunning = false;

            }
            else {
                System.out.println("Wrong input");
            }
        }
    }
}
