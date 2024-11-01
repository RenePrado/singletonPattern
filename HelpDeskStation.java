public class HelpDeskStation {
    public static void main(String[] args) {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        System.out.println("Serving Customer with Queue Number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving Customer with Queue Number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving Customer with Queue Number: " + queuingSystem.getNextQueueNumber());

        queuingSystem.resetQueueNumber(5);

        System.out.println("\nServing Customer with Queue Number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving Customer with Queue Number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving Customer with Queue Number: " + queuingSystem.getNextQueueNumber());

        System.out.println("\nCurrent Queue Number: " + queuingSystem.getCurrentQueueNumber());
    }
}
