public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        Item coke = new Item("drink", "coke", 1.50);
//
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Topping", "avacado", 1.50);
//        avacado.printItem();
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
////        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
////        regularMeal.setDrinkSize("LARGE");
////        regularMeal.printItemizedList();
//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up","chili");
        deluxeMeal.addBurgerToppings("AVACADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();


    }
}