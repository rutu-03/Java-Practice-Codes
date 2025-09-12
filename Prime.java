import java.util.Scanner;
public class Prime{
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();
      if(isPrime(Number)){
        System.out.println(Number+" iS Prime Number");
      }else{
        System.out.println(Number+" is not Prime Number");
       }
       sc.close();
    }
    public static boolean isPrime(int num){
      if(num<=1){
        return false;
      }
        for(int i=2 ; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
            }
            return true;
        }
    }

