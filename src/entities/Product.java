package entities;

import java.time.format.DateTimeFormatter;

public class Product {
    private String name;
    private Double price;


    public Product() {}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " $" + String.format("%.2f",price));
        return sb.toString();
    }

}
