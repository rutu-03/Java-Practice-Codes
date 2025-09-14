import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        String str = sc.nextLine();
        String Reversed ="";

        for(int i=0 ; i<str.length();i++){
            char ch = str.charAt(i);
            Reversed = ch+Reversed;
        }
        System.out.println("String Reversed is: "+Reversed);

        sc.close();
    }
    
}
