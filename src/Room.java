public class Room {
    double temp;
    String name;
    double size;
    AirConditioner airConditioner;

    public Room(double temp, String name, double size, AirConditioner airConditioner) {
        this.temp = temp;
        this.name = name;
        this.size = size;
        this.airConditioner = airConditioner;
    }

}
