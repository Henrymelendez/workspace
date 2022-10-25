package encapsulation;

public class MyPizzaHouse {



    public void makePizza(){
        prepare();
        addToppings();
        bake();
    }

    private void prepare(){

        System.out.println("Preparing the pizza");
    }

    private void addToppings(){

        System.out.println("Adding Toppings!");
    }

    private void bake(){

        System.out.println("Baking the pizza");
    }


}
