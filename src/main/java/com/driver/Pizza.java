package com.driver;

public class Pizza {

    private int price;
    Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;

    private Boolean isCheeseAdded;
    private Boolean isToppingAdded;
    private Boolean isTakeAwayAdded;
    private Boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded= false;
        this.isToppingAdded= false;
        this.isTakeAwayAdded= false;

        this.cheesePrice = 80;
        this.toppingPrice = 20;

        if(isVeg== true) {
            this.price= 300;
            this.toppingPrice = 70;
        }
        else{
            this.price= 400;
            this.toppingPrice = 120;
        }
        this.bill= "Base Price Of The Pizza: " +this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded== false) {
            this.price= this.price+ this.cheesePrice;
            isCheeseAdded= true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded== false) {
            this.price= this.price+ this.toppingPrice;
            isToppingAdded= true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded== false) {
            this.price= this.price+ this.takeAwayPrice;
            isTakeAwayAdded= true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated== false) {
            if(isCheeseAdded== true) {
                this.bill= this.bill +"Extra Cheese Added: "+ cheesePrice +"\n";
            }
            if(isToppingAdded== true) {
                this.bill= this.bill +"Extra Toppings Added: "+ toppingPrice +"\n";
            }
            if(isTakeAwayAdded== true) {
                this.bill= this.bill +"Paperbag Added: "+ takeAwayPrice +"\n";
            }
            this.bill= this.bill +"Total Price: " + this.price +"\n";
            isBillGenerated= true;
        }
        return this.bill;
    }
}
