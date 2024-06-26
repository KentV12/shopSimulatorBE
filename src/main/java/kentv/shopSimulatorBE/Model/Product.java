package kentv.shopSimulatorBE.Model;

public class Product {
    private String name;
    private double price;
    private String category;
    private String imageLink;

    public Product(String name, double price, String category, String imageLink) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
