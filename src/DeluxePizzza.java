public class DeluxePizzza extends Pizza{

    public DeluxePizzza(Boolean veg){

        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }

    @Override
    public void addExtraCheese() {
    }
    @Override
    public void addExtraTopping() {

    }

    @Override
    public void getBill() {
        System.out.println("----------Deluxe Pizza Bill--------------");
        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10s%n", "Item", "Price");
        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10d%n", "Base Pizza Price", super.getBasePizzaPrice());

        if (super.isExtraCheese()) {
            System.out.printf("%-25s | %-10d%n", "Extra Cheese Added", super.getExtraCheesePrice());
        }
        if (super.isExtraTopping()) {
            System.out.printf("%-25s | %-10d%n", "Extra Topping Added", super.getExtraToppingPrice());
        }
        if (super.isTakeAway()) {
            System.out.printf("%-25s | %-10d%n", "Take Away", super.getTakeAwayPrice());
        }

        System.out.println("-----------------------------------------");
        System.out.printf("%-25s | %-10d%n", "Subtotal", super.getPrice());

        double gst = super.getPrice() * 0.21;
        System.out.printf("%-25s | %-10.2f%n", "GST (21%)", gst);

        double totalWithGst = super.getPrice() + gst;
        System.out.printf("%-25s | %-10.2f%n", "Total Bill with GST", totalWithGst);

    }
}
