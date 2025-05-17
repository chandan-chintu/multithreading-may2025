package beforemultithreading;

public class DemoClass {
    public static void main(String[] args) {

        System.out.println("part1 printing the numbers in ascending order 1-10");
        for(int i=1;i<=10;i++){
            System.out.println(" i value is : "+i);
        }

        System.out.println("part2 printing the numbers in descending order 10-1");
        for(int j=10;j>=1;j--){
            System.out.println(" j value is : "+j);
        }
    }
}
