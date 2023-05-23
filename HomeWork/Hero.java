package HomeWork;

import java.util.concurrent.ThreadLocalRandom;

public class Hero extends Base implements Tiredness, HasHealthPoint {

    protected static int num = 0;
    private int maxHealthPoint = 100;
    private int maxTiredness = 100;
    private int currentTiredness;
    private int currentHealthPoint;

    public Hero(String name, int currentHealthPoint, int currentTiredness) {
        super(name);
        this.currentHealthPoint = currentHealthPoint;
        this.currentTiredness = currentTiredness;
        this.name = String.format("%s_%d", name, ++num);
        this.currentTiredness = currentTiredness;

    }

    public Hero() {
        super("Hero");
        this.currentHealthPoint = ThreadLocalRandom.current().nextInt(100);
        this.currentTiredness = ThreadLocalRandom.current().nextInt(100);
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
    public int getMaxTiredness() {
        return maxTiredness;
    }

    @Override
    public int getCurrentTiredness() {

        return currentTiredness;
    }

    @Override
    public int getCurrentHealthPoint() {

        return currentHealthPoint;
    }

}
