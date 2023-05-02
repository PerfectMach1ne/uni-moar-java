public class ThreadException {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

//        thread.run();
        thread.start();
    }
}
