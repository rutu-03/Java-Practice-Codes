import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the NUmber: ");
       int num = sc.nextInt(); 
       int original = num;
       int sum = 0;

       while(num>0){
        int digit = num%10;
        sum += digit*digit*digit;
        num = num /10;
       }
       if(original == sum){
        System.out.println(original+" is a Armstrong Number");
       }else{
        System.out.println(original+" is not Armstrong Number");
       }
       sc.close();
    }
}
