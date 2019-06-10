import java.util.List;

public class Room {
    String roomName;
    String location;
    List<String> userList;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public Room() {
    }

    public Room(String roomName, String location, List<String> userList) {
        this.roomName = roomName;
        this.location = location;
        this.userList = userList;
    }
}
