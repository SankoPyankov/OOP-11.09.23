public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    void start() {
        System.out.println(brand + " started");
    }
    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
}
