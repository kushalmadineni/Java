import java.util.Scanner;
public class Prime {

			public static void main(String[] args) {
			int count=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to be check its a prime or not");
			int num = sc.nextInt();
			if(num<=0)
			{
			    System.out.println("Enter positive number");
			    
			}
			else{
			    for(int i=1;i<=num;i++){
			        if(num%i==0){
			           count++; 
			        }
			    }
			    if(count==2){
			        System.out.println("Given No. "+num+" is a Prime Numbeer");
				
			    }
			    else{
			        System.out.println("Given No. "+num+" is not a Prime Number");
			    }
			    
			}
			System.out.print("Divisors are : ");
			for(int i=1;i<=num;i++){
			        if(num%i==0){
			           System.out.print(i+" ");
			        }
			    }
			
			}

	}


