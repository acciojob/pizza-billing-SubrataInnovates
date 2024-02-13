package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=isVeg ? 300:400;
    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded)
        {
            extraCheeseAdded=true;
            this.price+=80;

        }
        System.out.println("Extra Cheese Added: "+this.price);

    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded)
        {
            extraToppingsAdded=true;
            this.price+=isVeg?70:120;
        }
        System.out.println("Extra Toppings Added: "+price);
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeawayAdded)
        {
            takeawayAdded=true;
            this.price+=20;
        }

    }

    public String getBill(){
        // your code goes here
        StringBuilder bill=new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(this.price).append("\n");
        if(extraCheeseAdded)
            bill.append("Extra Cheese Added: 80\n");
        if(extraToppingsAdded)
            bill.append("Extra Toppings Added: ").append(isVeg?70:120).append("\n");
        if (takeawayAdded)
            bill.append("Paperbag Added: 20\n");

        bill.append("Total Price: ").append(getPrice()).append(("\n"));
        return bill.toString();
    }
}
