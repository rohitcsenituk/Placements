package thread_in_java;

/**
 * Multi-task using multi-thread
 */

public class MultiTaskThread {
    public static void main(String[] args) {
        Alpha alpha = new Alpha("Alpha Thread");
        Beta beta = new Beta("Beta");
        alpha.start();
        beta.start();
    }
}

class Alpha extends Thread {

    Alpha(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Beta extends Thread {

    Beta(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
