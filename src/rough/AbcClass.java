package rough;

public class AbcClass {

    static int n = 10;
    static Object lock = new Object();
//    static boolean isRunning = true;
    static Runnable r1 = new Runnable(){
        @Override
        public void run(){
            synchronized (lock){
                System.out.println("From thread t1");
            /*while(!isRunning);
            isRunning = true;*/
                for(int i = 0; i < n; i++)
                {
                    System.out.println(i);
                }
//            isRunning = false;
            }
        }
    };

    static Runnable r2 = new Runnable(){
        @Override
        public void run(){
            synchronized (lock){
                /*while(!isRunning);
            isRunning = true;*/
                System.out.println("From thread t2");
                for(int i = 0; i < n; i++)
                {
                    System.out.println(i);
                }
//            isRunning = false;
            }
        }
    };

    /*static Runnable r3 = () ->{
        synchronized (lock){
            *//*while(!isRunning);
        isRunning = true;*//*
            System.out.println("Hello from thread 3");
            for(int i = 0; i < n; i++)
            {
                System.out.println(i);
            }
//        isRunning = false;
        }
    };*/

    static Runnable r3 = new Runnable(){
        @Override
        public void run(){
            synchronized (lock){
//            while(!isRunning);
//                isRunning = true;*//*
                System.out.println("Hello from thread 3");
                for(int i = 0; i < n; i++)
                {
                    System.out.println(i);
                }
//        isRunning = false;
            }
        }
    };


    public static void main(String[] args) throws InterruptedException {
        FunctionalInt1 fnc = new FunctionalInt1(){
            @Override
            public void doSomething(String a){
                System.out.println("From ABC Class " + a);
            }
        };

        fnc.doSomething("Hello");
        FunctionalInt1 fnc1 = (s) -> {
            System.out.println("Hello "+ s);
        };

        fnc1.doSomething("Hello");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        t3.start();
//        t3.join();
    }
}
