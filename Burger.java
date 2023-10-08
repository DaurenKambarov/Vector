public class Burger implements Food{
    @Override
    public Double cost() {
        return 5.0;
    }

    @Override
    public String Discription() {
        return "Burger";
    }
    @Override
    public String recomendations() {
        return "Good with: Coca Cola";
    }
}
