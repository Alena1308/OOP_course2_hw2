package course2.lesson8_collections_hash;

import java.util.*;

public class Recipes {
    private final String name;
    private Map<Products, Integer> productsList;
    private double sumPrice;

    public Recipes(String name) {
        this.name = name;
        this.productsList = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return name.equals(recipes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "\n" + name + "\n" +
                "Список продуктов: " + "\n" +
                productsList + "\n" +
                "Общая сумма: " + sumPrice + "\n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n";
    }

    public void addProductInRecipes (Products products, Integer amount) {
        amount = amount == 0 ? 1 : amount;
        this.productsList.put(products, amount);
        for (Products product : this.productsList.keySet() ) {
            this.sumPrice += product.getPrice() * this.productsList.get(product);
        }
    }

    public final String getName() {
        return name;
    }

    public final Map<Products, Integer> getProductsList() {
        return productsList;
    }

    public final double getSumPrice() {
        return sumPrice;
    }
}
