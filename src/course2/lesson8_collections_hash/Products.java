package course2.lesson8_collections_hash;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Products {
    private String name;
    private double price;
    private double quantity;

    public Products(String name, double price, double quantity) {
            this.name = validateStringValue(name);
            this.price = validateDoubleValue(price);
            this.quantity = validateDoubleValue(quantity);
    }

    @Override
    public String toString() {
        return "\n" + name + ": цена - " + price + " руб, количество - " + quantity + " кг";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 && Double.compare(products.quantity, quantity) == 0 && name.equals(products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    public void addProductList(Set<Products> products){
        if(!products.contains(this)){
            products.add(this);
        } else{
            throw new UnsupportedOperationException("Продукт " + this.getName() +
                    " Уже сеть в списке");
        }
    }

    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return value;
        }
    }
    public double validateDoubleValue (double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else  {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateStringValue(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = validateDoubleValue(price);
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = validateDoubleValue(quantity);
    }
}
