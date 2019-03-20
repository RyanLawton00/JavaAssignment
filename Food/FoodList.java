package Food;

import java.util.ArrayList;

public class FoodList {

    public FoodList() {

    }

    private static ArrayList<Food> foods = new ArrayList<Food>();
    public static void initializeFoods(){
        foods.add(new Food(2,"Chips"));
        foods.add(new Food(3, "PopCorn"));
        foods.add(new Food(2, "Coke"));
        foods.add(new Food(2,"Tango"));
        foods.add(new Food(1, "Skittles"));
        foods.add(new Food(2, "Haribos"));
    }

    public static ArrayList<Food> getFoods() {
        return foods;
    }
}
