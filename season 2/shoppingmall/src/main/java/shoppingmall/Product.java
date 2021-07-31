package shoppingmall;

public class Product {
    private String name;
    private int price;
    private int inventory;

    public Product() {

    }

    public Product(String name, int price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }
}
