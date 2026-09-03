package lab.jvm;

public class StackOverflowTest {

    public static void recursion(int counter){
        long long1 = 100000000;
        long long2 = 100000000;
        long long3 = 100000000;
        long long4 = 100000000;
        long long5 = 100000000;
        counter++;
        System.out.println("Current counter is: " + counter);
        recursion(counter);
    }

    public static void main(String[] args){
        recursion(0);

    }
}