import java.util.concurrent.atomic.AtomicBoolean;

public class ToyOfBox extends Thread {
    private MostUselessBox mostUselessBox;
    private int count;

    public ToyOfBox(MostUselessBox mostUselessBox) {
        this.mostUselessBox = mostUselessBox;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (mostUselessBox.getPositionOfToggle()) {
                mostUselessBox.offPositionOfToggle();
                count++;
                System.out.println(Thread.currentThread().getName() + ": а я в '" + count + "' раз выключила!!!");
            }
        }
    }
}
