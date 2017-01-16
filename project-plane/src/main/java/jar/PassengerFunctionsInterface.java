package jar;

interface PassengerFunctionsInterface {
    int ONE_PASS = 80;           // kg/person
    int ONE_LUGGAGE = 20;        // kg/luggage
    double RATE_OF_RETURN = 0.8;
    int MIN_DISTANCE = 100;

    void checkPassengers(int numberOfUserPassengers);

}
