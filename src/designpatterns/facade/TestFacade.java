package designpatterns.facade;

public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.transferCustomer("john smith", "048-452");
    }
}
