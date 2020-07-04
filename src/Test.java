public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(30, "13A", 10);
        BasicAirConditioner basicAirConditioner = new BasicAirConditioner(room1);
        System.out.println(room1.temp);
        basicAirConditioner.cool(room1);
        System.out.println(room1.temp);

        Room room2 = new Room(30, "13B", 10);
        ProAirConditioner proAirConditioner = new ProAirConditioner(room2);
        System.out.println(room2.temp);
        proAirConditioner.cool(room2);
        System.out.println(room2.temp);

    }
}
