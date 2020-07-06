public class BasicAirConditioner extends AirConditioner{

    public void cool(Room room) {
        if (room.temp > 20) {
            room.temp -= 1/room.size;
        }
    }
}
