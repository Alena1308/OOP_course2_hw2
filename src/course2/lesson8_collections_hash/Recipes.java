package course2.lesson8_collections_hash;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private final String name;
    private Set<Products> products = new HashSet<>();
    private double sumPrice;
    private Set<Recipes> recipeList = new HashSet<>();

    public Recipes(String name, Set<Products> products) {
        this.name = name;
        this.products = products;
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
                products + "\n" +
                "Общая сумма: " + findSumPrice() + "\n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    public void addRecipeList (Set<Recipes> recipeList){
        if(!recipeList.contains(this)){
            recipeList.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.getName() +
                    " Уже сеть в списке");
        }
    }

    private double findSumPrice(){
        for (Products product:products) {
            sumPrice += product.getPrice();
        }
        return sumPrice;
    }

    public final String getName() {
        return name;
    }

    public final Set<Products> getProducts() {
        return products;
    }

    public final double getSumPrice() {
        return sumPrice;
    }
}
