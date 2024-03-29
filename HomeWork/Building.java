package HomeWork;

import java.util.concurrent.ThreadLocalRandom;

public class Building extends Base implements HasHealthPoint {

    protected static int num = 0;
    private int maxHealthPoint = 100;
    private int currentHealthPoint;

    public Building(String name, int currentHealthPoint) {
        super(name);
        this.currentHealthPoint = currentHealthPoint;
        this.name = String.format("%s_%d", name, ++num);
    }

    public Building() {
        super("Building");
        this.currentHealthPoint = ThreadLocalRandom.current().nextInt(100);
        this.name = String.format("%s_%d", name, ++num);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }


    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

}
