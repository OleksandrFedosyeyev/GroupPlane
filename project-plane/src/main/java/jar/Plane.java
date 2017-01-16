package jar;

import java.util.Objects;

public abstract class Plane {

    private String name;
    private int maxFuelCapacity;
    private int fuelConsumption;
    private int maxDistance;

    public Plane(String name, int maxFuelCapacity,int maxDistance) {
        this.name = name;
        this.maxFuelCapacity = maxFuelCapacity;
        this.maxDistance = maxDistance;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return maxFuelCapacity == plane.maxFuelCapacity &&
                Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxFuelCapacity);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", maxFuelCapacity=" + maxFuelCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
