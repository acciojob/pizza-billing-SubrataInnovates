package com.driver;

public class Pizza {

    private int basePrice;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
    }

    public int getPrice() {
        return basePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            basePrice += 80; // Adding extra cheese price
           // System.out.println("Extra Cheese Added: " + 80);
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            basePrice += isVeg ? 70 : 120; // Adding extra toppings price
            //System.out.println("Extra Toppings Added: " + (isVeg ? 70 : 120));
        }
    }

    public void addTakeaway() {
        if (!paperBagAdded) {
            paperBagAdded = true;
            basePrice += 20; // Adding paper bag price
            //System.out.println("Paperbag Added: " + 20);
        }
    }

    public String getBill() {
        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("Base Price Of The Pizza: ").append(getPrice()).append("\n");
        if (extraCheeseAdded) {
            billBuilder.append("Extra Cheese Added: ").append(80).append("\n");
        }
        if (extraToppingsAdded) {
            billBuilder.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }
        if (paperBagAdded) {
            billBuilder.append("Paperbag Added: ").append(20).append("\n");
        }
        billBuilder.append("Total Price: ").append(basePrice).append("\n");
        return billBuilder.toString();
    }
}
