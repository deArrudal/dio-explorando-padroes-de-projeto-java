package designpatterns.extras.crmsubsystem;

public class CRMService {

    private CRMService() {
        super();
    }

    public static void createCustomer(String name, String postalCode, String city, String state) {
        System.out.println("customer data has been saved in CRM.");
        System.out.println(name + ", " + postalCode + ", " + city + ", " + state);
    }
}
