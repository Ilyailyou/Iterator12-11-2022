import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int max, min;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    public int getRandomNumber() {
        return random.nextInt(max - min + 1) + min;

    }


    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(this);
    }
}
