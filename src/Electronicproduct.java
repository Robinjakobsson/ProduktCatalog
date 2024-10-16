public class Electronicproduct extends  Product {

    private int warranty;

    public Electronicproduct(String name, double price) {
        super(name, price);
    }

    public Electronicproduct(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Warranty: " + warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}
