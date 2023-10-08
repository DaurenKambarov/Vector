public class BigMac implements BurgerDecaretor{
    private final Food food;
    public BigMac(Food food){
        this.food = food;
    }

    @Override
    public Double cost() {
        return food.cost() + 2.0;
    }
    @Override
    public String Discription() {
        return food.Discription() + " with 2 cutlets";
    }
    public String recomendations() {
        return food.recomendations() + " and naggets";
    }
}
