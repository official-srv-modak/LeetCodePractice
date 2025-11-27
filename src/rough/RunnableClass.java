package rough;

import java.io.IOException;

public class RunnableClass {

    static void testFunction(String threadName){
        for(int i = 0; i < 10; i++)
        {
            System.out.println(threadName+" : "+i+1);
        }
    }

    static boolean flag = true;


    public static void main(String[] args) {

        Object object = new Object();

        Runnable r1 = () ->{
            while(!flag);

            flag = true;
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Runnable 1"+" : "+(i+1));
            }
            flag = false;

        };

        Runnable r2 = new Runnable(){
            @Override
            public void run(){
                while(!flag);

                flag = true;
                for(int i = 0; i < 10; i++)
                {
                    System.out.println("Runnable 2"+" : "+(i+1));
                }
                flag = false;

            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        try{
            t1.start();
//            t1.join();
            t2.start();
//            t2.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
