package model;

public class Item {
    private String name;
    private Double qty;
    private Double price;
    private String description;

    public Item(String name, Double qty, Double price, String description) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.description = description;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
