package jar;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
class PassengerAirplane extends PassengerFunctions {
    @Getter
    private static int maxPass;
    private int maxLuggage;

    PassengerAirplane(String name, int id) {
        this.name = name;
        this.id = id;
        maxPass = super.maxPass();
        maxFuelCapacity = super.maxFuelCapacity();
        this.fuelConsumption = fuelConsumption();
        this.maxLuggage = maxPass * ONE_LUGGAGE;
        this.maxDistance = generateMaxDistance();
    }

    @Override
    public String toString() {
        return
                "PassengerAirplane{ " +
                        " id = " + id +
                        ", name = " + name +
                        ", maxFuelCapacity = " + maxFuelCapacity +
                        ", maxFuelConsumption = " + fuelConsumption +
                        ", maxPass=" + maxPass +
                        ", maxLuggage= " + maxLuggage +
                        ", maxDistance = " + maxDistance +
                        '}';
    }

}
