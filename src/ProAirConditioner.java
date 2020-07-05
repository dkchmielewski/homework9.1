public class ProAirConditioner extends AirConditioner{

    @Override
    public void cool(Room room) {
        if (room.temp > 20) {
            room.temp -= 2/room.size;
        }
    }


}
