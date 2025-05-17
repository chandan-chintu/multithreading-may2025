package extendsthreadclass;

public class DemoThread extends Thread{

    public DemoThread(){
        start(); // it will start the thread
    }

    @Override
    public void run() { // it starts running or executing the thread
        try {
            System.out.println("Part2 - printing the numbers in descending order 10-1");
            for (int j = 10; j >= 1; j--) {
                System.out.println("j value is : " + j);
                Thread.sleep(5); // it will go for sleep for 0.005s
            }
        } catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage());
        }
    }
}
