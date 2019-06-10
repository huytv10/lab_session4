import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Room room = new Room("One", "VN", new ArrayList<>());

        addUser(room, "huy");
        addUser(room, "to");
        deleteUser(room, "huy");
        System.out.println("Location: " + room.getLocation()
                + " , room name: " + room.getRoomName());
        System.out.print("User list: ");
        room.getUserList().forEach(e -> System.out.print(e + " "));
    }

    static void addUser(Room room, String user) {
        room.getUserList().add(user);
        System.out.println("Add done");
    }

    static void deleteUser(Room room, String user) {
        room.getUserList().remove(user);
        System.out.println("Delete done");
    }
}
