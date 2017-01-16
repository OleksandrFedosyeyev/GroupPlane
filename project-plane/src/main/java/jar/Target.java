package jar;

public class Target {
    private int type;
    private int tArmor;
    private int tAmmunition;

    Target(int type) {
        this.type = type;
        this.tArmor = (int) (Math.random() * 10 * type);
        this.tAmmunition = (int) (Math.random() * 2 * type);
    }

    public int getType() {
        return type;
    }

    public int gettArmor() {
        return tArmor;
    }

    public int gettAmmunition() {
        return tAmmunition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Target target = (Target) o;

        if (type != target.type) return false;
        if (tArmor != target.tArmor) return false;
        return tAmmunition == target.tAmmunition;
    }

    @Override
    public int hashCode() {
        int result = type;
        result = 31 * result + tArmor;
        result = 31 * result + tAmmunition;
        return result;
    }

    @Override
    public String toString() {
        return "Target{" +
                "type=" + type +
                ", tArmor=" + tArmor +
                ", tAmmunition=" + tAmmunition +
                '}';
    }
}
