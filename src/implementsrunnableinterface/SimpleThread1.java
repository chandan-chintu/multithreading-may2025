package implementsrunnableinterface;

public class SimpleThread1 implements Runnable{

    public SimpleThread1(){
        Thread thread1 = new Thread(this,"SimpleThread1");
        thread1.start();
    }

    @Override
    public void run() {
        try{
            System.out.println("part1 - printing the numbers in ascending order 1-10");
            for (int i=1;i<=10;i++){
                System.out.println("i value is : "+i);
                Thread.sleep(5);
            }
        } catch (Exception e){
            System.out.println("some exception occurred : "+e.getMessage());
        }
    }
}
