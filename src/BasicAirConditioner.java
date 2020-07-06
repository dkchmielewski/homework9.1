public class BasicAirConditioner extends AirConditioner{

    public void cool(Room room) {
        final int ROOMTEMP = 20;
        final int TEMPCOOL = 1;
        if (room.temp > ROOMTEMP) {
            room.temp -= TEMPCOOL/room.size;
        }
    }
}
