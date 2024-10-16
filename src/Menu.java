import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    String answer;
    String name;
    int price;

    Catalog catalog = new Catalog();

    public void run() {

        System.out.println("Hello what do you wanna do with the products?");
        System.out.println("1: Add new product\n2: Show whole catalogue\n3: Remove Product");

        answer = scanner.nextLine();

        if (answer.equals("1")) {
            System.out.println("What product do you want to add?");
            name = scanner.nextLine();
            System.out.println("And what is the price?");
            if(scanner.hasNextInt())
            {

            }

            catalog.addProduct(new Product(name, price));

        } else if (answer.equals("2")) {
            catalog.showAllProducts();

        }/* else if (answer.equals("3")) {
            catalog.deleteProduct();

        }*/ else {
            System.out.println("Wrong input");
        }



    }
}
