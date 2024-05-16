public abstract class AbstractCar {
    public abstract void drive();

    public String color;
}

class WagonR extends AbstractCar {
    public void drive() {
        System.out.println("car is drive");
    }

}

class Demo {
    public static void main(String[] args) {
        WagonR w = new WagonR();
        w.color = "green";
        System.out.println(w.color);
        w.drive();
    }
}