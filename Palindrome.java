import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num,rem,rev=0;
        System.out.println("Enter a input number");
        num= s.nextInt();
        int temp = num;
        while(temp>0) {
        	rem =  temp%10;
        	rev = rev*10+rem;
        	temp = temp/10;
        	
        }
        if(rev==num) {
        System.out.println(num+"Is a palindrome");
        }
        else
        {
        	System.out.println(num+"Is not a palindrome");
        	
        }
        
	}

}
