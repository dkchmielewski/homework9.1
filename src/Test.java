public class Test {
    public static void main(String[] args) {
        BasicAirConditioner basicAirConditioner = new BasicAirConditioner();
        Room room1 = new Room(30, "13A", 10, basicAirConditioner);
        System.out.println(room1.temp);
        basicAirConditioner.cool(room1);
        System.out.println(room1.temp);

        ProAirConditioner proAirConditioner = new ProAirConditioner();
        Room room2 = new Room(30, "13B", 10, proAirConditioner);
        System.out.println(room2.temp);
        proAirConditioner.cool(room2);
        System.out.println(room2.temp);

    }
}
