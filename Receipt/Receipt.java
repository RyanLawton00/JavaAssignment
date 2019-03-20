package Receipt;

import Food.Food;
import Theatre.Theatre;

import java.util.ArrayList;

public class Receipt {
    private Theatre theatre;
    private ArrayList<Food> foods = new ArrayList<Food>();
    private int tickets;
    private double total;
    private String paymentMethod;

    public Receipt(Theatre theatre) {
        this.theatre = theatre;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public void addFood(Food food){
        this.foods.add(food);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "theatre=" + theatre +
                ", foods=" + foods +
                ", tickets=" + tickets +
                ", total=" + total +
                '}';
    }
}
