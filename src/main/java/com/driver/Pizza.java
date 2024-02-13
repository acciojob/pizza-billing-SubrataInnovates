package com.driver;

public class Pizza {

    private int basePrice;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400; // Setting base price based on whether pizza is veg or non-veg
    }

    public int getPrice() {
        return this.basePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            this.basePrice += 80; // Adding extra cheese price
        }
        System.out.println("Extra Cheese Added: " + this.basePrice);
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            this.basePrice += isVeg ? 70 : 120; // Adding extra toppings price based on veg or non-veg pizza
        }
        System.out.println("Extra Toppings Added: " + this.basePrice);
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            takeawayAdded = true;
            this.basePrice += 20; // Adding paper bag price for takeaway
        }
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(this.basePrice).append("\n");
        if (extraCheeseAdded)
            bill.append("Extra Cheese Added: 80\n");
        if (extraToppingsAdded)
            bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        if (takeawayAdded)
            bill.append("Paperbag Added: 20\n");
        bill.append("Total Price: ").append(getPrice()).append("\n");
        return bill.toString();
    }
}
