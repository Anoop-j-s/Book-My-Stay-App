public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        AddOnServiceManager serviceManager = new AddOnServiceManager();

        String reservationId = "Single-1";

        serviceManager.addService(reservationId, new Service("Breakfast", 500.0));
        serviceManager.addService(reservationId, new Service("Airport Pickup", 1000.0));

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + serviceManager.calculateTotalServiceCost(reservationId));
    }
}