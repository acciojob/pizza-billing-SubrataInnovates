package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            price += isVeg ? 70 : 120;
        }
    }

    public void addTakeaway(){
        if (!paperBagAdded) {
            paperBagAdded = true;
            price += 20;
        }
    }

    public String getBill(){
        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("Base Price Of The Pizza: ").append(getPrice()).append("\n");
        if (extraCheeseAdded) {
            billBuilder.append("Extra Cheese Added: 80\n");
        }
        if (extraToppingsAdded) {
            billBuilder.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }
        if (paperBagAdded) {
            billBuilder.append("Paperbag Added: 20\n");
        }
        billBuilder.append("Total Price: ").append(price).append("\n");
        return billBuilder.toString();
    }
}

