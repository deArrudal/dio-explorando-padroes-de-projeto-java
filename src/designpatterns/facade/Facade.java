package designpatterns.facade;

import designpatterns.extras.crmsubsystem.CRMService;
import designpatterns.extras.postalcodesubsystem.PostalCodeAPI;

public class Facade {

    public void transferCustomer(String name, String postalCode) {
        String city = PostalCodeAPI.getInstance().returnCity(postalCode);
        String state = PostalCodeAPI.getInstance().returnState(postalCode);

        CRMService.createCustomer(name, postalCode, city, state);
    }
}
