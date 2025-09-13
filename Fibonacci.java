import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int range = sc.nextInt();
        int first = 0, second = 1;

        System.out.print("Fibonacci series up to "+range+": ");

        System.out.print(first+" "+second+" ");

        int next = first+second;
        while(next<=range){
            System.out.print(next+" ");
            first = second;
            second = next;
            next = first+second;
        }
        sc.close();
    }
}
