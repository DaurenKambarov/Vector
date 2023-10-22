public class TravelManage {
    public static void main(String[] args){
        TravelToCountry.GettravelToCountry().transportManage("bus");
        TravelToCountry.GettravelToCountry().transportManage("PLANE");
        TravelToCountry.GettravelToCountry().transportPayment("card");
    }
}
