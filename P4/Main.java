class TrafficLight {
    private String color;
    private final String lightId;

    public TrafficLight(String lightId) {
        this.lightId = lightId;
        this.color = "RED";
    }

    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public String getLightId() {
        return lightId;
    }
}

public class Main {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");

        System.out.println("Initial color: " + t.getColor());

        t.next();
        System.out.println("After next(): " + t.getColor());

        t.next();
        System.out.println("After next(): " + t.getColor());

        t.next();
        System.out.println("After next(): " + t.getColor());
    }
}
