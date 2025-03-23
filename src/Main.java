public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.5);
//        coke.setSize("SMALL");
//        coke.printItem();
//        coke.setSize("MEDIUM");
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//        coke.setSize("SMALL");
//        coke.printItem();

//        Burger burger = new Burger("regular", 4);
//        burger.addToppings("BACON","CHEESE", "MAYO");
//        burger.printItem();
//
//        Burger burger2 = new Burger("cheesburger", 4);
//        burger.addToppings("BACON","AVOCADO","BACON");
//        burger.printItem();

        MealOrder regularMeal2 = new MealOrder();
        regularMeal2.printItemizedList();

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();


    }
}
