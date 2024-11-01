public class QueuingSystem {
    private static QueuingSystem instance;
    private int queueNumber = 10;

    private QueuingSystem() {

    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized int getCurrentQueueNumber() {
        return queueNumber;
    }

    public synchronized int getNextQueueNumber() {
        queueNumber++;
        return queueNumber;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= 0) {
            queueNumber = newQueueNumber;
            System.out.println("\nQueue Number reset to: " + newQueueNumber);
        }
    }
}
