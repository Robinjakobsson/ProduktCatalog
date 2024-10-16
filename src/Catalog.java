import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold the products
 */
public class Catalog {
   protected List<Product> productList = new ArrayList<>();
   protected List<Foodproduct> foodProductsList = new ArrayList<>();
   protected List<Electronicproduct> electronicProductsList = new ArrayList<>();
   int index = 0 ;

   /**
    * Method to add a product
    * @param product Is the product
    */
   public void addProduct (Product product){
      productList.add(product);
      System.out.println("Product added!");
   }

   /**
    * Method to delete a product
    * @param product is the product
    */
   public void deleteProduct(Product product){
      productList.remove(product);
   }

   /**
    * Method to show all products
    */
   public void showAllProducts(){
      index = 0;
      for (Product p : productList){
         index++;
         System.out.println(index + ". " + p.toString());
      }
      System.out.println("---------");
      showAllElectronics();
      System.out.println("---------");
      showAllFoods();
   }

   /**
    * Method to add a food product to the foodlist
    * @param product Is the product
    */
   public void addFood(Foodproduct product ){
      foodProductsList.add(product);
      System.out.println("Product added!");
   }

   /**
    * Method to add a product to the Electronics list
    * @param product is the product
    */
   public void addElectronic(Electronicproduct product){
      electronicProductsList.add(product);
      System.out.println("Product added!");
   }

   /**
    * Method to show all electronics
    */
   public void showAllElectronics(){

      if (electronicProductsList == null){
         System.out.println("No products to show :(");
      }
      for (Product p : electronicProductsList){
         index++;
         System.out.println(index + ". " +p.toString());
      }
   }

   /**
    * Method to show all foods
    */
   public void showAllFoods(){
      if (foodProductsList == null){
         System.out.println("No food, please fill my stomach");
      }
      for (Product p: foodProductsList){
         index++;
         System.out.println(index + ". " + p.toString());
      }
   }
}
