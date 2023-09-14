import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number:");
            int in=scanner.nextInt();
            sum+=in;
        }
        double avg=sum/5.0;
        System.out.print("Sum:"+ sum +", Average: "+ avg);

    }
}