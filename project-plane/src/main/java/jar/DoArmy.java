package jar;

public class DoArmy implements Armable{

    public int setFuel(int capacity) {
        return (int)(Math.random()*capacity);
    }

    public int setArmor(int targetType) {
        return (int) (Math.random() * 2 * targetType);
    }

    public int setAmmunition(int targetType) {
        return (int) (Math.random() * 10 * targetType);
    }

    public boolean isGood(int distance, int fuel, int consumption) {
        return (distance<=fuel/consumption);
    }

    public void start(int armor, int tAmmunition, int ammunition, int tArmor, boolean good) {
        if (armor > tAmmunition && ammunition > tArmor) {
            System.out.print("Your plane destroy target ");
            if (good) {
                System.out.println("and reached the destination.");
            } else {
                System.out.println("and crashed due to lack of fuel.");
            }
        } else {
            System.out.println("Your plane was destroyed by enemy.");
        }
    }
}
