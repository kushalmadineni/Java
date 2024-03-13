import java.util.Scanner;
public class Jag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][];
		a[0] = new int[3];
		a[1] = new int[4];
		a[2] = new int[2];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				
				a[i][j]=s.nextInt();
			}
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println(a[i][j]);
			}
		}
		

	}

}
