public class Foodproduct extends Product{

    private int expirationTime;


    public Foodproduct(String name, double price) {
        super(name, price);
    }

    public Foodproduct(String name, double price, int expirationTime) {
        super(name, price);
        this.expirationTime = expirationTime;
    }

    public int getExpirationTime() {
        return expirationTime;
    }

    @Override
    public String toString() {
        return "Foodproduct{" +
                "expirationTime=" + expirationTime +
                "} " + super.toString();
    }
}
