public class BaconBurger implements BurgerDecaretor{
    private final Food food;
    public BaconBurger(Food food){
        this.food = food;
    }

    @Override
    public Double cost() {
        return food.cost() + 2.5;
    }

    @Override
    public String Discription() {
        return " with becon, it's delicious. Warning: Not Halal !";
    }

    @Override
    public String recomendations() {
        return "Good with Coca Cola and naggets";
    }
}
