import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class UserOfBox extends Thread {
    private final int FREQUENCY_OF_INCLUSION = 1_000;
    private MostUselessBox mostUselessBox;
    private int cout;

    public UserOfBox(MostUselessBox mostUselessBox) {
        this.mostUselessBox = mostUselessBox;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                if (!mostUselessBox.getPositionOfToggle()) {
                    mostUselessBox.onPositionOfToggle();
                    cout++;
                    System.out.println(Thread.currentThread().getName() + ": я '" + cout + "' раз включил тумблер!");
                    mostUselessBox.minusNumberOfIterations();
                    Thread.sleep(FREQUENCY_OF_INCLUSION);
                    if (mostUselessBox.getNumberOfIterations() == 0) {
                        interrupt();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
