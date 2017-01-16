package jar;

abstract class PassengerFunctions extends Plane implements PassengerFunctionsInterface {

    PassengerFunctions() {

    }

    int generateMaxDistance() {
        int fuelPerKm = 100;
        return (getMaxFuelCapacity() / getFuelConsumption()) * fuelPerKm;
    }

    public int fuelConsumption() {
        int maxFC = 382;
        int minFC = 320;
        return Util.generateRandom(minFC, maxFC);
    }

    public int maxFuelCapacity() {
        int maxFC = 26000;
        int minFC = 18000;
        return Util.generateRandom(minFC, maxFC);
    }

    static int maxPass() {
        int maxPass = 500;
        int minPass = 100;
        return Util.generateRandom(minPass, maxPass);
    }

    public void checkPassengers(int numberOfPassengers) {
        double rateOfReturn = 0.8;

        if (PassengerAirplane.getMaxPass() >= numberOfPassengers && numberOfPassengers >= rateOfReturn * PassengerAirplane.getMaxPass()) {
            System.out.println("check pass - Ok! ");
        } else if (numberOfPassengers > PassengerAirplane.getMaxPass()) {
            System.out.println("too many passengers ");
        } else if (numberOfPassengers < PassengerAirplane.getMaxPass()) {
            System.out.println("not enough passengers ");
        } else {
            System.out.println("something went wrong(( ");
        }
    }

}
