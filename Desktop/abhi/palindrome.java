import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n, rnum = 0, remainder;
        Scanner Sc =new Scanner(System.in);
        n=Sc.nextInt();
        int num = n;
        while (num != 0) {
          remainder = num % 10;
          rnum = rnum * 10 + remainder;
          num /= 10;
        }
        if (num == rnum) {
          System.out.println(num + " is Palindrome.");
        }
        else {
          System.out.println(num+ " is not Palindrome.");
        }
      }
    
}
