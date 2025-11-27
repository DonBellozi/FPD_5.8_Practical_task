package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("vo_hw is running");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException ignored) {}
    }
}
