public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        int singleAvailable = 5;

        Room doublRoom = new DoubleRoom();
        int doubleAvailable = 3;

        Room suite = new SuiteRoom();
        int suiteAvailable = 2;

        System.out.println("Hotel Room Initialization");

        System.out.println("\nSingle Room:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        doublRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}