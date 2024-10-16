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
      for (Product p : productList){
         System.out.println(p.toString());
      }
   }
}
