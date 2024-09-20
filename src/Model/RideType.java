package Model;

// RideType.java
public enum RideType {
    CARPOOL(0.5),
    LUXURY(2.0),
    BIKE(0.8);

    private double fareMultiplier;

    RideType(double fareMultiplier) {
        this.fareMultiplier = fareMultiplier;
    }

    public double getFareMultiplier() {
        return fareMultiplier;
    }
}
