public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numberOfIterations = 7;
        MostUselessBox firstBox = new MostUselessBox(numberOfIterations);
        startThreads(firstBox);
    }

    public static void startThreads(MostUselessBox firstBox) throws InterruptedException {
        UserOfBox userOfBox = new UserOfBox(firstBox);
        userOfBox.setName("Пользователь");
        userOfBox.start();
        ToyOfBox toyOfBox = new ToyOfBox(firstBox);
        toyOfBox.setName("Игрушка");
        toyOfBox.start();
        while (true) {
            if (userOfBox.isInterrupted()) {
                toyOfBox.interrupt();
                break;
            }
        }
    }

}
