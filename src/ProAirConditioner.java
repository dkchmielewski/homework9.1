public class ProAirConditioner extends AirConditioner{

    @Override
    public void cool(Room room) {
        final int ROOMTEMP = 20;
        final int TEMPCOOL = 2;
        if (room.temp > ROOMTEMP) {
            room.temp -= TEMPCOOL/room.size;
        }
    }


}
