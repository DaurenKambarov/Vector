class FastFood{
    public static void main(String[] args){
        Burger burger = new Burger();
        System.out.println("Cost:" + burger.cost() + "$" + "\n" +
                "Your Burger: " + burger.Discription() + "\n" + burger.recomendations());

        BigMac bigmac = new BigMac(burger);
        System.out.println("Cost:" + bigmac.cost() + "$" + "\n" +
                "Your Burger: " + bigmac.Discription() + "\n" + bigmac.recomendations());

        BaconBurger baconBurger = new BaconBurger(burger);
        System.out.println("Cost:" + baconBurger.cost() + "$" + "\n" +
                "Your Burger: " + baconBurger.Discription() + "\n" + baconBurger.recomendations());
    }
}
