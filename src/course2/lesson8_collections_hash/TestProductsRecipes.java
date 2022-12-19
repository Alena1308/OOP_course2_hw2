package course2.lesson8_collections_hash;

import java.util.HashMap;
import java.util.Map;

public class TestProductsRecipes {
    public static void main(String[] args) {
        Products p1 = new Products("Картофель", 50);
        Products p2 = new Products("Огурцы", 70);
        Products p3 = new Products("Морковь", 35);
        Products p4 = new Products("Помидоры", 200);
        Products p5 = new Products("Стиральный порошок", 150);
        Products p6 = new Products("Капуста", 30);
        Products p7 = new Products("Сахар", 70);
        Products p8 = new Products("Мука", 75);
        Products p9 = new Products("Лук", 39);
        Products p10 = new Products("Свинная шея", 330);
        Products p11 = new Products("Картофель", 50);

        System.out.println("---------------------------------------------------------------");
        System.out.println("УРОК 9, ДЗ-1, задание 2");

        Recipes recipe1 = new Recipes("Рецепт1");
        recipe1.addProductInRecipes(p1, 7);
        recipe1.addProductInRecipes(p2, 2);
        recipe1.addProductInRecipes(p3, 3);
        recipe1.addProductInRecipes(p4, 1);
        recipe1.addProductInRecipes(p5, 2);
        Recipes recipe2 = new Recipes("Рецепт2");
        recipe2.addProductInRecipes(p6, 3);
        recipe2.addProductInRecipes(p7, 3);
        recipe2.addProductInRecipes(p8, 3);
        Recipes recipe3 = new Recipes("Рецепт3");
        recipe3.addProductInRecipes(p9, 7);
        recipe3.addProductInRecipes(p10, 7);
        recipe3.addProductInRecipes(p11, 7);
        System.out.println(recipe1);
        System.out.println(recipe2);
        System.out.println(recipe3);

        Map<String, Recipes> recipeList = new HashMap<>();
        recipeList.put(recipe1.getName(), recipe1);
        recipeList.put(recipe2.getName(), recipe2);
        recipeList.put(recipe3.getName(), recipe3);
        System.out.println(recipeList);

        System.out.println("===========================================");

    }

}
