package entities;

public final class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName() + " $" + String.format("%.2f", super.getPrice() + customsFee));
        sb.append(" (Customs fee: $" + customsFee + ")");
        return sb.toString();
    }



}


