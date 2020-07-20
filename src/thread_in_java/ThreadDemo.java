package thread_in_java;

public class ThreadDemo extends Thread {

    public static void main(String[] args) {

        //Single thread and single task
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("Rohit");
        threadDemo.setPriority(Thread.MAX_PRIORITY);
        threadDemo.start();
        //Multi thread and single task
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo1.setPriority(Thread.MIN_PRIORITY);
        threadDemo1.setName("Shubham");
        threadDemo1.start();
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Hello world " + Thread.currentThread());
    }
}
