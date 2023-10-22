public class TravelToCountry{
    private static TravelToCountry travel;
    public static TravelToCountry GettravelToCountry(){
        if(travel == null){
            travel = new TravelToCountry();
        }
        return travel;
    }
    travelWithBus travelwithBus = new travelWithBus();
    travelWithPlane travelwithPlane = new travelWithPlane();
    travelWithTrain travelwithTrain = new travelWithTrain();
    Card card = new Card();
    public void transportManage(String transport_type){
        switch (transport_type.toLowerCase()){
            case "bus":
                travelwithBus.transport();
                break;
            case "plane":
                travelwithPlane.transport();
                break;
            case "train":
                travelwithTrain.transport();
        }
    }
    public void transportPayment(String payment_choice){
        switch (payment_choice.toLowerCase()){
            case "card":
                card.payment();
        }
    }
}
