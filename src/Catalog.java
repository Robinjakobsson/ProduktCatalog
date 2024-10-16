import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold the products
 */
public class Catalog {
   protected List<Product> productList = new ArrayList<>();


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
      int index = 0;
      for (Product p : productList){
         index++;
         System.out.println(index + ". " + p.toString());
      }
   }
}
