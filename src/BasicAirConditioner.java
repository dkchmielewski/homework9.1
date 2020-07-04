public class BasicAirConditioner {
    Room room;

    public BasicAirConditioner(Room room) {
        this.room = room;
    }

    public void cool(Room room) {
        if (room.temp > 20) {
            room.temp -= 1;
        }
    }

}
