public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.brand = "Mazda";
        mazda.horsePower = 198;
        mazda.isAwd = false;

        mazda.start();
        mazda.setAcceleration(20);

        System.out.println(mazda.acceleration);
    }
}
