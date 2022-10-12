package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{

    LocalDate manufactureDate;
    public DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName() + "(used) $" + String.format("%.2f", super.getPrice()));
        sb.append(" (Manufacture date: " + manufactureDate.format(df) + ")");
        return sb.toString();
    }
}
