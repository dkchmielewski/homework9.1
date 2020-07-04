public class ProAirConditioner extends AirConditioner{
    public ProAirConditioner(Room room) {
        super(room);
    }

    public void cool(Room room) {
        if (room.temp > 20) {
            room.temp -= 2/room.size;
        }
    }

}
