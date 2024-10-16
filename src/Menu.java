import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    String answer;
    String name;

    double price;

    int expirationDate = 0;
    int warranty = 0;

    boolean isRunning = true;
    boolean hasAdded;

    Catalog catalog = new Catalog();

    public void run() {

        while (isRunning) {
            System.out.println("Hello what do you wanna do with the products?");
            System.out.println("1: Add new product\n2: Show whole catalogue\n3: Quit the program");

            answer = scanner.nextLine();

            if (answer.equals("1")) {
                hasAdded = false;
                while(!hasAdded) {
                    System.out.println("What type of product do you want to add?");
                    System.out.println("1: Food\n2: Electronic\n3: Other");

                    answer = scanner.nextLine();
                    if(answer.equals("1")){
                        while (true) {
                            System.out.println("What is the name of the product?");
                            name = scanner.nextLine();
                            System.out.println("And what is the price?");
                            if (scanner.hasNextDouble()) {
                                price = scanner.nextDouble();
                                scanner.nextLine();
                                hasAdded = true;
                                break;
                            } else {
                                scanner.nextLine();
                                System.out.println("Wrong type of input. Please write a number 1-3");
                            }
                        }
                        catalog.addFood(new Foodproduct(name, price, expirationDate));

                    } else if (answer.equals("2")) {
                        while (true) {
                            System.out.println("What is the name of the product?");
                            name = scanner.nextLine();
                            System.out.println("And what is the price?");
                            if (scanner.hasNextDouble()) {
                                price = scanner.nextDouble();
                                scanner.nextLine();
                                hasAdded = true;
                                break;
                            } else {
                                scanner.nextLine();
                                System.out.println("Wrong type of input. Please write a number 1-3");
                            }
                        }
                        catalog.addElectronic(new Electronicproduct(name, price, warranty));

                    } else if(answer.equals("3")) {
                        while (true) {
                            System.out.println("What is the name of the product?");
                            name = scanner.nextLine();
                            System.out.println("And what is the price?");
                            if (scanner.hasNextDouble()) {
                                price = scanner.nextDouble();
                                scanner.nextLine();
                                hasAdded = true;
                                break;
                            } else {
                                scanner.nextLine();
                                System.out.println("Wrong type of input. Please write a number 1-3");
                            }
                        }
                        catalog.addProduct(new Product(name, price));
                    }
                    else{
                        System.out.println("Wrong type of input. Please write a number 1-3");
                    }
                }

            } else if (answer.equals("2")) {
                while (true) {
                    System.out.println("What type of product do you want to see?" +
                            "\n1: All\n2: Electronic\n3: Food");

                    answer = scanner.nextLine();

                    if(answer.equals("1")) {
                        catalog.showAllProducts();
                        break;
                    } else if (answer.equals("2")) {
                        catalog.showAllElectronics();
                        break;
                    } else if (answer.equals("3")) {
                        catalog.showAllFoods();
                        break;
                    } else {
                        System.out.println("Wrong type of input. Please write a number 1-3");
                    }
                }

            }else if (answer.equals("3")) {

            isRunning = false;

            }
            else {
                System.out.println("Wrong type of input. Please write a number 1-3");
            }
        }
    }
}
