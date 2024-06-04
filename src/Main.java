public class Main {
    public static void main(String[] args) {

//      Pizza basepizza=new Pizza(false);
//      basepizza.addExtraCheese();
//      basepizza.addExtraTopping();
//      basepizza.addTakeAway();
//      basepizza.getBill();


      DeluxePizzza deluxePizza = new DeluxePizzza(false);
      deluxePizza.addTakeAway();

      deluxePizza.getBill();
    }
}