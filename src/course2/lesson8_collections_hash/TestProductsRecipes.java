package course2.lesson8_collections_hash;

import java.util.HashSet;
import java.util.Set;

public class TestProductsRecipes {
    public static void main(String[] args) {
        Products p1 = new Products("Картофель", 50, 3);
        Products p2 = new Products("Огурцы", 70, 1);
        Products p3 = new Products("Морковь", 35, 1);
        Products p4 = new Products("Помидоры", 200, 1);
        Products p5 = new Products("Стиральный порошок", 150, 3);
        Products p6 = new Products("Капуста", 30, 2);
        Products p7 = new Products("Сахар", 70, 0.5);
        Products p8 = new Products("Мука", 75, 2);
        Products p9 = new Products("Лук", 39, 0.5);
        Products p10 = new Products("Свинная шея", 330, 1.5);
        Products p11 = new Products("Картофель", 50, 3);

        Set<Products> productsList = new HashSet<>();
        p1.addProductList(productsList);
        p2.addProductList(productsList);
        p3.addProductList(productsList);
        p10.addProductList(productsList);
        System.out.println("Лист1 " + productsList);
        productsList.remove(p2);

        Set<Products> productsList2 = new HashSet<>();
        p4.addProductList(productsList2);
        p5.addProductList(productsList2);
        p6.addProductList(productsList2);

        Set<Products> productsList3 = new HashSet<>();
        p7.addProductList(productsList3);
        p8.addProductList(productsList3);
        p9.addProductList(productsList3);

        Recipes recipe1 = new Recipes("Рецепт1", productsList);
        Recipes recipe2 = new Recipes("Рецепт2", productsList2);
        Recipes recipe3 = new Recipes("Рецепт3", productsList);

        Set<Recipes> recipeList = new HashSet<>();
        recipe1.addRecipeList(recipeList);
        recipe2.addRecipeList(recipeList);
        recipe3.addRecipeList(recipeList);
        System.out.println(recipeList);
        System.out.println("===========================================");

    }

}
