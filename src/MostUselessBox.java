import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class MostUselessBox {
    private volatile boolean positionOfToggle;
    private int maxNumberOfIterations;
    private int numberOfIterations;

    public MostUselessBox(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
    }

    public void onPositionOfToggle() {
        this.positionOfToggle = true;
    }

    public void offPositionOfToggle() {
        this.positionOfToggle = false;
    }

    public void minusNumberOfIterations() {
        this.numberOfIterations--;
    }

    public boolean getPositionOfToggle() {
        return this.positionOfToggle;
    }

    public int getNumberOfIterations() {
        return this.numberOfIterations;
    }

    public int getMaxNumberOfIterations() {
        return this.maxNumberOfIterations;
    }

}
