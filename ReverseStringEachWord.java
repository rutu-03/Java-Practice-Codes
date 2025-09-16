import java.util.Scanner;
public class ReverseStringEachWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String [] words =str.split(" ");

        String result ="";

        for(int i = 0 ; i< words.length ; i++){
            String word = words[i];
            String reverse = "";

            for(int j=0; j< word.length();j++){
                char ch = word.charAt(j);
                 reverse = ch + reverse;
            }
           result = result+ reverse +" ";

        }
        System.out.println("String Reversed: "+result);


        sc.close();

    }
}