public class UseCase4RoomSearch {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomSearchService searchService = new RoomSearchService();

        System.out.println("Room Search");
        searchService.searchAvailableRooms(inventory, single, doubleRoom, suite);
    }
}