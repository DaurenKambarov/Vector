import java.util.Scanner;

public class Card implements Payment {
    public String type_of_transport;

    @Override
    public void payment() {
        System.out.println("Please choose type of your transport: ");
        Scanner scan = new Scanner(System.in);
        type_of_transport = scan.nextLine();
        if (type_of_transport.toLowerCase().equals("plane")) {
            System.out.println("Pay 300$");
        }
        else if (type_of_transport.toLowerCase().equals("bus")) {
            System.out.println("Pay 100$");
        }
        else if (type_of_transport.toLowerCase().equals("train")) {
            System.out.println("Pay 75$");
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
