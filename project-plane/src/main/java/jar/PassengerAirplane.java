package jar;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
class PassengerAirplane extends PassengerFunctions {
    @Getter
    private static int maxPass;
    private int id;

    PassengerAirplane(String name, int id) {
        super.setName(name);
        this.id = id;
        this.maxPass = maxPass();
        super.setMaxFuelCapacity(maxFuelCapacity());
        super.setFuelConsumption(fuelConsumption());
        super.setMaxDistance(generateMaxDistance());
    }

    @Override
    public String toString() {
        return super.toString()+
                "maxPass" + maxPass +
                "id=" + id +
                '}';
    }

}
