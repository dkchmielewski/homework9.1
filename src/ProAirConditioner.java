public class ProAirConditioner {
    Room room;

    public ProAirConditioner(Room room) {
        this.room = room;
    }

    public void cool(Room room) {
        if (room.temp > 20) {
            room.temp -= 2;
        }
    }

}
