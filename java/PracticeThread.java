public class PracticeThread {
    public static void main(String[] args) {
        System.out.println("1");

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                   }     
                }
            }
        }).start();
        System.out.println("2");
    }
    
}
