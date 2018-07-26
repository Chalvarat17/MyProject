package models;

/**
 * Created by ASUS on 12/7/2561.
 */
public class Notebook {
    private String id, name, brand;
    private double Price;
    private int amount;

    public Notebook() {
    }

    public Notebook(String id, String name, String brand, double price, int amount) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        Price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
