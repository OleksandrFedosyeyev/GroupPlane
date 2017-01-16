package jar;

public class Army extends Plane {

    private int armor;
    private int ammunition;
    private int targetType;
    private int amountOfFuel;
    private DoArmy doArmy = new DoArmy();
    private Target target = new Target(targetType);

    public Army(String name, int tankCapacity, int consumption, int targetType, int distance) {
        super.setName(name);
        super.setMaxFuelCapacity(tankCapacity);
        this.amountOfFuel = doArmy.setFuel(tankCapacity);
        super.setFuelConsumption(consumption);
        this.targetType = targetType;
        super.setMaxDistance(distance);
        this.ammunition = doArmy.setAmmunition(targetType);
        this.armor = doArmy.setArmor(targetType);
        doArmy.start(armor, target.gettAmmunition(), ammunition, target.gettArmor(), doArmy.isGood(distance, amountOfFuel, getFuelConsumption()));
    }

    public int getTargetType() {
        return targetType;
    }

    public int getArmor() {
        return armor;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }


}
