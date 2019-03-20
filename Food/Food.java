package Food;

public class Food {
    private int price;
    private String foodName;

    public Food(int price, String foodName) {
        this.price = price;
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return " " + foodName + ",  £" + price;
    }
}
