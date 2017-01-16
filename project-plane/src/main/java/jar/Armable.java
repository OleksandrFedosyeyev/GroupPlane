package jar;

public interface Armable {

    public int setFuel(int capacity);
    public boolean isGood(int distance, int fuel, int consumption);
    public int setArmor(int targetType);
    public int setAmmunition(int targetType);

}
