public class Pizza {
    private int price;
    private  boolean veg;

    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int takeAwayPrice=30;

    private boolean isExtraCheese=false;
    private boolean isExtraTopping=false;
    private boolean isTakeAway=false;
    private int basePizzaPrice;


    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else {
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        isExtraCheese=true;
        this.price+=extraCheesePrice;
    }


    public void addExtraTopping(){
        isExtraTopping=true;
        this.price+=extraToppingPrice;

    }

    public void addTakeAway(){
       isTakeAway=true;
       this.price+=takeAwayPrice;
    }

    public void getBill(){
        System.out.println("----------Base Pizza Bill----------------");
        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10s%n", "Item", "Price");
        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10d%n", "Base Pizza Price", basePizzaPrice);

        if (isExtraCheese) {
            System.out.printf("%-25s | %-10d%n", "Extra Cheese Added", extraCheesePrice);
        }
        if (isExtraTopping) {
            System.out.printf("%-25s | %-10d%n", "Extra Topping Added", extraToppingPrice);
        }
        if (isTakeAway) {
            System.out.printf("%-25s | %-10d%n", "Take Away", takeAwayPrice);
        }

        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10d%n", "Subtotal", this.price);

        double gst = this.price * 0.21;
        System.out.printf("%-25s | %-10.2f%n", "GST (21%)", gst);

        double totalWithGst = this.price + gst;
        System.out.printf("%-25s | %-10.2f%n", "Total Bill with GST", totalWithGst);

    }


    public int getPrice() {
        return price;
    }

    public boolean isVeg() {
        return veg;
    }

    public int getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public int getExtraToppingPrice() {
        return extraToppingPrice;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public int getTakeAwayPrice() {
        return takeAwayPrice;
    }

    public boolean isExtraTopping() {
        return isExtraTopping;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    public int getBasePizzaPrice() {
        return basePizzaPrice;
    }
}
