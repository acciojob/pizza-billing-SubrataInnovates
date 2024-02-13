package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean hasExtraCheese;
    private boolean hasExtraToppings;
    private boolean isTakeaway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = "";
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.isTakeaway = false;
    }

    public int getPrice() {
        return price;
    }

    public void addExtraCheese() {
        if (!hasExtraCheese) {
            price += 80;
            hasExtraCheese = true;
            bill += "Extra Cheese Added: ₹" + 80 + "\n";
        }
    }

    public void addExtraToppings() {
        if (!hasExtraToppings) {
            price += isVeg ? 70 : 120;
            hasExtraToppings = true;
            bill += "Extra Toppings Added: ₹" + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway() {
        if (!isTakeaway) {
            price += 20;
            isTakeaway = true;
            bill += "Paperbag Added: ₹" + 20 + "\n";
        }
    }

    public String getBill() {
        bill += "Base Price Of The Pizza: ₹" + price + "\n";
        return bill;
    }
}
