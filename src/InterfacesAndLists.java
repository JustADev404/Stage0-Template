import java.util.ArrayList;
import java.util.List;

interface IntakeSensor {
    double distanceMillimeters();
}

class BeamBreak implements IntakeSensor {
    @Override
    public double distanceMillimeters() {
        return 3.0;
    }
}

class LaserCAN implements IntakeSensor {
    @Override
    public double distanceMillimeters() {
        return 5.0;
    }
}

public class Pair<A, B> {
    private final A first;
    private final B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}

void main() {
    IntakeSensor beamBreak = new BeamBreak();
    IntakeSensor laserCAN = new LaserCAN();
    System.out.println(beamBreak.distanceMillimeters());
    System.out.println(laserCAN.distanceMillimeters());

    Pair<String, Integer> pair = new Pair<>("Robot", 254);
    System.out.println(pair.getFirst() + " " + pair.getSecond());

    List<String> subsystems = new ArrayList<>();
    subsystems.add("Drivetrain");
    subsystems.add("Intake");
    subsystems.add("Shooter");

    System.out.println(subsystems.size());

    for (int i = 0; i <= subsystems.size(); i++) {
        System.out.println(subsystems.get(i));
    }
}