package designpatterns.extras.postalcodesubsystem;

public class PostalCodeAPI {

    private static PostalCodeAPI instance = new PostalCodeAPI();

    private PostalCodeAPI() {
        super();
    }

    public static PostalCodeAPI getInstance() {
        return instance;
    }

    public String returnCity(String postalCode) {
        return "são josé dos campos";
    }

    public String returnState(String postalCode) {
        return "são paulo";
    }
}
